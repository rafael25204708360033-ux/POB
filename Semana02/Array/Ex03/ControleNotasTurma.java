package Semana02.Array.Ex03;

import java.util.Scanner;

public class ControleNotasTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];
        double soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota final do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("\nMedia da turma: %.2f\n", media);

        System.out.println("Notas acima da media:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.printf("Aluno %d - Nota: %.2f\n", (i + 1), notas[i]);
            }
        }

        sc.close();
    }
}
