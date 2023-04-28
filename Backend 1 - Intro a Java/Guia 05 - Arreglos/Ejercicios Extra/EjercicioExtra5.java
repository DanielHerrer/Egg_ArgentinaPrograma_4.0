/// EJERCICIO EXTRA 5
// Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
//  y muestre la suma de sus elementos.

import java.util.Scanner;

public class EjercicioExtra5 {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese las filas y columnas de la matriz:");
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] matriz = new int[x][y];

        int sumaTotal = 0;


        // for(int elemento: vector) FOR MEJORADO PARA RECORRER LISTAS

        // for(int[] fila: matriz) { RECORRE FILA X FILA
        //    for(int elemento: fila){  RECORRE CADA ELEMENTO DE LA FILA
        //         CODIGO
        //    }
        //}

        for(int[] fila: matriz) {
           for(int elemento: fila){ 
                elemento = (int) (Math.random()*9 +1);
                System.out.print("["+elemento+"] ");
                sumaTotal += elemento;
           }
           System.out.println("");
        }

        System.out.println("La suma total de los elementos de la matriz es = "+sumaTotal);

        in.close();
    }
}