package Semana02.Matrizes.Ex02;

import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double somaDiagonal = 0.0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.printf("\nSoma dos elementos da diagonal principal: %.2f\n", somaDiagonal);

        sc.close();
    }
}
