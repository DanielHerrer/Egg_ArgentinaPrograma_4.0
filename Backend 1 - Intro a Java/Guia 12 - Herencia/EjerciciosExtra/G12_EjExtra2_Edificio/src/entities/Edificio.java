// Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
// edificio tendrá como métodos:
// • Método calcularSuperficie(): calcula la superficie del edificio.
// • Método calcularVolumen(): calcula el volumen del edifico.
// Estos métodos serán abstractos.

package entities;

import java.util.Scanner;

public abstract class Edificio {

    protected Scanner read = new Scanner(System.in);
    protected float ancho, alto, largo;

    public Edificio(){
        System.out.print("Ingrese el ancho del edificio => ");
        ancho = read.nextFloat();
        read.nextLine();
        System.out.print("Ingrese el largo del edificio => ");
        largo = read.nextFloat();
        read.nextLine();
        System.out.print("Ingrese el alto del edificio => ");
        alto = read.nextFloat();
        read.nextLine();
    }

    public Edificio(float ancho, float alto, float largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract float calcularSuperficie();

    public abstract float calcularVolumen();

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio [ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "]";
    }
    
}
