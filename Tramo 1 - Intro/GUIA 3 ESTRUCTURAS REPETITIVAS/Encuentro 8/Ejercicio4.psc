Algoritmo numIngresados
	
	Definir num, suma Como Entero
	Definir bandera Como Caracter
	suma = 0

	Hacer
		
		Escribir "Ingrese un numero: "
		Leer num
		
		Si num < 0
			
			Escribir "Ingrese un numero entero positivo."
			
		SiNo
			
			suma = suma + num
			
		FinSi
		
		Escribir "Desea ingresar otro numero? (S/N) : "
		Leer bandera
		bandera = Mayusculas(bandera)
		
	Mientras Que bandera == "S"
	
	Escribir "La suma de los numeros ingresados es igual a ", suma
	
FinAlgoritmo
