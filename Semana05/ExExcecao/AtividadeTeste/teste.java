package Semana05.ExExcecao.AtividadeTeste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op = '\0';
        int n1 = 0;
        int n2 = 0;

        try {
            System.out.println("Digite qual operação deseja utilizar(+, -, *, /): ");
            op = sc.next().charAt(0);

            System.out.println("Digite o primeiro numero: ");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            n2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas numeros inteiros!!");
        }

        try {
            if (op == '+') {
                int resultado = n1 + n2;
                System.out.println("Resultado: " + resultado);
            } else if (op == '-') {
                int resultado = n1 - n2;
                System.out.println("Resultado: " + resultado);
            } else if (op == '*') {
                int resultado = n1 * n2;
                System.out.println("Resultado: " + resultado);
            } else if (op == '/') {
                int resultado = n1 / n2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Operador invalido");
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: não existe divisão por 0!!");
        }

        sc.close();
    }
}
