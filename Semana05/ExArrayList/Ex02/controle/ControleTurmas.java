package controle;

import java.util.HashSet;
import java.util.Set;

public class ControleTurmas {
    public static void main(String[] args) {
        Set<Integer> turmaA = new HashSet<>();
        Set<Integer> turmaB = new HashSet<>();

        // Povoando Turma A (com matrículas duplicadas intencionais)
        turmaA.add(101);
        turmaA.add(102);
        turmaA.add(103);
        turmaA.add(104);
        turmaA.add(101); // Duplicado - será ignorado pelo HashSet

        // Povoando Turma B
        turmaB.add(103);
        turmaB.add(104);
        turmaB.add(105);
        turmaB.add(106);

        System.out.println("Matriculas unicas Turma A: " + turmaA);
        System.out.println("Matriculas unicas Turma B: " + turmaB);

        // 1. União sem repetição
        Set<Integer> uniao = new HashSet<>(turmaA);
        uniao.addAll(turmaB);
        System.out.println("\n=== UNIAO (Todos os alunos sem repeticao) ===");
        System.out.println(uniao);

        // 2. Interseção
        Set<Integer> intersecao = new HashSet<>(turmaA);
        intersecao.retainAll(turmaB);
        System.out.println("\n=== INTERSECAO (Alunos em ambas as turmas) ===");
        System.out.println(intersecao);
    }
}
