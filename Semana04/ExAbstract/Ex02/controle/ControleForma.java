package Semana04.ExAbstract.Ex02.controle;

import Semana04.ExAbstract.Ex02.dominio.Circulo;
import Semana04.ExAbstract.Ex02.dominio.Forma;
import Semana04.ExAbstract.Ex02.dominio.Retangulo;

public class ControleForma {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo("Azul", 5.0, 4.0);
        Forma circulo = new Circulo("Vermelho", 3.0);

        System.out.println("=== RETANGULO ===");
        retangulo.exibirCor();
        System.out.printf("Area: %.2f\n\n", retangulo.calcularArea());

        System.out.println("=== CIRCULO ===");
        circulo.exibirCor();
        System.out.printf("Area: %.2f\n", circulo.calcularArea());
    }
}