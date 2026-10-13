package controle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleFrequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase ou texto:");
        String texto = scanner.nextLine();

        // Tratamento da string: minusculas e separacao por espacos
        String[] palavras = texto.toLowerCase().split("\\s+");
        Map<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            // Remove pontuacoes simples caso existam
            palavra = palavra.replaceAll("[^a-zA-Z0-9-áàâãéèêíïóôõöúçñ]", "");
            if (!palavra.isEmpty()) {
                frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
            }
        }

        System.out.println("\n=== FREQUENCIA DE PALAVRAS ===");
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ocorrencia(s)");
        }

        scanner.close();
    }
}
