package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro numero inteiro (numerador): ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o segundo numero inteiro (denominador): ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado da divisao: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Nao e possivel dividir por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida. Digite apenas numeros inteiros.");
        } finally {
            System.out.println("Operacao finalizada.");
            scanner.close();
        }
    }
}
