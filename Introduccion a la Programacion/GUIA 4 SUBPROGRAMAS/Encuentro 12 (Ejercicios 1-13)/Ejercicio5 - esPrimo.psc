Algoritmo es_Primo_Ono
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero: "
	Leer num
	
	Escribir "El numero ingresado es primo? : ", esPrimo(num)
	
FinAlgoritmo


Funcion afirmacion <- esPrimo(num Por Valor)
	
	Definir afirmacion Como Logico
	
	Si num > 0 Y num <= 3 Y num <> 1 Entonces
		
		afirmacion = Verdadero
		
	SiNo
		
		Si num % 1 == 0 Y num % num == 0 Y num % 2 <> 0 Y num % 3 <> 0 Entonces
			
			afirmacion = Verdadero
			
		SiNo
			
			afirmacion = Falso
			
		FinSi
		
	FinSi
	
	
FinFuncion

//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.