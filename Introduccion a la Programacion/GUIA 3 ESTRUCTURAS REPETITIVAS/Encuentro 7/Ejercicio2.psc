Algoritmo numLimite
	
	Definir numLimit, suma, numIngresado Como Entero
	
	Escribir "Por favor ingrese un numero limite POSITIVO:"
	Leer numLimit
	
	suma = 0
	
	Mientras suma <= numLimit 
		
		Escribir "Ingrese un numero a sumar: "
		Leer numIngresado
		
		suma = suma + numIngresado
		
	FinMientras
	
	Escribir "Adios, ha concluido el programa con un numero sumado de total: ", suma
	
FinAlgoritmo