////	Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
////	ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
////	ceros. Por ejemplo, nuestro matriz final debería verse así:

////	111111111111111
////	100000000000001
////	100000000000001
////	100000000000001
////	111111111111111

Algoritmo matrizMarco01
	
	Definir i, j, matriz Como Entero
	
	Dimension matriz(5,15)
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 14 Con Paso 1 Hacer
			Si i == 0 O i == 4 O j == 0 O j == 14 Entonces
				matriz(i,j) = 1
			SiNo
				matriz(i,j) = 0
			FinSi
		FinPara
	FinPara
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 14 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo
