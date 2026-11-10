package Semana06.ExAPI.Ex01.controle;

import java.util.Arrays;
import java.util.List;

public class ControleNomes {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("ana", "carlos", "beatriz", "antonio", "amanda", "bernardo");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.toLowerCase().startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .toList(); // No Java 16+, toList() substitui Collectors.toList()

        System.out.println("=== NOMES FILTRADOS E TRANSFORMADOS ===");
        resultado.forEach(System.out::println);
    }
}
