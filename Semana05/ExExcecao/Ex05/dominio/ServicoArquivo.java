package dominio;

import java.io.IOException;

public class ServicoArquivo {
    public void processarArquivo(String caminho) throws ProcessamentoDadosException {
        try {
            if (caminho == null || caminho.trim().isEmpty()) {
                throw new IOException("O caminho fornecido e nulo ou está vazio.");
            }
            System.out.println("Lendo e processando dados do arquivo: " + caminho);

        } catch (IOException e) {
            // Relança encapsulada dentro da exceção de negócio preservando a causa original
            throw new ProcessamentoDadosException("Falha ao processar o arquivo de dados.", e);
        }
    }
}
