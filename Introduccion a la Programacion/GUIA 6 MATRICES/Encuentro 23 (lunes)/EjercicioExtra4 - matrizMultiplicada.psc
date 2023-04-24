//// 	Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
////	Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo matrizMultiplicada
	Definir i, j, matrizA, matrizB, matrizC Como Entero
	Dimension matrizA(3,3), matrizB(3,3), matrizC(3,3)
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matrizA(i,j) = Aleatorio(1,9)
			matrizB(i,j) = Aleatorio(1,9)
		FinPara
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matrizC(i,j) = matrizA(i,j) * matrizB(i,j)
		FinPara
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matrizA(i,j) "]"
		FinPara
		Escribir ""
	FinPara
	Escribir "//// * ////"
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matrizB(i,j) "]"
		FinPara
		Escribir ""
	FinPara
	Escribir "//// = ////"
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matrizC(i,j) "]"
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
