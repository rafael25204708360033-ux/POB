package Semana04.ExAbstract.Ex04.dominio;

public class ContaEmpresarial extends ContaBancaria {
    private static final double TAXA_BASE = 30.00;
    private static final double PERCENTUAL_SALDO = 0.005; // 0.5%

    public ContaEmpresarial(String numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void cobrarTaxaMensal() {
        double taxaVariavel = getSaldo() * PERCENTUAL_SALDO;
        double taxaTotal = TAXA_BASE + taxaVariavel;
        setSaldo(getSaldo() - taxaTotal);
        System.out.printf("Conta Empresarial %s: Taxa mensal de R$ %.2f (Base R$ %.2f + Variable R$ %.2f) cobrada. Novo Saldo: R$ %.2f\n", 
                          getNumero(), taxaTotal, TAXA_BASE, taxaVariavel, getSaldo());
    }
}
