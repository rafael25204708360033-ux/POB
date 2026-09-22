package Semana04.ExHeranca.Ex01.dominio;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
