package entities;

import interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    // Área circulo: PI * radio ^ 2 
    @Override
    public float calculaArea() {
        return PI * (radio * radio);
    }

    // Perímetro circulo: PI * diámetro. (diametro = radio * 2)
    @Override
    public float calcularPerimetro() {
        return PI * (radio * 2);
    }

}
