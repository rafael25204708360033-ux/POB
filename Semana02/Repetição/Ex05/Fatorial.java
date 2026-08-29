package Semana02.Repetição.Ex05;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro nao negativo (N): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Numero invalido para calculo de fatorial.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println(n + "! = " + fatorial);
        }

        sc.close();
    }
}
