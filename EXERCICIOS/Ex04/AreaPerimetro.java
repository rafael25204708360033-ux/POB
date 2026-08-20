package EXERCICIOS.Ex04;

import java.util.Scanner;

/*
Faça um programa que leia a base e a altura de um retângulo. Em seguida, calcule e mostre:
*/

public class AreaPerimetro {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Determina a base de um retângulo: ");
    double base = sc.nextDouble();
    System.out.print("Determine a altura do retângulo: ");
    double alt = sc.nextDouble();

    double area = base * alt;
    double perim = 2 * (base + alt);

    System.out.print("A base do seu retângulo é igual a " + area);
    System.out.println(" e o perímetro é igual a " + perim);

    sc.close();
  }
}
