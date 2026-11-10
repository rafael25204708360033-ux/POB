package Semana04.ExAbstract.Ex03.controle;

import Semana04.ExAbstract.Ex03.dominio.Administrador;
import Semana04.ExAbstract.Ex03.dominio.Usuario;


public class ControleAutenticacao {
    public static void main(String[] args) {
        Usuario user = new Usuario("rafael.user", "123456");
        Administrador admin = new Administrador("admin.master", "admin2026", 1);

        System.out.println("=== TESTES DE AUTENTICACAO ===");
        System.out.println("Usuario autenticado? " + user.autenticar("123456"));
        System.out.println("Admin autenticado? " + admin.autenticar("senhaErrada"));

        System.out.println("\n=== EXPORTACAO JSON DO ADMINISTRADOR ===");
        System.out.println(admin.exportarJSON());
    }
}
