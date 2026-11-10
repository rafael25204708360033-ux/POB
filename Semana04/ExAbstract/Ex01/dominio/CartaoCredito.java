package Semana04.ExAbstract.Ex01.dominio;

public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor <= limite) {
            limite -= valor;
            System.out.printf("Pagamento de R$ %.2f aprovado no Cartao de Credito (%s). Limite restante: R$ %.2f\n", 
                              valor, numeroCartao, limite);
        } else {
            System.out.printf("Pagamento de R$ %.2f recusado. Limite insuficiente no Cartao (%s).\n", valor, numeroCartao);
        }
    }

    @Override
    public String obterDetalhes() {
        return "Forma de Pagamento: Cartao de Credito (" + numeroCartao + ")";
    }
}