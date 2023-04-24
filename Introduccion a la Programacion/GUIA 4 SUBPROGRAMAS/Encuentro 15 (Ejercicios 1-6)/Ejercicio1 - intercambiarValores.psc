Algoritmo intercambiarValores
	
	Definir a, b, aux Como Entero
	
	Escribir "Ingrese el valor de A, y el valor de B: "
	Leer a, b
	
	Escribir "Valor de A: ", a " | Valor de B: ", b
	Escribir "Realizando intercambio..."
	intercambio(a,b)
	Escribir "Valor de A: ", a " | Valor de B: ", b
	
FinAlgoritmo

SubProceso intercambio(a Por Referencia, b Por Referencia)
	
	Definir aux Como Entero
	
	aux = a
	a = b
	b = aux
	
FinSubProceso

//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.