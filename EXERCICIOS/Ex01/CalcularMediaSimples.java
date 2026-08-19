package EXERCICIOS.Ex01;

import java.util.Scanner;

/*Enunciado: Escreva um programa em Java que leia três notas de um aluno (números decimais), calcule e exiba a média aritmética simples dessas notas.
Conceitos: Leitura de dados (Scanner), variáveis do tipo double, operadores aritméticos de soma e divisão.
Exemplo de Entrada: 7.5, 8.0, 6.5 Saída esperada: Média: 7.33
 */

public class CalcularMediaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota02 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota03 = sc.nextDouble();

        double media = (nota01 + nota02 + nota03)/3;

        System.out.println("A média das notas é: " + media);
        sc.close();
    }
}
