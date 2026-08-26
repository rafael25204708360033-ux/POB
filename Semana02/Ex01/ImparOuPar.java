package Semana02.Ex01;

import java.util.Scanner;

/*
Exercício 1: Par ou Ímpar
Enunciado: Escreva um programa em Java que leia um número 
inteiro e informe se ele é par ou ímpar.
Conceitos: Operador módulo (%) e estrutura if-else simples.
*/

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("O numero digitado é par!");
        }
        else {
            System.out.println("O numero digitado é impar!");
        }
    }
    
}