////	Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
////	tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
////	Por ejemplo:

////	2 7 6
////	9 5 1
////	4 3 8

//// 	2 9 4
//// 	7 5 3
//// 	6 1 8

////	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algo-
////	ritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea
////	mágica escribir la suma. Además, el programa deberá comprobar que los números introduci-
////	dos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz
////	que no debe superar orden igual a 10.

Algoritmo matriz_Magica
	Definir i, j, dim, num, matriz Como Entero
	
	Hacer
		Escribir "Defina la dimension de la matriz magica: "
		Leer dim
	Mientras Que dim > 10
	Dimension matriz(dim,dim)
	
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Para j<-0 Hasta dim-1 Con Paso 1 Hacer
			Hacer
				Escribir "Escriba el valor que ira en la fila " i+1 " y columna " j+1 ": "
				Leer matriz(i,j)
			Mientras Que matriz(i,j) > 9 O matriz(i,j) < 1
		FinPara
	FinPara
	
	Escribir "--------------------------------------------------------"
	mostrarMatriz(matriz,dim)
	Escribir "--------------------------------------------------------"
	esMagica(matriz,dim)
	
FinAlgoritmo

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso esMagica(matriz Por Referencia, final Por Valor)
	Definir i, j, fila1, fila2, diag1, diag2, columna1, columna2 Como Entero
	Definir filasSiNo, columnasSiNo, diagonalSiNo Como Logico
	
	/// COMPRUEBA LAS FILAS
	fila1=0
	fila2=0
	i = 0
	Para j<-0 Hasta final-1 Con Paso 1 Hacer
		fila1 = fila1 + matriz(i,j)
	FinPara
	i = i + 1 	
	
	Hacer
		Para j<-0 Hasta final-1 Con Paso 1 Hacer
			fila2 = fila2 + matriz(i,j)
		FinPara
		i = i + 1	
		
		Si fila1 == fila2 Entonces
			fila1 = fila2 
			fila2 = 0
			filasSiNo = Verdadero
		SiNo
			filasSiNo = Falso
		FinSi
	Mientras Que i <= final-1 Y filasSiNo <> Falso
	
	/// COMPRUEBA LAS COLUMNAS
	columna1 = 0
	columna2 = 0 
	j = 0
	Para i<-0 Hasta final-1 Con Paso 1 Hacer
		columna1 = columna1 + matriz(i,j)
	FinPara
	j = j + 1
	
	Hacer
		Para i<-0 Hasta final-1 Con Paso 1 Hacer
			columna2 = columna2 + matriz(j,i)
		FinPara
		j = j + 1
		
		Si columna1 == columna2 Entonces
			columna1 = columna2 
			columna2 = 0
			columnasSiNo = Verdadero
		SiNo
			columnasSiNo = Falso
		FinSi
	Mientras Que j <= final-1 Y columnasSiNo <> Falso
	
	
	/// COMPRUEBA LAS DIAGONALES
	diag1 = 0
	diag2 = 0
	i = 0
	j = 0
	Hacer 
		diag1 = diag1 + matriz(i,j)
		i = i + 1
		j = j + 1
	Mientras Que i <= final-1 Y j <= final-1
	
	i = 0
	j = final-1
	Hacer 
		diag2 = diag2 + matriz(i,j)
		i = i + 1
		j = j - 1
	Mientras Que i <= final-1 Y j >= 0
	
	Si diag1 == diag2 Entonces
		diagonalSiNo = Verdadero
	SiNo
		diagonalSiNo = Falso
	FinSi
	
	/// COMPROBACION FINAL
	Si filasSiNo == Verdadero Y diagonalSiNo == Verdadero Y columnasSiNo == Verdadero Entonces
		Escribir "La matriz SI es magica."
		Escribir "La suma de sus filas, columnas y diagonales siempre dan: ", diag1
	SiNo
		Escribir "La matriz NO es magica."
	FinSi
	
FinSubProceso

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso mostrarMatriz(matriz Por Referencia, final Por Valor)
	Definir i, j Como Entero
	Para i<-0 Hasta final-1 Con Paso 1 Hacer
		Para j<-0 Hasta final-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir ""
	FinPara
FinSubProceso