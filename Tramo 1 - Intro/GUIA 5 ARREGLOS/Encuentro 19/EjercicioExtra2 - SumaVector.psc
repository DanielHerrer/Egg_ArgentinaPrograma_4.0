////Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
////usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo ejercicio2
	
	Definir vector, i, dim, num,suma Como Entero
	
	suma = 0
	
	Escribir "ingrese la dimencion del vector"
	
	leer dim
	Dimension vector[dim]
	
	para i <- 0 hasta dim-1 Hacer
		
		Escribir "ingrese los nuemos"
		leer num
		
		vector[i] = num
		
		suma = suma + num
		
	FinPara
	
	Escribir "el promedio de la suma de los numeros es: " suma / dim

	
FinAlgoritmo
