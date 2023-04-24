////Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
////un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subpro-
////grama que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los re-
////sultados por pantalla.

Algoritmo sumaTotalMatriz
	
	Definir matriz, i, j Como Entero
	
	Escribir "Cuantas filas y columnas debe tener la matriz?: "
	Leer i, j
	Dimension matriz(i,j)
	
	Escribir "-------------------------------------------------------------------------------------"
	Escribir "Rellenando matriz..."
	rellenarMatriz(matriz,i,j)
	
	Escribir "-------------------------------------------------------------------------------------"
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]" 
		FinPara
		Escribir ""
	FinPara
	
	Escribir "-------------------------------------------------------------------------------------"
	Escribir "La suma total de todos los elementos de la matriz es: " sumarElementosMatriz(matriz,i,j)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j Como Entero
	Para i<-0 Hasta filas - 1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas - 1 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

Funcion sumaTotal <- sumarElementosMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j, sumaTotal Como Entero
	sumaTotal = 0
	Para i<-0 Hasta filas - 1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas - 1 Con Paso 1 Hacer
			sumaTotal = sumaTotal + matriz(i,j)
		FinPara
	FinPara
FinSubProceso