package dominio;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto(String codigo, String descricao, double preco, int quantidade) {
        if (preco < 0.0) {
            throw new IllegalArgumentException("O preco nao pode ser negativo.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade nao pode ser negativa.");
        }
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return String.format("COD: %s | %s | Preco: R$ %.2f | Qtd: %d", 
                codigo, descricao, preco, quantidade);
    }
}
