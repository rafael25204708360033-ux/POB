package controle;

import dominio.Funcionario;
import dominio.Gerente;
import dominio.Vendedor;

public class ControleRH {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Funcionario("Carlos Silva", 3000.0);
        funcionarios[1] = new Gerente("Ana Souza", 6000.0, 2000.0);
        funcionarios[2] = new Vendedor("Marcos Lima", 2000.0, 50000.0, 5.0);

        double folhaTotal = 0.0;

        System.out.println("=== FOLHA DE PAGAMENTO ===");
        for (Funcionario f : funcionarios) {
            double salarioFinal = f.calcularSalario();
            System.out.printf("Funcionario: %s | Salario Final: R$ %.2f\n", f.getNome(), salarioFinal);
            folhaTotal += salarioFinal;
        }

        System.out.printf("\nFolha Total de Pagamento: R$ %.2f\n", folhaTotal);
    }
}
