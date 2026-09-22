package dominio;

public class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean isEmMovimento() {
        return velocidadeAtual > 0;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public void frear(int decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }
}
