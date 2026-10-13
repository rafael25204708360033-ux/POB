package dominio;

import java.util.HashMap;
import java.util.Map;

public class EstoqueService {
    private Map<String, Integer> inventario;

    public EstoqueService() {
        this.inventario = new HashMap<>();
    }

    public void inserirProduto(String codigo, int quantidadeInicial) {
        if (!inventario.containsKey(codigo)) {
            inventario.put(codigo, Math.max(0, quantidadeInicial));
            System.out.println("Produto " + codigo + " inserido com estoque: " + quantidadeInicial);
        } else {
            System.out.println("Erro: Produto com codigo " + codigo + " ja existe.");
        }
    }

    public void atualizarEstoque(String codigo, int quantidade) {
        if (inventario.containsKey(codigo)) {
            int atual = inventario.get(codigo);
            int novoEstoque = atual + quantidade;
            if (novoEstoque < 0) {
                System.out.println("Erro: Operacao invalida. Estoque nao pode ficar negativo.");
            } else {
                inventario.put(codigo, novoEstoque);
                System.out.println("Estoque do produto " + codigo + " atualizado para: " + novoEstoque);
            }
        } else {
            System.out.println("Erro: Produto " + codigo + " nao encontrado.");
        }
    }

    public void exibirEstoqueBaixo(int limite) {
        System.out.println("\n=== PRODUTOS COM ESTOQUE ABAIXO DE " + limite + " UNIDADES ===");
        boolean encontrou = false;
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            if (entry.getValue() < limite) {
                System.out.println("Codigo: " + entry.getKey() + " | Quantidade: " + entry.getValue());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum produto abaixo do limite de alerta.");
        }
    }
}
