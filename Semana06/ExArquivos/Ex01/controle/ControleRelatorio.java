package Semana06.ExArquivos.Ex01.controle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControleRelatorio {
    public static void main(String[] args) {
        Path diretorio = Path.of("dados", "relatorios");
        Path arquivo = diretorio.resolve("sumario.txt");

        try {
            
            if (Files.notExists(diretorio)) {
                Files.createDirectories(diretorio);
                System.out.println("Diretorio criado: " + diretorio.toAbsolutePath());
            }

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            String conteudo = """
                    ========================================
                    RELATORIO DE EXECUCAO DO SISTEMA
                    ========================================
                    Data/Hora de Geracao: %s
                    Status: Executado com Sucesso
                    Ambiente: Desenvolvinento (Java NIO.2)
                    ========================================
                    """.formatted(timestamp);

            Files.writeString(arquivo, conteudo, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo criado/atualizado com sucesso em: " + arquivo.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Erro ao manipular arquivos: " + e.getMessage());
        }
    }
}
