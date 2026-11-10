package Semana04.ExAbstract.Ex01.dominio;

public interface MetodoPagamento {
    void processarPagamento(double valor);
    String obterDetalhes();
}