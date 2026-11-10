package Semana04.ExAbstract.Ex03.dominio;

public class Administrador implements Autenticavel, ExportavelJSON {
    private String login;
    private String senha;
    private int nivelAcesso;

    public Administrador(String login, String senha, int nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public String exportarJSON() {
        return String.format("{\n  \"login\": \"%s\",\n  \"nivelAcesso\": %d\n}", login, nivelAcesso);
    }
}
