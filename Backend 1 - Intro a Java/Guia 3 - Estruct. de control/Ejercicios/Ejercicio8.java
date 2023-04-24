/// EJERCICIO 8
// Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
// Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
// * * * *
// *     *
// *     *
// * * * *

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int tamaño;

        System.out.println("Ingrese N elementos del cuadrado: ");
        tamaño = in.nextInt();
        in.close();

        for(int i=0;i<tamaño;i++){
            for(int j=0;j<tamaño;j++){
                if(i>0 && i<tamaño-1 && j>0 && j<tamaño-1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }   
            System.out.println("");
        }
    }
}
