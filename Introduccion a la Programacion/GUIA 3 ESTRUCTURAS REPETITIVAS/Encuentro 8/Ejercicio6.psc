Algoritmo sumaPares
	
	Definir i, num, numAux, suma Como Entero
	i = 0
	numAux = 2
	suma = 0
	
	Escribir "Ingrese un numero de pares a sumar: "
	Leer num
	
	Hacer
		
		Si numAux % 2 == 0
			
			suma = suma + numAux
			i = i + 1
			
		FinSi
		
		numAux = numAux + 1
		
	Mientras Que i < num
	
	Escribir "La suma total de ", num " numeros pares es igual a: ", suma
	
FinAlgoritmo
