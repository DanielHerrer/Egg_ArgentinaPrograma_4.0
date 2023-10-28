// G13 EJ1 - Juan Pablo Godoy

// Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
// método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
// try-catch para probar la nueva excepción que debe ser controlada.

import java.util.Scanner;
import entities.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        
        Persona p = new Persona(null,"Pablo");
        Scanner sc = new Scanner(System.in);
       
        
        try {
            System.out.println(p.esMayorDeEdad());
        }
        catch (Exception e){
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            System.out.println("No se definio la edad");
            System.out.println("Llene la edad: ");
            p.setEdad(sc.nextInt());
            System.out.println(p.getEdad());
            System.out.println(p.esMayorDeEdad());
        }

        sc.close();
    }
}
