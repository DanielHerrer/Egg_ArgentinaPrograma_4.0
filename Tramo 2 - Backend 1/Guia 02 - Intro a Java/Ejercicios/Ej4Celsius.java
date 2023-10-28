package ejercicios;
import java.util.Scanner;

public class Ej4Celsius {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura en grados Celsius:");
        Float celsius = scan.nextFloat();

        Float fahrenheit = 32 + (9 * celsius / 5);

        System.out.println("Los "+ celsius +"º celsius son equivalentes a "+ fahrenheit +"º fahrenheit.");
        scan.close();

    }
}