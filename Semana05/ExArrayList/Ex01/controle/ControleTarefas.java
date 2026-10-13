package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ControleTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        System.out.println("=== 1. ADICIONANDO 5 TAREFAS INICIAIS ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª tarefa: ");
            tarefas.add(scanner.nextLine());
        }

        System.out.println("\n=== 2. REMOVENDO UMA TAREFA ===");
        System.out.print("Digite o nome da tarefa que deseja remover: ");
        String tarefaRemover = scanner.nextLine();
        
        if (tarefas.remove(tarefaRemover)) {
            System.out.println("Tarefa \"" + tarefaRemover + "\" removida com sucesso!");
        } else {
            System.out.println("Tarefa nao encontrada na lista.");
        }

        System.out.println("\n=== 3. VERIFICANDO EXISTENCIA ===");
        System.out.print("Digite uma tarefa para pesquisar: ");
        String tarefaBusca = scanner.nextLine();
        
        if (tarefas.contains(tarefaBusca)) {
            System.out.println("A tarefa \"" + tarefaBusca + "\" existe na lista.");
        } else {
            System.out.println("A tarefa \"" + tarefaBusca + "\" nao foi encontrada.");
        }

        System.out.println("\n=== 4. LISTA ORDENADA ALFABETICAMENTE ===");
        Collections.sort(tarefas);
        for (String t : tarefas) {
            System.out.println("- " + t);
        }

        scanner.close();
    }
}
