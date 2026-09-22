package semana04.exheranca.ex02.dominio;

public class Gerente extends Funcionario {
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + bonusFixo;
    }
}
