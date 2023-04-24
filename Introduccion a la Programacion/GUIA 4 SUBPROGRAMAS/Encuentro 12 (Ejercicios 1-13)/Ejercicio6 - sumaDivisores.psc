Algoritmo sumarDivisores
	Definir num Como Entero
	
	Escribir "Ingrese un numero: "
	Leer num
	
	Escribir "La suma total de todos los divisores de ", num " es de: ", SumaDivisores(num)
	
FinAlgoritmo

Funcion sumaTotal <- SumaDivisores (num Por Valor)
	
	Definir divisor, sumaTotal Como Entero
	divisor = 1
	sumaTotal = 0
	
	Hacer 
		
		Si num % divisor == 0 Entonces
			
			sumaTotal = sumaTotal + divisor
			
		FinSi
		
		divisor = divisor + 1
		
	Mientras Que divisor < num   
	
FinFuncion

//  Realizar una función que calcule y retorne la suma de todos los divisores del número n 
//  distintos de n. El valor de n debe ser ingresado por el usuario.