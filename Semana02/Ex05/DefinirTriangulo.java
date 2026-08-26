package Semana02.Ex05;

import java.util.Scanner;

public class DefinirTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado01 = sc.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado02 = sc.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado03 = sc.nextInt();

        if((lado01 + lado02) >= lado03 && (lado01 + lado03) >= lado02 && (lado03 + lado02) >= lado01) {

            if((lado01 == lado02 && lado01 != lado03) || (lado01 == lado03 && lado01 != lado02) || (lado02 == lado03 && lado03 != lado02)) 
                System.out.println("O triângulo é definido como Isósceles!");
            else if(lado01 == lado02 && lado02 == lado03) 
                System.out.println("O triângulo é definido como Equilátero!");
            else 
                System.out.println("O triângulo é definido como Escaleno!");            
        }
        else
            System.out.println("As medidas inseridas não formam um triângulo válido!!!");
    }
}
