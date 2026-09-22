package semana04.exencapsu.ex05.controle;

import semana04.exencapsu.ex05.dominio.Funcionario;

public class ControleFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Beatriz Lima", "2026DEV01", 4500.0);
        func.exibirDados();

        System.out.println("--- TENTATIVA DE REDUCAO SALARIAL ---");
        func.setSalario(4000.0);

        System.out.println("\n--- TENTATIVA DE MANTER O MESMO SALARIO ---");
        func.setSalario(4500.0);

        System.out.println("\n--- AUMENTO SALARIAL VALIDO ---");
        func.setSalario(5200.0);

        System.out.println();
        func.exibirDados();
    }
}
