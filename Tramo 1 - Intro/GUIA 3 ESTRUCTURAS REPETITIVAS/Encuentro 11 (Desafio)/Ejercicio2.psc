Algoritmo numDigitos
	
	Definir num, cantDigitos Como Entero
	cantDigitos = 0
	
	Escribir "Ingrese un numero entero: "
	Leer num
	
	Hacer
		
		num = trunc(num / 10)
		cantDigitos = cantDigitos + 1
		
	Mientras Que num <> 0 
	
	Escribir "La cantidad de digitos es: ", cantDigitos
	
FinAlgoritmo

//	Escribir un programa que lea un número entero y devuelva el número de dígitos que
//	componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//	deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//	de división. Nota: recordar que las variables de tipo entero truncan los números o
//	resultados.