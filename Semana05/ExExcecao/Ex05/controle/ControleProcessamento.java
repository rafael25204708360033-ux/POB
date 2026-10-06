package controle;

import dominio.ProcessamentoDadosException;
import dominio.ServicoArquivo;

public class ControleProcessamento {
    public static void main(String[] args) {
        ServicoArquivo servico = new ServicoArquivo();

        System.out.println("=== TESTE 1: CAMINHO VALIDO ===");
        try {
            servico.processarArquivo("C:/dados/relatorio.csv");
        } catch (ProcessamentoDadosException e) {
            System.out.println("Mensagem: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 2: CAMINHO INVALIDO (ENCADEAMENTO DE EXCEÇÃO) ===");
        try {
            servico.processarArquivo("");
        } catch (ProcessamentoDadosException e) {
            System.out.println("Exceção Principal: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Causa Raiz (getCause()): " + e.getCause().getMessage());
            }
        }
    }
}
