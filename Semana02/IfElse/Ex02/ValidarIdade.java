package Semana02.Ex02;

import java.util.Scanner;

public class ValidarIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("Tudo Certo !");
        }
        else {
            System.out.println("Acesso barrado, idade não permitida !");
        }
    }
}
