package Semana06.ExAPI.Ex02.controle;

import Semana06.ExAPI.Ex02.dominio.Produto;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ControleEstatistica {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", 4500.00),
                new Produto("Mouse", 80.00),
                new Produto("Teclado", 250.00),
                new Produto("Monitor", 1200.00),
                new Produto("Cabo HDMI", 30.00),
                new Produto("Cadeira Gamer", 1500.00)
        );

        
        double valorTotal = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        
        double precoMedio = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .average()
                .orElse(0.0);

        
        Optional<Produto> produtoMaisCaro = produtos.stream()
                .max(Comparator.comparingDouble(Produto::getPreco));

        System.out.println("=== ESTATISTICAS DOS PRODUTOS ===");
        System.out.printf("Valor Total Somado: R$ %.2f\n", valorTotal);
        System.out.printf("Preco Medio: R$ %.2f\n", precoMedio);
        
        produtoMaisCaro.ifPresent(p -> 
            System.out.println("Produto Mais Caro: " + p.getNome() + " (R$ " + String.format("%.2f", p.getPreco()) + ")")
        );
    }
}
