package Semana03.ExClass.Ex05.Dominio;

public class Aluno {
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public String verificarAprovacao() {
        if (this.calcularMedia() > 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void imprimirBoletim() {
        System.out.println("=== BOLETIM ESCOLAR ===");
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.printf("Nota 1: %.1f | Nota 2: %.1f\n", nota1, nota2);
        System.out.printf("Media Final: %.2f\n", this.calcularMedia());
        System.out.println("Situacao: " + this.verificarAprovacao());
        System.out.println("=======================");
    }
}
