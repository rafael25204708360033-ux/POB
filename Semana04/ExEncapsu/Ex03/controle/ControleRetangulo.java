package controle;

import dominio.Retangulo;

public class ControleRetangulo {
    public static void main(String[] args) {
        System.out.println("=== RETANGULO 1 (VALORES VALIDOS) ===");
        Retangulo r1 = new Retangulo(5.0, 3.0);
        System.out.printf("Area: %.2f | Perimetro: %.2f\n\n", r1.calcularArea(), r1.calcularPerimetro());

        System.out.println("=== RETANGULO 2 (VALORES INVALIDOS NO CONSTRUTOR) ===");
        Retangulo r2 = new Retangulo(-4.0, 0.0);
        System.out.printf("Dimensionamento final: Largura = %.1f, Altura = %.1f\n", r2.getLargura(), r2.getAltura());
        System.out.printf("Area: %.2f | Perimetro: %.2f\n", r2.calcularArea(), r2.calcularPerimetro());
    }
}
