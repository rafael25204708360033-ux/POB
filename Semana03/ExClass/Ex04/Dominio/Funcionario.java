package Semana03.ExClass.Ex04.Dominio;

public class Funcionario {
    public String nome;
    public String cargo;
    public double salarioBruto;

    public void aplicarAumento(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100.0);
    }

    public double calcularSalarioLiquido(double descontoImposto) {
        return salarioBruto - descontoImposto;
    }
}
