package semana04.exencapsu.ex04.controle;

import semana04.exencapsu.ex04.dominio.Carro;

public class ControleCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Civic", 2024);

        System.out.println("Modelo: " + meuCarro.getModelo() + " | Ano: " + meuCarro.getAno());
        System.out.println("Carro em movimento? " + meuCarro.isEmMovimento());

        System.out.println("\n--- TESTANDO ACELERACAO E FRENAGEM ---");
        meuCarro.acelerar(50);
        System.out.println("Carro em movimento? " + meuCarro.isEmMovimento());

        meuCarro.frear(30);
        meuCarro.frear(40); // Força a velocidade a cair abaixo de 0
        System.out.println("Carro em movimento? " + meuCarro.isEmMovimento());
    }
}
