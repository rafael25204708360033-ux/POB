package semana04.exencapsu.ex01.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);a
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0.0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preco nao pode ser negativo. Valor mantido: " + this.preco);
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Erro: A quantidade em estoque nao pode ser negativa. Valor mantido: " + this.quantidadeEstoque);
        }
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }
}
