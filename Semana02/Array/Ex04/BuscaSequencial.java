package Semana02.Array.Ex04;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posicao [" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("\nDigite o numero a ser buscado (X): ");
        int x = sc.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Numero " + x + " encontrado no indice: " + posicao);
        } else {
            System.out.println("Numero " + x + " nao esta presente no vetor.");
        }

        sc.close();
    }
}
