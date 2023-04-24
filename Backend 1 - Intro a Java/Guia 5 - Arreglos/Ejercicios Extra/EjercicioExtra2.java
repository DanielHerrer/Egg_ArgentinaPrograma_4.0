/// EJERCICIO EXTRA 2 - GUIA 5
// Escriba un programa que averigüe si dos vectores de N enteros son iguales 
// (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

import java.util.Scanner;

public class EjercicioExtra2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Boolean iguales = true;
        int N;

        System.out.println("Ingrese el tamaño de los vectores:");
        N = in.nextInt();
        int[] vector1 = new int[N];
        int[] vector2 = new int[N];

        for(int i=0; i<vector1.length; i++){
            System.out.println("Ingrese un valor para el vector 1 :" );
            vector1[i] = in.nextInt();
        }
        System.out.println("Vector 1 completo.");

        for(int i=0; i<vector2.length; i++){
            System.out.println("Ingrese un valor para el vector 2 :" );
            vector2[i] = in.nextInt();
        }
        System.out.println("Vector 2 completo.");

        for(int i=0; i<vector2.length; i++){
            if(vector1[i] != vector2[i]){
                iguales = false;
                break;
            }
        }

        if(iguales == true){
            System.out.println("Los dos vectores son iguales.");
        }else{
            System.out.println("Los dos vectores son desiguales.");
        }
        in.close();
    }    
}
