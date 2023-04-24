Algoritmo esImparOno
	
	Definir num1 Como Entero
	
	Escribir "Escriba un numero: "
	Leer num1
	
	Escribir "La afirmacion de que el numero es IMPAR es: ", esImpar(num1)
	
FinAlgoritmo

Funcion impar <- esImpar(num1 Por Valor)
	
	Definir impar Como Logico
	impar = num1 % 2 <> 0
	
FinFuncion

//Realizar una función que valide si un número es impar o no. Si es impar la función debe devol-
//ver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener mensajes
//que digan si es par o no, eso debe pasar en el Algoritmo.