package EXERCICIOS.Ex02;

import java.util.Scanner;

/*
Crie um programa que solicite uma temperatura em graus Celsius ($C$) e a converta para Fahrenheit (F) utilizando a fórmula:
F = (C * 1.8) + 32 
 */

public class ConversorTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Essa temperatura em Fahrenheit: " + fahrenheit);
        sc.close();
    }
}

