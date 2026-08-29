package Semana02.Repetição.Ex04;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inferior (A): ");
        int a = scanner.nextInt();

        System.out.print("Digite o limite superior (B): ");
        int b = scanner.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);

        scanner.close();
    }
}
