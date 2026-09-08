package Semana03.ExClass.Ex01.Controle;

import Semana03.ExClass.Ex01.Dominio.Livro;

public class controleLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Aneis";
        livro1.autor = "J. R. R. Tolkien";
        livro1.numeroPaginas = 1200;

        Livro livro2 = new Livro();
        livro2.titulo = "Dom Casmurro";
        livro2.autor = "Machado de Assis";
        livro2.numeroPaginas = 256;

        System.out.println("=== DADOS DOS LIVROS ===");
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
