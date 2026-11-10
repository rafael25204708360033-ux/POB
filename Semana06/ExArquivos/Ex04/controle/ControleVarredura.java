package Semana06.ExArquivos.Ex04.controle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ControleVarredura {
    public static void main(String[] args) {
        
        Path pastaRaiz = Path.of(".");

        System.out.println("=== VARREDURA DE ARQUIVOS JAVA NO PROJETO ===");

        try (Stream<Path> streamCaminhos = Files.walk(pastaRaiz)) {
            
            
            var arquivosJava = streamCaminhos
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .toList();

            long tamanhoTotalBytes = 0;

            for (Path p : arquivosJava) {
                try {
                    long tamanhoBytes = Files.size(p);
                    tamanhoTotalBytes += tamanhoBytes;
                    System.out.printf("Arquivo: %-60s | Tamanho: %d bytes\n", pastaRaiz.relativize(p), tamanhoBytes);
                } catch (IOException e) {
                    System.err.println("Erro ao ler tamanho de " + p + ": " + e.getMessage());
                }
            }

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Total de arquivos .java encontrados: " + arquivosJava.size());
            System.out.printf("Tamanho total dos fontes Java: %d bytes (%.2f KB)\n", 
                    tamanhoTotalBytes, tamanhoTotalBytes / 1024.0);

        } catch (IOException e) {
            System.err.println("Erro durante a varredura do diretorio: " + e.getMessage());
        }
    }
}
