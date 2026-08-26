package Semana02.Ex04;

import java.util.Scanner;

public class MaiorDe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num01 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num02 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int num03 = sc.nextInt();

        if(num01 > num02 && num01 > num03) {
            System.out.println("O primeiro numero é o maior!");
        }
        else if(num02 > num01 && num02 > num03) {
            System.out.println("O segundo numero é o maior!");
        }
        else if(num03 > num02 && num03 > num01) {
            System.out.println("O terceiro numero é o maior!");
        }
        else if(num01 == num02 && num01 > num03) {
            System.out.println("O primeiro numero e o segundo são os maiores!");
        }
        else if(num01 == num03 && num01 > num02) {
            System.out.println("O primeiro numero e o terceiro são os maiores!");
        }
        else if(num03 == num02 && num02 > num01) {
            System.out.println("O segundo numero e o terceiro são os maiores!");
        }
        else {
            System.out.println("Todos os numeros sao iguais");
        }

    }
}
