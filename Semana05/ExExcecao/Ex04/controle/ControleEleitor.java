package controle;

import dominio.Eleitor;
import dominio.IdadeInvalidaException;

public class ControleEleitor {
    public static void main(String[] args) {
        Eleitor eleitor = new Eleitor();

        System.out.println("=== TESTE 1: IDADE VALIDA ===");
        try {
            eleitor.cadastrar("Rafael Conceicao", 20);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 2: IDADE INVALIDA (NEGATIVA) ===");
        try {
            eleitor.cadastrar("Marcos Lima", -5);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro capturado em tempo de execucao: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 3: IDADE INVALIDA (EXCESSIVA) ===");
        try {
            eleitor.cadastrar("Ana Souza", 150);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro capturado em tempo de execucao: " + e.getMessage());
        }
    }
}
