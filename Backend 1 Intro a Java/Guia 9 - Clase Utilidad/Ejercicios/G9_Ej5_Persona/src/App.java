// GUIA 9 EJERCICIO 5 - Daniel Franco Herrera

import entities.Persona;
import services.PersonaService;

public class App {
    public static void main(String[] args) throws Exception {
        
        PersonaService ps = new PersonaService();
        Persona p = ps.crearPersona();
        if(ps.menorQue(p, 18)){
            System.out.println(p.getNombre()+" es menor de edad.");
        }else{
            System.out.println(p.getNombre()+" es mayor de edad.");
        }
        ps.mostrarPersona(p);

    }
}
