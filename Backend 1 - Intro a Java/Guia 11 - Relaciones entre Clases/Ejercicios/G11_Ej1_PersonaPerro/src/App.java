// GUIA 11 EJERCICIO 1 - Daniel Franco Herrera
// Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
// clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
// atributos: nombre, apellido, edad, documento y Perro.
// Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
// pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
// la clase Persona, la información del Perro y de la Persona.

import java.util.ArrayList;
import java.util.Scanner;

import entities.Perro;
import entities.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);

        Persona persona1 = new Persona("Lucas","Rodriguez", 21, 41698573);
        Persona persona2 = new Persona("Matias","Gutierrez", 29,39687314);
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);

        Perro perro1 = new Perro("Pipo","Beagle",1,43.0);
        Perro perro2 = new Perro("Chiquito","Caniche",4,24.0);
        ArrayList<Perro> perros = new ArrayList<>();
        perros.add(perro1);
        perros.add(perro2);

        for(Persona persona: personas){
            Boolean perroEncontrado = false;
            do{
                System.out.println(persona.getNombre()+" "+persona.getApellido()+", cual perro deseas adoptar?");
                System.out.println(perros.toString());
                System.out.print("Ingrese el nombre de la mascota a adoptar => ");
                String nombre = read.nextLine();
                for(Perro perro: perros){
                    if(perro.getNombre().equalsIgnoreCase(nombre)){
                        System.out.println(perro.getNombre()+" se pone muy contento!");
                        persona.setPerro(perro);
                        perros.remove(perro);
                        perroEncontrado = true;
                        System.out.println("Adoptado!");
                        break;
                    }
                }
                if(!perroEncontrado==true){
                    System.out.println("Perro no encontrado!");
                }
            }while(!perroEncontrado==true);
        }

        read.close();
    }
}
