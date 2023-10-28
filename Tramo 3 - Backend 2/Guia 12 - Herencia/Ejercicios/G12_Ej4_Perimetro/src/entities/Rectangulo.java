package entities;

import interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {
    
    // private int x, y, largura, altura;
    private float base, altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    // Área rectángulo: base * altura 
    @Override
    public float calculaArea() {
        return base * altura;
    }

    // Perímetro rectángulo: (base + altura) * 2.
    @Override
    public float calcularPerimetro() {
        return (base + altura) * 2;
    }

}
