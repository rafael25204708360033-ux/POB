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

       
        List<String> caixaAlta = processarLista(linguagens, String::toUpperCase);
        System.out.println("Caixa Alta: " + caixaAlta);

        
        List<String> invertidas = processarLista(linguagens, texto -> new StringBuilder(texto).reverse().toString());
        System.out.println("Invertidas: " + invertidas);

        
        List<String> comColchetes = processarLista(linguagens, texto -> "[" + texto + "]");
        System.out.println("Entre Colchetes: " + comColchetes);
    }
}