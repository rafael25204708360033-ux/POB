package Semana04.ExAbstract.Ex04.dominio;

public abstract class ContaBancaria {
    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldoInicial) {
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
            System.out.printf("Conta %s: Deposito de R$ %.2f realizado. Saldo: R$ %.2f\n", numero, valor, saldo);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Conta %s | Saldo Atual: R$ %.2f\n", numero, saldo);
    }

    public abstract void cobrarTaxaMensal();
}