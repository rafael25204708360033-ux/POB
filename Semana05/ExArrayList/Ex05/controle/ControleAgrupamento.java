package controle;

import dominio.Produto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControleAgrupamento {
    public static void main(String[] args) {
        // Criacao da lista geral de produtos
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Notebook Gamer", "Informatica", 4500.00));
        listaProdutos.add(new Produto("Teclado Mecanico", "Informatica", 250.00));
        listaProdutos.add(new Produto("Arroz 5kg", "Alimentos", 25.00));
        listaProdutos.add(new Produto("Feijao 1kg", "Alimentos", 8.50));
        listaProdutos.add(new Produto("Clean Code", "Livros", 95.00));
        listaProdutos.add(new Produto("Entendendo Algoritmos", "Livros", 65.00));

        // Estrutura para agrupar por Categoria (Map<Categoria, ListaDeProdutos>)
        Map<String, List<Produto>> produtosPorCategoria = new HashMap<>();

        for (Produto p : listaProdutos) {
            String cat = p.getCategoria();

            // Inicializacao condicional da lista caso a categoria ainda nao exista no Map
            if (!produtosPorCategoria.containsKey(cat)) {
                produtosPorCategoria.put(cat, new ArrayList<>());
            }

            produtosPorCategoria.get(cat).add(p);
        }

        System.out.println("=== PRODUTOS AGRUPADOS POR CATEGORIA ===\n");
        for (Map.Entry<String, List<Produto>> entry : produtosPorCategoria.entrySet()) {
            System.out.println("Categoria: " + entry.getKey());
            for (Produto p : entry.getValue()) {
                System.out.println("  - " + p);
            }
            System.out.println();
        }
    }
}
