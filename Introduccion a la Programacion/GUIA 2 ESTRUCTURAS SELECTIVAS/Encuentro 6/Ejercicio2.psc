Algoritmo parOimpar
	
	Definir num Como Entero
	
	Escribir "Escriba un numero entero: "
	Leer num 
	
	Si num == 0 Entonces
		
		Escribir "Error, el numero que ingreso es 0, no es par, ni impar."
		
	SiNo
		
		Si num % 2 == 0 Entonces
			Escribir "El numero es par."
		SiNo
			Escribir "El numero es impar."
		FinSi
		
	FinSi
	
FinAlgoritmo