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

//	Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//	componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
//	deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//	de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
//	resultados.