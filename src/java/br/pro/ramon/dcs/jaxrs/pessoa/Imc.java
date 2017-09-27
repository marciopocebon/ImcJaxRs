package br.pro.ramon.dcs.jaxrs.pessoa;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Imc implements Serializable {

    private double peso;
    private double altura;

    protected Imc() {
    }

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    @XmlElement
    public double getValor() {
        return peso / Math.pow(altura, 2);
    }

    @XmlElement
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
