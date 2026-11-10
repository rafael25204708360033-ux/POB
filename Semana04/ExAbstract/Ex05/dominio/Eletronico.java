package Semana04.ExAbstract.Ex05.dominio;

public class Eletronico extends Item implements Tributavel {

    public Eletronico(int codigo, double precoBase) {
        super(codigo, precoBase);
    }

    @Override
    public double calcularTributo() {
        return getPrecoBase() * 0.15; // 15% de imposto
    }
}
