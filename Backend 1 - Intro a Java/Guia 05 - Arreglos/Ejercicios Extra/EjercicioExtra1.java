/// EJERCICIO EXTRA 1 - GUIA 5
// Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
// con los valores ingresados por el usuario.

import java.util.Scanner;

public class EjercicioExtra1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int sumaTotal = 0, N, num;

        System.out.println("Ingrese el tamaño del vector:");
        N = in.nextInt();
        int[] vector = new int[N];

        for(int i=0; i<vector.length; i++){
            System.out.println("Ingrese un valor al vector: ");
            num = in.nextInt();
            vector[i] = num;
            sumaTotal += vector[i];
        }
        System.out.println("//////////////////////////////////////////////////////////////////");
        for(int i=0; i<vector.length; i++){
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("\nLa suma total de los valores del vector da = "+sumaTotal);
        in.close();
    }
}