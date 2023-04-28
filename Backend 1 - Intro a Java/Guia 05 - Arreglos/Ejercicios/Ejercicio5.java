/// EJERCICIO 5
// Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica 
// cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
// La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] matriz=new int[3][3];
        int cont=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Escribe un valor para la matriz: ");
                int num = in.nextInt();
                matriz[i][j]=num;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j] == -matriz[j][i]){ // COMPARA LA MATRIZ POSITIVA Y UNA MATRIZ NEGATIVA
                    cont++;
                }
            }
        }

        if(cont == 9){
            System.out.println("La matriz es antisimetrica.");
        }else{
            System.out.println("La matriz no es antisimetrica.");
        }
        in.close();
    }
}