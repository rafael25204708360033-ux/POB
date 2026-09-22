package semana04.exheranca.ex01.controle;

import semana04.exheranca.ex01.dominio.Carro;
import semana04.exheranca.ex01.dominio.Moto;

public class ControleVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB 500F", 500);

        System.out.println("=== DETALHES DO CARRO ===");
        carro.exibirDetalhes();

        System.out.println("\n=== DETALHES DA MOTO ===");
        moto.exibirDetalhes();
    }
}
