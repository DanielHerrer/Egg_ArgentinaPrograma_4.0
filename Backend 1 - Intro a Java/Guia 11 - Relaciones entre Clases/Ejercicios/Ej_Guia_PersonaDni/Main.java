// Prueba acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.

package Ej_Guia_PersonaDni;
import Ej_Guia_PersonaDni.entities.Persona;
import Ej_Guia_PersonaDni.entities.Dni;

public class Main {

    public static void main(String[]args){

        Dni dni = new Dni('a',41102394);
        Persona p = new Persona("Juan", "Perez",dni);

        System.out.println("El caracter del DNI de "+p.getNombre()+" es = "+ p.getDni().getCaracter());

    }
    
}