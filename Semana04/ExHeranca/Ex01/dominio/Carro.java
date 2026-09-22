package semana04.exheranca.ex01.dominio;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}
