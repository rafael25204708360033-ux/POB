package controle;

import dominio.Carro;
import dominio.Moto;

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
