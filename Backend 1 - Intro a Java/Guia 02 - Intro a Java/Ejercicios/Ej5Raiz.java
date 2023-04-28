package ejercicios;
import java.util.Scanner;

public class Ej5Raiz {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int num = scan.nextInt();

        System.out.println("El doble de "+ num +" equivale a "+ num * 2);
        System.out.println("El triple de "+ num +" equivale a "+ num * 3);
        System.out.println("La raiz de "+ num +" equivale a "+ Math.sqrt(num));
        scan.close();

    }
}