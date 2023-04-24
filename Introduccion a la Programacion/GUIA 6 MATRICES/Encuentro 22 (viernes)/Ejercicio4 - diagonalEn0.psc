////	Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
////	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro subpro-
////	ceso para imprimir la matriz.

Algoritmo diagonalEn0
	Definir matriz, dim Como Entero
	Escribir "Defina la dimension de la matriz cuadrada: "
	Leer dim
	Dimension matriz(dim,dim)
	rellenarMatrizCuadrada(matriz,dim)
	mostrarMatriz(matriz,dim,dim)
FinAlgoritmo

SubProceso rellenarMatrizCuadrada(matriz Por Referencia,dim Por Valor)
	Definir i, j Como Entero
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Para j<-0 Hasta dim-1 Con Paso 1 Hacer
			Si i == j Entonces 
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = Aleatorio(1,9)
			FinSi
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
	