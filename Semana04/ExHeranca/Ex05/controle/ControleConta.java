package semana04.exheranca.ex05.controle;

import semana04.exheranca.ex05.dominio.ContaCorrente;
import semana04.exheranca.ex05.dominio.ContaPoupanca;

public class ControleConta {
    public static void main(String[] args) {
        System.out.println("=== CONTA POUPANCA ===");
        ContaPoupanca cp = new ContaPoupanca("1001-P", 1000.0, 0.5);
        cp.aplicarRendimento();
        cp.sacar(200.0);

        System.out.println("\n=== CONTA CORRENTE ===");
        ContaCorrente cc = new ContaCorrente("2002-C", 100.0, 500.0);
        cc.sacar(150.0); // Usa cheque especial e cobra R$ 2.00 de taxa
        cc.sacar(500.0); // Tentativa que estoura o limite do cheque especial
    }
}
