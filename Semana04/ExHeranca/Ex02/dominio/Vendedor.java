package semana04.exheranca.ex02.dominio;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissaoPercentual;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissaoPercentual) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + (totalVendas * (comissaoPercentual / 100.0));
    }
}
