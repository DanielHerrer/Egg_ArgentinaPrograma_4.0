Algoritmo restasSucesivas
	
	Definir numDividendo, numDivisor Como Entero
	
	Escribir "Ingrese el numero dividendo y el numero divisor: "
	Leer numDividendo, numDivisor
	
	divisora(numDividendo, numDivisor)
	
FinAlgoritmo

SubProceso divisora(dividendo Por Valor, divisor Por Valor)
	Definir residuo, cociente Como Entero
	cociente = 0
	
	Mientras dividendo > divisor Hacer
		
		dividendo = dividendo - divisor
		cociente = cociente + 1
		
	FinMientras
	
	residuo = dividendo
	Escribir "El residuo es: ", residuo " Y el cociente es: ", cociente
	
FinSubProceso
	
//	Realizar un procedimiento que permita realizar la división entre dos números y muestre el co-
//	ciente y el resto utilizando el método de restas sucesivas.
//	
//	El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//	obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.