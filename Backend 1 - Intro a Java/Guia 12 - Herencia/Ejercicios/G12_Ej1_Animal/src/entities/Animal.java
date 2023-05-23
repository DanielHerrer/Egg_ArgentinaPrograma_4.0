// La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
// Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
// mensaje por pantalla informando de que se alimenta.

package entities;

public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(){}

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public abstract void alimentarse();

}

