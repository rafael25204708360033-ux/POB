package Semana04.ExAbstract.Ex01.dominio;

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento instantaneo via PIX de R$ %.2f processado com sucesso para a chave: %s\n", 
                          valor, chavePix);
    }

    @Override
    public String obterDetalhes() {
        return "Forma de Pagamento: PIX (Chave: " + chavePix + ")";
    }
}