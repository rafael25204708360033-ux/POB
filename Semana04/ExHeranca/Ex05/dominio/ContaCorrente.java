package semana04.exheranca.ex05.dominio;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    private static final double TAXA_SAQUE = 2.0;

    public ContaCorrente(String numero, double saldoInicial, double limiteChequeEspecial) {
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        double valorTotalNecessario = valor + TAXA_SAQUE;
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;

        if (valor > 0 && saldoDisponivel >= valorTotalNecessario) {
            setSaldo(getSaldo() - valorTotalNecessario);
            System.out.printf("Saque de R$ %.2f (Taxa: R$ %.2f) realizado. Saldo atual: R$ %.2f\n", 
                              valor, TAXA_SAQUE, getSaldo());
            return true;
        } else {
            System.out.println("Erro: Operacao excede o limite do cheque especial disponivel.");
            return false;
        }
    }
}
