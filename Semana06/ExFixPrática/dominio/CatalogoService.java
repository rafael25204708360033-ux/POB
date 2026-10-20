package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoService {
    private final List<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto p) {
        if (p == null) {
            throw new IllegalArgumentException("Nao e possivel cadastrar um produto nulo.");
        }
        if (produtos.contains(p)) {
            System.out.println("Erro: Produto com o codigo " + p.getCodigo() + " ja esta cadastrado.");
            return;
        }
        produtos.add(p);
        System.out.println("Produto cadastrado com sucesso: " + p.getDescricao());
    }

    public Produto obterPorPosicao(int indice) {
        if (indice < 0 || indice >= produtos.size()) {
            throw new IndexOutOfBoundsException("Indice " + indice + " fora dos limites do catalogo.");
        }
        return produtos.get(indice);
    }

    public boolean excluirPorCodigo(String codigo) {
        // Como o equals() compara apenas o código, criamos um objeto temporário com o código buscado
        Produto temp = new Produto(codigo, "Dummy", 0.0, 0);
        boolean removido = produtos.remove(temp);
        if (removido) {
            System.out.println("Produto COD " + codigo + " removido do catalogo.");
        } else {
            System.out.println("Produto COD " + codigo + " nao encontrado para remocao.");
        }
        return removido;
    }

    public void ordenarPorPreco() {
        Collections.sort(produtos);
    }

    public void listarCatalogo() {
        if (produtos.isEmpty()) {
            System.out.println("Catalogo vazio.");
            return;
        }
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("[" + i + "] " + produtos.get(i));
        }
    }

    public int getTamanho() {
        return produtos.size();
    }
}
