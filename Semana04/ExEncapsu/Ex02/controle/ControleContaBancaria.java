package semana04.exencapsu.ex02.controle;

import semana04.exencapsu.ex02.dominio.ContaBancaria;

public class ControleContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("98765-1", "Rafael Conceicao");

        System.out.println("=== DADOS INICIAIS DA CONTA ===");
        System.out.println("Numero da Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.printf("Saldo Inicial: R$ %.2f\n\n", conta.getSaldo());

        System.out.println("=== OPERACOES ===");
        conta.depositar(300.0);
        conta.sacar(100.0);
        conta.sacar(500.0); // Tentativa invalida
    }
}
