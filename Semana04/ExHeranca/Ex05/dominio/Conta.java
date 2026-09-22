package semana04.exheranca.ex05.dominio;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Deposito de R$ %.2f realizado. Saldo atual: R$ %.2f\n", valor, saldo);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado. Saldo atual: R$ %.2f\n", valor, saldo);
            return true;
        } else {
            System.out.println("Erro: Saldo insuficiente.");
            return false;
        }
    }
}
