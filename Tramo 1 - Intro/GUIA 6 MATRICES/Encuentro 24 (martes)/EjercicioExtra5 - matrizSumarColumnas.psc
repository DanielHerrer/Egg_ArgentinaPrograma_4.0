////	Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
////	primeras columnas contendr�n valores enteros ingresados por el usuario y en la 3 columna se
////	deber� almacenar el resultado de sumar el n�mero de la primera y segunda columna. Mostrar
////	la matriz de la siguiente forma:

////		3 + 5 = 8
////		4 + 3 = 7
////		1 + 4 = 5

Algoritmo matrizSumarColumnas
	
	Definir i, j, matriz, num, filas Como Entero
	
	Escribir "Defina la cantidad de filas que contendr� la matriz: "
	Leer filas
	Dimension matriz(filas,3)
	
	Escribir "/////////////////////////////////////////////////////////////"
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta 1 Con Paso 1 Hacer
			Escribir "Cuenta N�" i+1 ", ingrese el numero " j+1 " a sumar: "
			Leer matriz(i,j)
		FinPara
		Escribir "/////////////////////////////////////////////////////////////"
	FinPara
	
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		matriz(i,2) = matriz(i,0) + matriz(i,1)
		Escribir Sin Saltar matriz(i,0) " + " matriz(i,1) " = " matriz(i,2)
		Escribir ""
	FinPara
	
FinAlgoritmo
