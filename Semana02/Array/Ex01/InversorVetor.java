package Semana02.Array.Ex01;

import java.util.Scanner;

public class InversorVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nElementos na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Posicao [" + i + "]: " + numeros[i]);
        }

        sc.close();
    }
}
