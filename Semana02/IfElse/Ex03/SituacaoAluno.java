package Semana02.Ex03;

import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno referente a primeira nota: ");
        float nota01 = sc.nextFloat();
        System.out.print("Digite a nota do aluno referente a segunda nota: ");
        float nota02 = sc.nextFloat();

        if((nota01 + nota02) / 2 >= 7) {
            System.out.println("Aluno aprovado");
        }
        else if((nota01 + nota02) / 2 >= 5) {
            System.out.println("Aluno em Recuperação");
        }
        else {
            System.out.println("Aluno Reprovado");
        }
            
    }
}
