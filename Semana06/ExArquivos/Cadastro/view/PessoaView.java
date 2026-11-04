package Semana06.ExArquivos.Cadastro.view;

import Semana06.ExArquivos.Cadastro.model.Pessoa;
import Semana06.ExArquivos.Cadastro.controller.PessoaController;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PessoaView {

    private PessoaController controla;

    private Scanner s;

    public PessoaView(PessoaController controla) {
        this.controla = controla;
        this.s = new Scanner(System.in);
    }

    public void Menu(){
            int opcao; 

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar Produto");
                System.out.println("2. Listar Produtos");
                System.out.println("3. Alterar Produto");
                System.out.println("4. Excluir Produto");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                
                opcao = capturarInteiro();
                switch (opcao) {
                    case 1 -> adicionarPessoa();
                    case 2 -> listarPessoas();
                    case 3 -> alterarPessoa();
                    case 4 -> excluirPessoa();
                    case 0 -> System.out.println("Encerrando o programa.");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
        }

        private void adicionarPessoa() {
        int id = capturarId();
        String nome = capturarString("Nome do Produto: ");
        int idade = capturarIdade("Idade: ");
        double altura = capturarAltura("Altura: ");
        
        controla.adicionarPessoa(id, nome, idade,altura);
        System.out.println("Pessoa adicionado com sucesso!");

    }
        private void listarPessoas() {
        for (Pessoa pessoa : controla.listarPessoas()) {
            System.out.println("ID: " + pessoa.getId() + ", Nome: " + pessoa.getNome() + ", idade " + 
            pessoa.getIdade() + ", altura " + pessoa.getAltura());
        }
    }

    private void alterarPessoa() {
        int id = capturarId();
        String novoNome = capturarString("Novo Nome: ");
        int novaIdade = capturarIdade("Nova idade :");
        double novaAltura = capturarAltura("Novo Valor: ");

        if (controla.alterarPessoa(id, novoNome, novaIdade, novaAltura)) {
            System.out.println("Pessoa alterado com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrado.");
        }
    }

    private void excluirPessoa() {
        int id = capturarId();
        if (controla.excluirPessoa(id)) {
            System.out.println("Pessoa excluído com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrado.");
        }
    }

    private int capturarId() {
        return capturarInteiro("ID do Produto: ");
    }

    private int capturarInteiro() {
        return capturarInteiro(null);
    }

    private int capturarInteiro(String mensagem) {
        int valor = 0;
        boolean valido;
        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem); 
                }
                valor = s.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                valido = false;
                s.nextLine(); 
            }
        } while (!valido);
        s.nextLine(); 
        return valor;
    }

    private double capturarAltura(String mensagem) {
        double valor = 0.0;
        boolean valido;
        do {
            try {
                System.out.print(mensagem);
                valor = s.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número decimal.");
                valido = false;
                s.nextLine();
            }
        } while (!valido);
        s.nextLine();
        return valor;
    }
    private String capturarString(String mensagem) {
        System.out.print(mensagem);
        return s.nextLine(); 
    }

        private int capturarIdade(String mensagem) {
        int valor = 0;
        boolean valido;
        do {
            try {
                if (mensagem != null) {
                    System.out.print(mensagem); 
                }
                valor = s.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                valido = false;
                s.nextLine(); 
            }
        } while (!valido);
        s.nextLine(); 
        return valor;
    }
}
