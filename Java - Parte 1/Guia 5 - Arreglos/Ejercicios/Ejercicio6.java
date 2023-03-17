/// EJERCICIO 6
// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
// sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
// y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
// correctos, es decir, están entre el 1 y el 9.

//  2  7  6
//  9  5  1    =   15
//  4  3  8

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                do{
                    System.out.println("Ingrese un numero del 1 al 9: ");
                    num = in.nextInt();
                }while(num<1 || num>9);

                matriz[i][j] = num;
            }
        }

        esMagica3x3(matriz);
        in.close();
    }

    public static void esMagica3x3(int matriz[][]){
        Boolean filasB, columnasB, diagonalesB;

        //////////////////////////////////////////////////////////// COMPRUEBA LAS FILAS
        int iFila=0, fila1=0, fila2=0;

        for(int j=0; j<3; j++){
           fila1 += matriz[iFila][j];
        }

        iFila += 1;
        do{
            for(int j=0; j<3; j++){
                fila2 += matriz[iFila][j];
            }

            iFila += 1;

            if(fila1 == fila2){
                fila1 = fila2;
                fila2 = 0;
                filasB = true;
            }else{
                filasB = false;
            }
        }while(iFila<3 && filasB!=false);

        //////////////////////////////////////////////////////////// COMPRUEBA LAS COLUMNAS
        int iColu=0, columna1=0, columna2=0;

        for(int i=0; i<3; i++){
            columna1 += matriz[i][iColu];
        }

        iColu += 1;

        do{
            for(int i=0; i<3; i++){
                columna2 += matriz[i][iColu];
            }

            iColu += 1;

            if(columna1 == columna2){
                columna1 = columna2;
                columna2 = 0;
                columnasB = true;
            }else{
                columnasB = false;
            }

        }while(iColu<3 && columnasB!=false);

        //////////////////////////////////////////////////////////// COMPRUEBA LAS DIAGONALES
        int diag1=0, diag2=0;
        iFila=0;
        iColu=0;

        do{
            diag1 += matriz[iFila][iColu];
            iFila += 1;
            iColu += 1;
        }while(iFila<3 && iColu<3);

        iFila = 0;
        iColu = 2;
        do{
            diag2 += matriz[iFila][iColu];
            iFila += 1;
            iColu -= 1;
        }while(iFila<3 && iColu>=0);

        if(diag1==diag2){
            diagonalesB = true;
        }else{
            diagonalesB = false;
        }

        //////////////////////////////////////////////////////////// COMPROBACION FINAL

        if(filasB == true && diagonalesB == true && columnasB == true){
            System.out.println("La matriz SI es magica");
            System.out.println("La suma de sus filas, columnas y diagonales dan = "+diag1);
        }else{
            System.out.println("La matriz NO es magica");
        }

    }
}