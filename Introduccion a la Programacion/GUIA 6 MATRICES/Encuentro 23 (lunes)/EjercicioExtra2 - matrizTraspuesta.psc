////   	Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
////	con números aleatorios entre 1 y 100 y mostrar su traspuesta.

Algoritmo matrizTraspuesta
	
	Definir matriz, filas, columnas Como Entero
	
	Escribir "Defina las filas y columnas de su matriz: "
	Leer filas, columnas
	Dimension matriz(filas,columnas)
	
	Mostrar "////////////////////////////////////////////////"
	rellenarMatriz(matriz,filas,columnas)
	mostrarMatriz(matriz,filas,columnas)
	
	Mostrar "////////////////////////////////////////////////"
	trasponerMatriz(matriz,filas,columnas)
	
FinAlgoritmo

SubProceso trasponerMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir matrizT, i, j Como Entero
	Dimension matrizT(columnas, filas)
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			matrizT(j,i) = matriz(i,j)
		FinPara
	FinPara
	mostrarMatriz(matrizT,columnas,filas)
FinSubProceso


SubProceso rellenarMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j Como Entero
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,100)
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