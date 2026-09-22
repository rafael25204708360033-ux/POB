package semana04.exheranca.ex04.controle;

import semana04.exheranca.ex04.dominio.Circulo;
import semana04.exheranca.ex04.dominio.FiguraGeometrica;
import semana04.exheranca.ex04.dominio.Quadrado;
import semana04.exheranca.ex04.dominio.Retangulo;

public class ControleFigura {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Quadrado(4.0);
        figuras[1] = new Retangulo(5.0, 3.0);
        figuras[2] = new Circulo(2.5);

        System.out.println("=== AREA DAS FIGURAS GEOMETRICAS ===");
        for (FiguraGeometrica f : figuras) {
            System.out.printf("Area da figura (%s): %.2f\n", f.getClass().getSimpleName(), f.calcularArea());
        }
    }
}
