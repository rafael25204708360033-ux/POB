package Semana02.Repetição.Ex01;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}