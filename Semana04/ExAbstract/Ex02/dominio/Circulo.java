package Semana04.ExAbstract.Ex02.dominio;

public class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}