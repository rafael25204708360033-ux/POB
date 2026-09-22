package semana04.exencapsu.ex02.dominio;

public class ContaBancaria {
    private final String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public ContaBancaria(String numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        if (depositoInicial > 0.0) {
            this.saldo = depositoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0.0) {
            saldo += valor;
            System.out.printf("Deposito de R$ %.2f realizado. Saldo atual: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Erro: Valor para deposito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0.0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado. Saldo atual: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor de saque invalido.");
        }
    }
}
