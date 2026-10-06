package controle;

import java.util.Scanner;

public class ControleConversao {
    public static void main(String[] args) {
        String[] valores = {"10", "25", "abc", "50"};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o indice do vetor (0 a 3): ");
            int indice = scanner.nextInt();

            String texto = valores[indice];
            int numeroConvertido = Integer.parseInt(texto);

            System.out.println("Valor convertido no indice [" + indice + "]: " + numeroConvertido);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Indice fora do limite do vetor. Tente valores de 0 a 3.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor na posicao escolhida nao pode ser convertido para um numero valido.");
        } finally {
            scanner.close();
        }
    }
}
