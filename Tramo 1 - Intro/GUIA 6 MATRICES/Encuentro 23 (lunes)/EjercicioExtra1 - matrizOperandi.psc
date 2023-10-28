//// Realizar un programa que rellene de números aleatorios una matriz a través de un 
//// sub programa y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo matrizOperandi
	Definir matriz, filas, columnas Como Entero 
	
	Escribir "Defina las filas y columnas de la matriz: "
	Leer filas, columnas
	Dimension matriz(filas,columnas)
	
	rellenarMatriz(matriz,filas,columnas)
	mostrarMatriz(matriz,filas,columnas)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j Como Entero
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,9)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j Como Entero
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir ""
	FinPara
FinSubProceso