Algoritmo numerosImpares
	
	Definir num Como Entero
	
	Escribir "Ingrese un num: "
	Leer num
	
	Escribir "La afirmacion de que todos sus digitos numericos son impares es: ", TodosImpares(num)
	
FinAlgoritmo

Funcion sonImpares <- TodosImpares (num Por Valor)
	
	Definir numUnidad Como Entero
	Definir sonImpares Como Logico
	
	Hacer
		
		numUnidad = num % 10
		num = trunc(num / 10)
		
		Si numUnidad == 1 O numUnidad == 3 O numUnidad == 5 O numUnidad == 7 O numUnidad == 9 Entonces
			
			sonImpares = Verdadero
			
		SiNo 
			
			sonImpares = Falso
			
		FinSi
		
	Mientras Que No(num == 0) Y No(sonImpares == Falso)
	
FinFuncion

//		Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//		tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//		numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.

//		Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio.