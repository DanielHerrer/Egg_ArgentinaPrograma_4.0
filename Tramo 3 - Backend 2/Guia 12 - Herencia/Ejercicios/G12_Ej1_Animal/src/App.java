// GUIA 12 EJERCICIO 1 - Franco Daniel Herrera

// Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.

import entities.Animal;
import entities.Caballo;
import entities.Perro;
import entities.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        
        Animal perro1 = new Perro("Stitch","Carnivoro",15,"Doberman");
        perro1.alimentarse();

        Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuaha");
        perro2.alimentarse();

        Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.alimentarse();

    }
}
