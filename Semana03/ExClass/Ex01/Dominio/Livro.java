package Semana03.ExClass.Ex01.Dominio;

public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de Paginas: " + numeroPaginas);
        System.out.println("-----------------------------------");
    }
}
