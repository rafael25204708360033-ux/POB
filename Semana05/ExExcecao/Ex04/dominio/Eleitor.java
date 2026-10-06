package dominio;

public class Eleitor {
    private String nome;
    private int idade;

    public void cadastrar(String nome, int idade) {
        if (idade < 0 || idade > 130) {
            throw new IdadeInvalidaException("Idade invalida para cadastro: " + idade + " anos. A idade deve estar entre 0 e 130.");
        }
        this.nome = nome;
        this.idade = idade;
        System.out.println("Eleitor " + nome + " (" + idade + " anos) cadastrado com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
