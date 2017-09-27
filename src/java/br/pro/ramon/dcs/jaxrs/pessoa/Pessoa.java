package br.pro.ramon.dcs.jaxrs.pessoa;

public class Pessoa {

    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Imc getImc() {
        return new Imc(peso, altura);
    }

}
