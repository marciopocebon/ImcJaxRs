package br.pro.ramon.dcs.jaxrs.pessoa;

public class Imc {

    private double peso;
    private double altura;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getValor() {
        return peso / Math.pow(altura, 2);
    }

    public String getCategoria() {
        String categoria;

        double imc = getValor();

        if (imc < 18.5) {
            categoria = "Abaixo do Peso";
        } else if (imc < 25) {
            categoria = "Peso Normal";
        } else if (imc < 30) {
            categoria = "Acima do Peso";
        } else {
            categoria = "Obesidade";
        }

        return categoria;
    }

}
