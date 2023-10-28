Algoritmo numDecimales
	
	Definir num, cant Como Entero
	
	Escribir "Ingrese un entero positivo"
	Leer num
	
	cant = 0
	
	Mientras num > 0 Hacer
		
		num = trunc(num / 10)
		cant = cant + 1
		
	Fin Mientras
	
	Escribir "la cantidad de digitos es: ",cant
	
FinAlgoritmo

//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la función trunc().