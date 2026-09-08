package Semana03.ExClass.Ex03.Controle;

import Semana03.ExClass.Ex03.dominio.ContaBancaria

public class controleContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Carlos Silva";
        conta.numeroConta = "12345-6";

        System.out.println("=== TESTES DE OPERACOES BANCARIAS ===");
        conta.consultarSaldo();

        conta.depositar(500.0);
        conta.consultarSaldo();

        conta.sacar(150.0);
        conta.consultarSaldo();

        conta.sacar(600.0); // Tentativa invalida: saldo insuficiente
        conta.depositar(-50.0); // Tentativa invalida: valor negativo

        conta.consultarSaldo();
    }
}
