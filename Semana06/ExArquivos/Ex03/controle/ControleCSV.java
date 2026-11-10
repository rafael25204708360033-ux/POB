package Semana06.ExArquivos.Ex03.controle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ControleCSV {
    public static void main(String[] args) {
        Path caminhoCSV = Path.of("produtos.csv");

        try {
            
            String dadosCSV = """
                    Nome,Quantidade,PrecoUnitario
                    Monitor,5,1200.00
                    Teclado Mecanico,10,250.50
                    Mouse Gamer,15,80.00
                    Cabo HDMI,30,25.00
                    """;
            Files.writeString(caminhoCSV, dadosCSV, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            
            List<String> linhas = Files.readAllLines(caminhoCSV);
            double valorTotalInventario = 0.0;

            System.out.println("=== PROCESSAMENTO DO INVENTARIO (CSV) ===");
            System.out.printf("%-20s | %-10s | %-12s | %-12s\n", "Produto", "Qtd", "Preco Unit.", "Total Item");
            System.out.println("------------------------------------------------------------------");

            
            for (int i = 1; i < linhas.size(); i++) {
                String linha = linhas.get(i).trim();
                if (linha.isEmpty()) continue;

                try {
                    String[] campos = linha.split(",");
                    String nome = campos[0];
                    int quantidade = Integer.parseInt(campos[1]);
                    double precoUnitario = Double.parseDouble(campos[2]);

                    double totalItem = quantidade * precoUnitario;
                    valorTotalInventario += totalItem;

                    System.out.printf("%-20s | %-10d | R$ %-9.2f | R$ %-9.2f\n", 
                            nome, quantidade, precoUnitario, totalItem);

                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.err.println("Erro ao parsear a linha " + (i + 1) + ": " + linha + " (" + e.getMessage() + ")");
                }
            }

            System.out.println("------------------------------------------------------------------");
            System.out.printf("VALOR TOTAL DO INVENTARIO: R$ %.2f\n", valorTotalInventario);

        } catch (IOException e) {
            System.err.println("Erro na leitura/escrita do arquivo CSV: " + e.getMessage());
        }
    }
}
