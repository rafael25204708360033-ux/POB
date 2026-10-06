package controle;

import dominio.ContaCorrente;
import dominio.SaldoInsuficienteException;

public class ControleConta {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("1001-X", 500.0);

        try {
            System.out.println("=== TENTATIVA DE SAQUE 1 ===");
            conta.sacar(200.0);

            System.out.println("\n=== TENTATIVA DE SAQUE 2 ===");
            conta.sacar(400.0); // Vai disparar a exceção checked

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro de Operacao: " + e.getMessage());
        }
    }
}
