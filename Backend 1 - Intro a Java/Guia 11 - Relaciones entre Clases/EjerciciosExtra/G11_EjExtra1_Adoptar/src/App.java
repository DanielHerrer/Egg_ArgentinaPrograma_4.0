// GUIA 11 EJERCICIO EXTRA 1 - Daniel Franco Herrera
// Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
// tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
// cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
// al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
// persona.
// Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
// personas con sus respectivos perros.

import java.util.ArrayList;
import java.util.Scanner;

import entities.Perro;
import entities.Persona;

public class App {
    public static void main(String[] args) throws Exception {
                
        Scanner read = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();
        Persona persona1 = new Persona("Lucas","Rodriguez", 21, 41698573);
        Persona persona2 = new Persona("Matias","Gutierrez", 29,39687314);
        Persona persona3 = new Persona("Luis","Lopez", 20,94468738);
        Persona persona4 = new Persona("Gabriela","Zalazar", 22,69846135);
        Persona persona5 = new Persona("Federico","Salmuera", 21,97681345);
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

        ArrayList<Perro> perros = new ArrayList<>();
        Perro perro1 = new Perro("Chiquito","Bulldog",4,35.0);
        Perro perro2 = new Perro("Pipo","Beagle",1,43.0);
        Perro perro3 = new Perro("Momi","Caniche",4,24.0);
        Perro perro4 = new Perro("Selabi","Bullterrier",4,38.0);
        Perro perro5= new Perro("Lola","Salchicha",4,50.0);
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        perros.add(perro4);
        perros.add(perro5);

        for(Persona persona: personas){
            Boolean perroEncontrado = false;
            Boolean adopcionRealizada = false;
            do{
                System.out.println(persona.getNombre()+" "+persona.getApellido()+", cual perro deseas adoptar?");
                System.out.println(perros.toString());
                System.out.print("Ingrese el nombre de la mascota a adoptar => ");
                String nombre = read.nextLine();
                for(Perro perro: perros){
                    if(perro.getNombre().equalsIgnoreCase(nombre) && !perro.getAdoptado()){
                        System.out.println(perro.getNombre()+" se pone muy contento!");
                        persona.setPerro(perro);            // Se le asigna el Perro a la Persona 
                        perro.setAdoptado(true);   // El Perro es marcado como adoptado 
                        perroEncontrado = true;             // El Perro se encontró
                        adopcionRealizada = true;           // La adopción se realizó correctamente
                        System.out.println(persona.getNombre()+" has adoptado a "+perro.getNombre()+"!");
                        break;
                    }else if(perro.getAdoptado()){
                        perroEncontrado = true;             // El Perro se encontró, pero ya esta adoptado
                        System.out.println(perro.getNombre()+" ya fue adoptado!");
                    }
                }
                if(!perroEncontrado){                       // Si el Perro NO se encontró
                    System.out.println("Perro no encontrado!");
                }
            }while(!adopcionRealizada);                     // Mientras la adopción NO se haya realizado
        }

        for(Persona persona: personas){
            System.out.println(persona);
        }

        read.close();        
    }
}