package Semana02.Array.Ex02;

import java.util.Scanner;

public class ExtremosVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor para a posicao [" + i + "]: ");
            valores[i] = sc.nextInt();
        }

        int maior = valores[0];
        int menor = valores[0];
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                indiceMaior = i;
            }
            if (valores[i] < menor) {
                menor = valores[i];
                indiceMenor = i;
            }
        }

        System.out.println("\nMaior valor: " + maior + " (no indice " + indiceMaior + ")");
        System.out.println("Menor valor: " + menor + " (no indice " + indiceMenor + ")");

        sc.close();
    }
}
