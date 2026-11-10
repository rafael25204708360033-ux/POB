package Semana04.ExAbstract.Ex05.controle;

import Semana04.ExAbstract.Ex05.dominio.Alimento;
import Semana04.ExAbstract.Ex05.dominio.Eletronico;
import Semana04.ExAbstract.Ex05.dominio.Item;
import Semana04.ExAbstract.Ex05.dominio.Tributavel;
import java.util.ArrayList;
import java.util.List;

public class ControleTributacao {

    public static double calcularTotalImpostos(List<Tributavel> itensTributaveis) {
        double totalImpostos = 0.0;
        for (Tributavel item : itensTributaveis) {
            totalImpostos += item.calcularTributo();
        }
        return totalImpostos;
    }

    public static void main(String[] args) {
        List<Item> estoque = new ArrayList<>();
        estoque.add(new Eletronico(101, 3000.00)); // Notebook
        estoque.add(new Alimento(102, 25.00));     // Arroz
        estoque.add(new Eletronico(103, 800.00));  // Monitor
        estoque.add(new Alimento(104, 12.00));     // Leite

        // Filtrando itens tributáveis para a lista específica
        List<Tributavel> itensTributaveis = new ArrayList<>();
        for (Item item : estoque) {
            if (item instanceof Tributavel) {
                itensTributaveis.add((Tributavel) item);
            }
        }

        System.out.println("=== RELATORIO DE TRIBUTACAO ===");
        for (Tributavel t : itensTributaveis) {
            Item itemObj = (Item) t;
            System.out.printf("Item Codigo: %d | Preco Base: R$ %.2f | Imposto (15%%): R$ %.2f\n", 
                              itemObj.getCodigo(), itemObj.getPrecoBase(), t.calcularTributo());
        }

        double totalImposto = calcularTotalImpostos(itensTributaveis);
        System.out.printf("\nTotal de Impostos a Recolher: R$ %.2f\n", totalImposto);
    }
}
