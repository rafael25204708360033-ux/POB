package controle;

import dominio.CatalogoService;
import dominio.Produto;

public class CatalogoApp {
    public static void main(String[] args) {
        CatalogoService service = new CatalogoService();

        System.out.println("=== 1. CADASTRO DE PRODUTOS FORA DE ORDEM DE PRECO ===");
        try {
            service.cadastrar(new Produto("P001", "Monitor 27 Pol", 1200.00, 5));
            service.cadastrar(new Produto("P002", "Mouse Sem Fio", 80.00, 15));
            service.cadastrar(new Produto("P003", "Teclado Mecanico", 350.00, 8));
            service.cadastrar(new Produto("P004", "Cabo HDMI 2.0", 25.00, 30));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro na criacao do produto: " + e.getMessage());
        }

        System.out.println("\n=== 2. CATALOGO ORIGINAL ===");
        service.listarCatalogo();

        System.out.println("\n=== 3. REMOCAO DE ITEM INTERMEDIARIO (P003) ===");
        service.excluirPorCodigo("P003");

        System.out.println("\n=== CATALOGO APOS REMOCAO (Ajuste dinamico de indices) ===");
        service.listarCatalogo();

        System.out.println("\n=== 4. ORDENACAO POR PRECO (CRESCENTE) ===");
        service.ordenarPorPreco();
        service.listarCatalogo();
    }
}
