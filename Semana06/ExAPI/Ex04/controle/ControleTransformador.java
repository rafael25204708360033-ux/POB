package Semana06.ExAPI.Ex04.controle;

import Semana06.ExAPI.Ex04.dominio.TransformadorTexto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControleTransformador {

    public static List<String> processarLista(List<String> lista, TransformadorTexto regra) {
        List<String> resultado = new ArrayList<>();
        for (String item : lista) {
            resultado.add(regra.transformar(item));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<String> linguagens = Arrays.asList("Java", "Python", "JavaScript", "C++");

        // Regra 1: Method Reference para Caixa Alta
        List<String> caixaAlta = processarLista(linguagens, String::toUpperCase);
        System.out.println("Caixa Alta: " + caixaAlta);

        // Regra 2: Lambda para inverter String
        List<String> invertidas = processarLista(linguagens, texto -> new StringBuilder(texto).reverse().toString());
        System.out.println("Invertidas: " + invertidas);

        // Regra 3: Lambda para colocar entre colchetes
        List<String> comColchetes = processarLista(linguagens, texto -> "[" + texto + "]");
        System.out.println("Entre Colchetes: " + comColchetes);
    }
}