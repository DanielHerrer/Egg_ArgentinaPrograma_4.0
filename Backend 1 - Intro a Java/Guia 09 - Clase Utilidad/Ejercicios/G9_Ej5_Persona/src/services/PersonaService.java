// Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
// Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
// Retornar el objeto Persona creado.
// Método calcularEdad que calcule la edad del usuario utilizando 
// el atributo de fecha de nacimiento y la fecha actual.
// Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que 
// la edad consultada o false en caso contrario.
// Método mostrarPersona que muestra la información de la persona deseada.

package services;
import java.util.Date;
import java.util.Scanner;
import entities.Persona;

public class PersonaService {

    public Persona crearPersona(){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese nombre de la persona =>");
        String nombre = read.nextLine();
        //////////////////////////////////////////////////////
        System.out.print("Ingrese dia de nacimiento => ");
        int dd = read.nextInt();
        System.out.print("Ingrese mes de nacimiento => ");
        int mm = read.nextInt();
        System.out.print("Ingrese año de nacimiento => ");
        int aa = read.nextInt();
        System.out.println("");
        Date fechaActual = new Date();
        while(!(dd<1 || dd>31 || mm<1 || mm>12 || aa>fechaActual.getYear() || aa<1900)){
            System.out.println("Fecha ingresada incorrecta!");
            System.out.print("Ingrese dia de nacimiento => ");
            dd = read.nextInt();
            System.out.print("Ingrese mes de nacimiento => ");
            mm = read.nextInt();
            System.out.print("Ingrese año de nacimiento => ");
            aa = read.nextInt();
            System.out.println("");
        }
        Date fechaNac = new Date(aa-1900,mm-1,dd);
        ///////////////////////////////////////////////////////
        return new Persona(nombre,fechaNac);
    }

    public int calcularEdad(Persona p){
        Date fechaActual = new Date();
        return (fechaActual.getYear()-p.getFechaNac().getYear());
    }

    public Boolean menorQue(Persona p, int edad){
        if(calcularEdad(p)<edad){
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: "+p.getNombre()+"\nEdad: "+calcularEdad(p)+"\nFecha Nacimiento: "+p.getFechaNac());
    }

}
