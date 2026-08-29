package Semana02.Repetição.Ex02;

import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int quantidade = 0;

        System.out.print("Digite um numero positivo (ou negativo para parar): ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            quantidade++;

            System.out.print("Digite o proximo numero (ou negativo para parar): ");
            numero = scanner.nextInt();
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Quantidade de numeros: " + quantidade);
            System.out.println("Soma total: " + soma);
            System.out.printf("Media aritmetica: %.2f\n", media);
        } else {
            System.out.println("Nenhum numero positivo foi digitado.");
        }

        scanner.close();
    }
}
