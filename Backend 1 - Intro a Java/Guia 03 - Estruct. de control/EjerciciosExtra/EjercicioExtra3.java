/// EJERCICIO EXTRA 3
// Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
// Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

import java.util.Scanner;

public class EjercicioExtra3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String letra;
        do{
            System.out.println("Ingrese una letra: ");
            letra = in.next();
        }while(letra.length()>1);

        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            System.out.println("La letra ingresada ES VOCAL");
        }else{
            System.out.println("La letra ingresada NO ES VOCAL");
        }
        in.close();
        
    }
}
