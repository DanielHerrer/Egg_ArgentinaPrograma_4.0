////Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
////los muestre por pantalla.

Algoritmo matriz3x3
	
	Definir matriz, i, j Como Entero
	Dimension matriz(3,3)
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			
			Escribir "Ingrese un valor para X=" i+1 " e Y=" j+1
			Leer matriz(i,j)
			
		FinPara
		
	FinPara
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		
		Para j<-0 Hasta 2 Con Paso 1 Hacer
									/// FILA , COLUMNA
			Escribir Sin Saltar "(" matriz(i,j) ")"
			
		FinPara
		Escribir ""
		
	FinPara
	
	
	
FinAlgoritmo