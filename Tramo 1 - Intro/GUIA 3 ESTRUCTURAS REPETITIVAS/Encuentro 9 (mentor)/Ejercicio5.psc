Algoritmo sumaNaturales
	
	Definir i, numNaturales, sumaTotal Como Entero
	sumaTotal = 0
	
	Escribir "Ingrese N numeros naturales a sumar: "
	Leer numNaturales
	
	Para i <- 1 Hasta numNaturales Con Paso 1 Hacer
		
		sumaTotal = sumaTotal + i
		
	FinPara
	
	Escribir "La suma de los ", numNaturales " numeros naturales es de ", sumaTotal
	
FinAlgoritmo
