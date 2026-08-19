package EXERCICIOS.Ex03;

import java.util.Scanner;

/*
Desenvolva um programa que receba o valor da hora de trabalho de um 
funcionário e a quantidade de horas trabalhadas no mês. O programa 
deve calcular o salário bruto, descontar uma taxa fixa de 10% referente 
ao INSS e exibir o salário líquido final.

*/

public class DescontoINSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da hora: ");
        double valorhora = sc.nextDouble();
        System.out.print("Digite as horas: ");
        int horas = sc.nextInt();
        
        double salariobruto = valorhora * horas;
        double desconto = salariobruto * 0.10;
        double salarioliq = salariobruto - desconto;
        

        System.out.print("O salario bruto é: " + salariobruto);
        System.out.println(" e o salario liquido é: " + salarioliq);
        sc.close();
    }
}

