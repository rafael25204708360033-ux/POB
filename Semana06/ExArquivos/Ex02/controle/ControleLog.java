package Semana06.ExArquivos.Ex02.controle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class ControleLog {
    public static void main(String[] args) {
        Path caminhoLog = Path.of("servidor.log");

        try {
            String conteudoTeste = """
                     Servidor iniciado na porta 8080
                     Falha de conexao com o banco de dados
                     Memoria acima de 80%
                     Timeout no banco de dados secundario
                     Requisicao processada em 12ms
                     NullPointerException na camada de servico
                    """;
            Files.writeString(caminhoLog, conteudoTeste, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            
            try (Stream<String> linhas = Files.lines(caminhoLog)) {
                List<String> erros = linhas
                        .filter(linha -> linha.startsWith("[ERROR]"))
                        .map(linha -> linha.replace("[ERROR] ", "").trim())
                        .toList();

                System.out.println("=== RELATORIO DE ERROS ENCONTRADOS ===");
                System.out.println("Total de erros: " + erros.size());
                System.out.println("--------------------------------------");
                erros.forEach(mensagem -> System.out.println("-> " + mensagem));
            }

        } catch (IOException e) {
            System.err.println("Erro de I/O ao processar arquivo de log: " + e.getMessage());
        }
    }
}
