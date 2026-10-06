package dominio;

public class ContaCorrente {
    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                String.format("Saldo insuficiente! Saldo disponivel: R$ %.2f | Valor solicitado: R$ %.2f", saldo, valor)
            );
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado. Saldo restante: R$ %.2f\n", valor, saldo);
    }
}
