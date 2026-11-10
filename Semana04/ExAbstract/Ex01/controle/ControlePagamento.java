package Semana04.ExAbstract.Ex01.controle;

import Semana04.ExAbstract.Ex01.dominio.CartaoCredito;
import Semana04.ExAbstract.Ex01.dominio.MetodoPagamento;
import Semana04.ExAbstract.Ex01.dominio.Pix;

public class ControlePagamento {
    public static void finalizarCompra(MetodoPagamento metodo, double total) {
        System.out.println("=== FINALIZANDO COMPRA ===");
        System.out.println(metodo.obterDetalhes());
        metodo.processarPagamento(total);
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito("****-****-****-1234", 1500.0);
        MetodoPagamento pix = new Pix("rafael@email.com");

        finalizarCompra(cartao, 250.00);
        finalizarCompra(pix, 90.50);
        finalizarCompra(cartao, 2000.00); // Excede o limite do cartão
    }
}
