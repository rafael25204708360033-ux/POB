package Semana03.ExClass.Ex04.Controle;

import Semana03.ExClass.Ex04.dominio.Funcionario;

public class controleFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Mariana Alves";
        func.cargo = "Desenvolvedora Java";
        func.salarioBruto = 5000.0;

        double impostoFixo = 450.0;

        System.out.println("=== DADOS ANTES DO AUMENTO ===");
        System.out.println("Funcionario: " + func.nome + " | Cargo: " + func.cargo);
        System.out.printf("Salario Bruto: R$ %.2f\n", func.salarioBruto);
        System.out.printf("Salario Liquido (com desconto de R$ %.2f): R$ %.2f\n\n", impostoFixo, func.calcularSalarioLiquido(impostoFixo));

        // Aplicando aumento de 10%
        func.aplicarAumento(10.0);

        System.out.println("=== DADOS APOS O AUMENTO (10%) ===");
        System.out.printf("Novo Salario Bruto: R$ %.2f\n", func.salarioBruto);
        System.out.printf("Novo Salario Liquido: R$ %.2f\n", func.calcularSalarioLiquido(impostoFixo));
    }
}
