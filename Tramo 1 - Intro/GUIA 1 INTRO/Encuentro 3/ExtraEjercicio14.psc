Algoritmo numInvertido
	
	Definir num2cifras, decena, unidad Como Entero
	
	Escribir "Ingrese un numero de 2 cifras: "
	Leer num2cifras
	
	decena = trunc(num2cifras / 10)
	unidad = num2cifras - (decena * 10)
	
	Escribir "El numero original es ", num2cifras " y el numero invertido es ", unidad , decena 
	
FinAlgoritmo
