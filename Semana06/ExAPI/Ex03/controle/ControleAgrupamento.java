package Semana06.ExAPI.Ex03.controle;

import Semana06.ExAPI.Ex03.dominio.Aluno;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ControleAgrupamento {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Rafael", "ADS", 8.5),
                new Aluno("Beatriz", "ADS", 6.0),
                new Aluno("Carlos", "Sistemas de Informacao", 9.0),
                new Aluno("Ana", "Engenharia de Software", 5.5),
                new Aluno("Marcos", "ADS", 7.5),
                new Aluno("Mariana", "Sistemas de Informacao", 4.0)
        );

        
        Map<String, List<Aluno>> alunosPorCurso = alunos.stream()
                .collect(Collectors.groupingBy(Aluno::getCurso));

        System.out.println("=== 1. ALUNOS AGRUPADOS POR CURSO ===");
        alunosPorCurso.forEach((curso, lista) -> {
            System.out.println("Curso: " + curso);
            lista.forEach(a -> System.out.println("  - " + a));
        });

        
        Map<Boolean, List<Aluno>> alunosParticionados = alunos.stream()
                .collect(Collectors.partitioningBy(aluno -> aluno.getNotaFinal() > 7.0));

        System.out.println("\n=== 2. PARTICIONAMENTO DE ALUNOS (APROVADOS X REPROVADOS) ===");
        System.out.println("Aprovados (> 7.0):");
        alunosParticionados.get(true).forEach(a -> System.out.println("  - " + a));

        System.out.println("Reprovados (<= 7.0):");
        alunosParticionados.get(false).forEach(a -> System.out.println("  - " + a));
    }
}
