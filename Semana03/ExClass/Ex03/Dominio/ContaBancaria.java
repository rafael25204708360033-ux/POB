package Semana03.ExClass.Ex03.Dominio;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo = 0.0;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Deposito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Conta: %s | Titular: %s | Saldo atual: R$ %.2f\n", numeroConta, titular, saldo);
    }
}
