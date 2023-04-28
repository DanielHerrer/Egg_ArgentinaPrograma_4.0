/// EJERCICIO 3
// Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
//  Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
//   por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String palabra;
        do{ 
            System.out.println("Escriba una palabra: ");
            palabra = in.nextLine();
            if (palabra.length() == 8 ) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        }while (palabra.length()!=8);
        in.close();
    }
}
