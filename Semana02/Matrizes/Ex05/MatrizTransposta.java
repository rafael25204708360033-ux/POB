package Semana02.Matrizes.Ex05;

import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[2][3];
        int[][] transposta = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento de A [" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[j][i] = matrizA[i][j];
            }
        }

        System.out.println("\nMatriz Original A (2x3):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transposta A^T (3x2):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposta[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
