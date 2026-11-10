package Semana06.ExArquivos.Ex05.controle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class ControlePipelineIO {

    
    private static String formatarNome(String nome) {
        String[] partes = nome.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String parte : partes) {
            if (!parte.isEmpty()) {
                sb.append(Character.toUpperCase(parte.charAt(0)))
                  .append(parte.substring(1))
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Path origem = Path.of("clientes_bruto.txt");
        Path destino = Path.of("clientes_padronizado.txt");

        try {
            
            String bruto = """
                     carlos edualdo  
                    
                       MARIANA  SILVA  
                    rafael conceição 
                       
                      beatriz  souza  
                    """;
            Files.writeString(origem, bruto, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            
            List<String> clientesTratados;
            try (Stream<String> linhas = Files.lines(origem)) {
                clientesTratados = linhas
                        .map(String::trim)
                        .filter(line -> !line.isBlank())
                        .map(ControlePipelineIO::formatarNome)
                        .toList();
            }

            
            Files.write(destino, clientesTratados, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("=== PIPELINE DE I/O CONCLUIDO ===");
            System.out.println("Arquivo bruto processado: " + origem.toAbsolutePath());
            System.out.println("Arquivo tratado gravado: " + destino.toAbsolutePath());
            System.out.println("\nConteudo do arquivo gerado:");
            clientesTratados.forEach(c -> System.out.println("  - " + c));

        } catch (IOException e) {
            System.err.println("Erro no pipeline de I/O: " + e.getMessage());
        }
    }
}