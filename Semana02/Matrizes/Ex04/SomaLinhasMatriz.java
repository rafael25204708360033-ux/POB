package Semana02.Matrizes.Ex04;

import java.util.Scanner;

public class SomaLinhasMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        int[] somaLinhas = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
            somaLinhas[i] = soma;
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < somaLinhas.length; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }

        scanner.close();
    }
}
