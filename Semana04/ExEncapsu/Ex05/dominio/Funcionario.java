package dominio;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        if (salario > 0.0) {
            this.salario = salario;
        } else {
            this.salario = 0.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double novoSalario) {
        if (novoSalario > this.salario) {
            System.out.printf("Salario alterado com sucesso! De R$ %.2f para R$ %.2f\n", this.salario, novoSalario);
            this.salario = novoSalario;
        } else {
            System.out.printf("Erro: O novo salario (R$ %.2f) deve ser estritamente maior que o salario atual (R$ %.2f).\n", novoSalario, this.salario);
        }
    }

    public void exibirDados() {
        System.out.println("=== DADOS DO FUNCIONARIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.printf("Salario: R$ %.2f\n", salario);
        System.out.println("----------------------------");
    }
}
