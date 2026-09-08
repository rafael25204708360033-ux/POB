package Semana03.ExClass.Ex02.Controle;

import Semana03.ExClass.Ex02.Dominio.Circulo;
import java.util.Scanner;

public class controleCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Digite o raio do circulo: ");
        circulo.raio = scanner.nextDouble();

        System.out.printf("Area do circulo: %.2f\n", circulo.calcularArea());
        System.out.printf("Perimetro do circulo: %.2f\n", circulo.calcularPerimetro());

        scanner.close();
    }
}
