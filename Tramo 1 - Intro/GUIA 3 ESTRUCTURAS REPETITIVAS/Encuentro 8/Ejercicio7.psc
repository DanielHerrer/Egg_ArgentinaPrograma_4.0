Algoritmo juegoNumero
	
	Definir num, numFinal Como Entero
	numFinal = Aleatorio(1,10)
	
	Hacer
		
		Escribir "Ingrese un numero: "
		Leer num
		
		Si num < 1 O num > 10
			
			Escribir "Ingrese un numero valido."
			
		SiNo
			
			Si num < numFinal 
				
				Escribir "El numero ingresado es menor que el numero a adivinar.."
				
			FinSi
			
			Si num > numFinal
				
				Escribir "El numero ingresado es mayor que el numero a adivinar.."
				
			FinSi
			
		FinSi
		
	Mientras Que num <> numFinal
	
	Escribir "Usted ha adivinado el numero secreto. ", num
	
FinAlgoritmo