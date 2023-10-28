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

//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.