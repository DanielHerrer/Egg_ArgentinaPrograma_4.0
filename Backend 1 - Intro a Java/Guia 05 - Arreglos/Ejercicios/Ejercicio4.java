/// EJERCICIO 4
// Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
// La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        Scanner in = new Scanner(System.in);

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz1[i][j] = (int) (Math.random()*8 +1);
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz2[j][i] = matriz1[i][j];
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("[" + matriz1[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("///////////////");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("[" +matriz2[i][j]+ "]");
            }
            System.out.println("");
        }
        in.close();
    }
}
