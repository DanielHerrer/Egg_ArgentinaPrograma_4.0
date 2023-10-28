Algoritmo operacionesAritmeticas
	Definir num1, num2, resultado Como Real
	Definir operacion Como Caracter
	
	Escribir "Ingrese sus dos numeros a operar: "
	Leer num1, num2
	
	Escribir "Defina la operacion a realizar, S (suma), R (resta), D (division), M (multiplicar): "
	Leer operacion
	
	operacion = Mayusculas(operacion)
	
	Segun operacion Hacer
		"S": 
			resultado = num1 + num2
			Escribir "El resultado de su suma es: ", resultado
		"R": 
			resultado = num1 - num2 
			Escribir "El resultado de su resta es: ", resultado
		"D": 
			resultado = num1 / num2
			Escribir "El resultado de su resta es: ", resultado
		"M": 
			resultado = num1 * num2
			Escribir "El resultado de su multiplicacion es: ", resultado
			
		De Otro Modo:
			Escribir "El caracter ingresado es incorrecto."
	FinSegun
	
FinAlgoritmo

