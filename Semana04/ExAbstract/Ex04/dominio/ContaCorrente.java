package Semana04.ExAbstract.Ex04.dominio;

public class ContaCorrente extends ContaBancaria {
    private static final double TAXA_FIXA = 15.00;

    public ContaCorrente(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void cobrarTaxaMensal() {
        setSaldo(getSaldo() - TAXA_FIXA);
        System.out.printf("Conta Corrente %s: Taxa mensal de R$ %.2f cobrada. Novo Saldo: R$ %.2f\n", 
                          getNumero(), TAXA_FIXA, getSaldo());
    }
}
