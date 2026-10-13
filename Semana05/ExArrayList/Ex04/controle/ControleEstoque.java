package controle;

import dominio.EstoqueService;

public class ControleEstoque {
    public static void main(String[] args) {
        EstoqueService estoque = new EstoqueService();

        System.out.println("=== CADASTRANDO PRODUTOS ===");
        estoque.inserirProduto("PROD-01", 10);
        estoque.inserirProduto("PROD-02", 3);
        estoque.inserirProduto("PROD-03", 0);

        System.out.println("\n=== ATUALIZANDO ESTOQUE ===");
        estoque.atualizarEstoque("PROD-01", -8); // Fica com 2
        estoque.atualizarEstoque("PROD-02", 5);  // Fica com 8
        estoque.atualizarEstoque("PROD-99", 5);  // Produto inexistente

        estoque.exibirEstoqueBaixo(5);
    }
}
