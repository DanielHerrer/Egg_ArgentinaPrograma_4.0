////	Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
////	usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las 
////	coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En caso de no
////	encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo buscarNumMatriz
	
	Definir i, j, num, matriz Como Entero
	Definir encontrado Como Logico
	encontrado = Falso
	Dimension matriz(5,5)
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(0,20)
		FinPara
	FinPara
	
	Escribir "Escriba el numero que desea buscar en la matriz: "
	Leer num
	
	Escribir "--------------------------------------------------------------"
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]" 
		FinPara
		Escribir ""
	FinPara
	
	Escribir "--------------------------------------------------------------"
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 4 Con Paso 1 Hacer
			Si matriz(i,j) == num Entonces
				Escribir "El elemento " num " fue encontrado en la fila " i + 1 " y columna " j + 1
				encontrado = Verdadero
			FinSi
		FinPara
	FinPara
	
	Si encontrado == Falso Entonces
		Escribir "El elemento NO fue encontrado."
	FinSi
	
FinAlgoritmo