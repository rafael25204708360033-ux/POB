package Semana02.Array.Ex05;

import java.util.Scanner;

public class SeparadorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] original = new int[10];
        int totalPares = 0;

        for (int i = 0; i < original.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            original[i] = scanner.nextInt();
            if (original[i] % 2 == 0) {
                totalPares++;
            }
        }

        int[] pares = new int[totalPares];
        int[] impares = new int[original.length - totalPares];

        int idxPar = 0;
        int idxImpar = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                pares[idxPar++] = original[i];
            } else {
                impares[idxImpar++] = original[i];
            }
        }

        System.out.print("\nNumeros pares: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nNumeros impares: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
