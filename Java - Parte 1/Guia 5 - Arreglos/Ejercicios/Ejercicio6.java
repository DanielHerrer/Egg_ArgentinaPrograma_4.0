/// EJERCICIO 6
// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
// sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
// y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son 
// correctos, es decir, están entre el 1 y el 9.

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[]args){
        int num, fila1=0, fila2=0, diag1=0, diag2=0, columna1, columna2;
        Boolean filas, columnas, diagonales;
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                do{
                    System.out.println("Ingrese un numero del 1 al 9: ");
                    num = in.nextInt();
                }while(num<1 && num>9);

                matriz[i][j] = num;
            }
        }
        
        int index=0;
        for(int j=0; j<3; j++){
           fila1 += matriz[index][j];
        }

        do{
            for(int j=0; j<3; j++){
                fila2 += matriz[index][j];
            }

            index+=1;

            if(fila1 == fila2){
                fila1=fila2;
                fila2=0;
                filas = true;
            }else{
                filas = false;
            }
        }while(index<3 && filas!=false);

        // SIN TERMINAR
    }
}
// SubProceso esMagica(matriz Por Referencia, final Por Valor)
// 	Definir i, j, fila1, fila2, diag1, diag2, columna1, columna2 Como Entero
// 	Definir filasSiNo, columnasSiNo, diagonalSiNo Como Logico
	
// 	/// COMPRUEBA LAS FILAS
// 	fila1=0
// 	fila2=0
// 	i = 0
// 	Para j<-0 Hasta final-1 Con Paso 1 Hacer
// 		fila1 = fila1 + matriz(i,j)
// 	FinPara
// 	i = i + 1 	
	
// 	Hacer
// 		Para j<-0 Hasta final-1 Con Paso 1 Hacer
// 			fila2 = fila2 + matriz(i,j)
// 		FinPara
// 		i = i + 1	
		
// 		Si fila1 == fila2 Entonces
// 			fila1 = fila2 
// 			fila2 = 0
// 			filasSiNo = Verdadero
// 		SiNo
// 			filasSiNo = Falso
// 		FinSi
// 	Mientras Que i <= final-1 Y filasSiNo <> Falso
	
// 	/// COMPRUEBA LAS COLUMNAS
// 	columna1 = 0
// 	columna2 = 0 
// 	j = 0
// 	Para i<-0 Hasta final-1 Con Paso 1 Hacer
// 		columna1 = columna1 + matriz(i,j)
// 	FinPara
// 	j = j + 1
	
// 	Hacer
// 		Para i<-0 Hasta final-1 Con Paso 1 Hacer
// 			columna2 = columna2 + matriz(j,i)
// 		FinPara
// 		j = j + 1
		
// 		Si columna1 == columna2 Entonces
// 			columna1 = columna2 
// 			columna2 = 0
// 			columnasSiNo = Verdadero
// 		SiNo
// 			columnasSiNo = Falso
// 		FinSi
// 	Mientras Que j <= final-1 Y columnasSiNo <> Falso
	
	
// 	/// COMPRUEBA LAS DIAGONALES
// 	diag1 = 0
// 	diag2 = 0
// 	i = 0
// 	j = 0
// 	Hacer 
// 		diag1 = diag1 + matriz(i,j)
// 		i = i + 1
// 		j = j + 1
// 	Mientras Que i <= final-1 Y j <= final-1
	
// 	i = 0
// 	j = final-1
// 	Hacer 
// 		diag2 = diag2 + matriz(i,j)
// 		i = i + 1
// 		j = j - 1
// 	Mientras Que i <= final-1 Y j >= 0
	
// 	Si diag1 == diag2 Entonces
// 		diagonalSiNo = Verdadero
// 	SiNo
// 		diagonalSiNo = Falso
// 	FinSi
	
// 	/// COMPROBACION FINAL
// 	Si filasSiNo == Verdadero Y diagonalSiNo == Verdadero Y columnasSiNo == Verdadero Entonces
// 		Escribir "La matriz SI es magica."
// 		Escribir "La suma de sus filas, columnas y diagonales siempre dan: ", diag1
// 	SiNo
// 		Escribir "La matriz NO es magica."
// 	FinSi
	
// FinSubProceso