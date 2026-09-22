package controle;

import dominio.Produto;

public class ControleProduto {
    public static void main(String[] args) {
        Produto produtoA = new Produto("Teclado Mecanico", 250.0, 10);
        Produto produtoB = new Produto("Mousepad Gamer", 80.0);

        System.out.println("=== PRODUTO A ===");
        System.out.println("Nome: " + produtoA.getNome());
        System.out.printf("Preco: R$ %.2f | Estoque: %d\n", produtoA.getPreco(), produtoA.getQuantidadeEstoque());
        System.out.printf("Valor Total em Estoque: R$ %.2f\n\n", produtoA.calcularValorTotalEmEstoque());

        System.out.println("=== PRODUTO B ===");
        System.out.println("Nome: " + produtoB.getNome());
        System.out.printf("Preco: R$ %.2f | Estoque: %d\n\n", produtoB.getPreco(), produtoB.getQuantidadeEstoque());

        System.out.println("=== TESTE DE VALIDACAO DE ATRIBUICAO ===");
        produtoA.setPreco(-10.0); // Tentativa invalida
        produtoA.setQuantidadeEstoque(-5); // Tentativa invalida
        System.out.printf("Preco do Produto A apos tentativa invalida: R$ %.2f\n", produtoA.getPreco());
    }
}
