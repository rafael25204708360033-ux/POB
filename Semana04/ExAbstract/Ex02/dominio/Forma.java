package Semana04.ExAbstract.Ex02.dominio;

public abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void exibirCor() {
        System.out.println("Cor da forma: " + cor);
    }

    public abstract double calcularArea();
}
