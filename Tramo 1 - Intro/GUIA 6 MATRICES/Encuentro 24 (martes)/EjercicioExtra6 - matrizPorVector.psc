////	Realizar un programa que permita visualizar el resultado del producto de una matriz de enteros
////	de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden inicializarse
////	evitando así el ingreso de datos por teclado.

Algoritmo matrizPorVector
	
	Definir i, j, vector, matriz, matrizX Como Entero
	
	Dimension vector(3), matriz(3,3), matrizX(3,3)
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,9)
		FinPara
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		vector(i) = Aleatorio(1,9)
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matrizX(i,j) = matriz(i,j) * vector(j)
		FinPara
	FinPara
	
	mostrarMatriz(matriz,3,3)
	Escribir "///////////////// * /////////////////"
	mostrarVector(vector,3)
	Escribir "///////////////// = /////////////////"
	mostrarMatriz(matrizX,3,3)
	
FinAlgoritmo

SubProceso mostrarVector(vector Por Referencia, columnas Por Valor)
	Definir i Como Entero
	Para i<-0 Hasta columnas-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[", vector(i) "] "
	FinPara
	Escribir ""
FinSubProceso

SubProceso mostrarMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j Como Entero
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "] "
		FinPara
		Escribir ""
	FinPara
FinSubProceso