/// EJERCICIO 2
// Crear un programa que pida una frase y si esa frase es igual a “eureka”
//  el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String palabra;
        do { 
            System.out.println("Escriba la contraseña: ");   
            palabra = in.nextLine();

            if(palabra.equals("eureka")){  

                System.out.println("CORRECTO.");

            } else { 

                System.out.println("INCORRECTO.");

            }

        }while (!palabra.equals("eureka"));
        in.close();
    }
}