// La clase Dni tendrá como atributos la serie (carácter) y número.

package Ej_Guia_PersonaDni.entities;

public class Dni {
    private Character caracter;
    private Integer numero;

    public Dni() {
    }

    public Dni(Character caracter, Integer numero) {
        this.caracter = caracter;
        this.numero = numero;
    }

    public Character getCaracter() {
        return caracter;
    }

    public void setCaracter(Character caracter) {
        this.caracter = caracter;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni [caracter=" + caracter + ", numero=" + numero + "]";
    }
    
}
