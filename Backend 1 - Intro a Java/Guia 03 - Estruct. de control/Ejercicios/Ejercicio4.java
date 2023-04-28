/// EJERCICIO 4
// Escriba un programa que pida una frase o palabra y valide si la primera letra
//  de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
//   un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String palabra;

        System.out.println("Ingrese una palabra:");
        palabra = in.next();

        if((palabra.substring(0, 1)).equalsIgnoreCase("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        in.close();
    }
}
