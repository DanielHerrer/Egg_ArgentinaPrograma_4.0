
package claseservicio.Servicio;

import claseservicio.Entidad.Persona;
import java.util.Scanner;


public class ServicioPersona {
    

    public ServicioPersona() {
    }
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona();
        
        System.out.println("Ingrese el nombre de la persona: ");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad: ");
        p.setEdad(leer.nextInt());
        
        
        return p;
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: "+ p.getEdad());
    }
    
    
}
