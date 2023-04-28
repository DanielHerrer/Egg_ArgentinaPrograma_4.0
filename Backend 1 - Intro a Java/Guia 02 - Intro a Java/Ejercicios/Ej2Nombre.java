package ejercicios;
import java.util.Scanner;

public class Ej2Nombre {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        String nombre = scan.nextLine();

        System.out.println("Su nombre es "+ nombre);
        scan.close();

    }
}