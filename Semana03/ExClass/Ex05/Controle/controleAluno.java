package Semana03.ExClass.Ex05.Controle;

import Semana03.ExClass.Ex05.Dominio.Aluno;

public class controleAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas Ribeiro";
        aluno.matricula = "2026CS104";
        aluno.nota1 = 8.5;
        aluno.nota2 = 7.0;

        aluno.imprimirBoletim();
    }
}
