package Semana06.ExAPI.Ex05.controle;

import Semana06.ExAPI.Ex05.dominio.Funcionario;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ControlePipeline {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Rafael", "TI", 5000.00),
                new Funcionario("Beatriz", "RH", 4000.00),
                new Funcionario("Carlos", "TI", 7000.00),
                new Funcionario("Ana", "Financeiro", 6000.00),
                new Funcionario("Marcos", "TI", 3500.00)
        );

        
        Predicate<Funcionario> eDoDepartamentoTI = f -> "TI".equalsIgnoreCase(f.getDepartamento());

        
        Function<Funcionario, Double> calcularReajuste = f -> f.getSalario() * 1.10;

        
        Consumer<Double> imprimirSalarioReajustado = valor -> 
                System.out.printf("Salario Projetado (TI +10%%): R$ %.2f\n", valor);

        System.out.println("=== PIPELINE DE REAJUSTE DE SALARIO (DEPARTAMENTO TI) ===");
        
        
        funcionarios.stream()
                .filter(eDoDepartamentoTI)
                .map(calcularReajuste)
                .forEach(imprimirSalarioReajustado);
    }
}
