/// EJERCICIO EXTRA 3 - GUIA 5
// Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
// Después haremos otra función o procedimiento que imprima el vector.

import java.util.Scanner;

public class EjercicioExtra3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int N = in.nextInt();
        int[] vector = new int[N];

        rellenarVector(vector);
        mostrarVector(vector);
        in.close();
    }

    public static void rellenarVector(int vector[]){
        for(int i=0; i<vector.length; i++){
            vector[i] = (int) (Math.random()*9 +1); // RANDOM DEL 1 AL 9
        }
    }

    public static void mostrarVector(int vector[]){
        for(int i=0; i<vector.length; i++){
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("");
    }
}
