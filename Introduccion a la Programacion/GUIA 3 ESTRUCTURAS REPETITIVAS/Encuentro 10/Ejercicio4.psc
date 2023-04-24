Algoritmo funcionFactorial
	
	Definir num , i, j, cuentita Como Entero
	
	Escribir "Ingrese un numero : "
	Leer num
	
	Para i <- 1 Hasta num Con Paso 1 Hacer
		
		Escribir Sin Saltar "!", i " = "
		cuentita = 1
		
		Para j <- 1 Hasta i Con Paso 1 Hacer
			
			Si j <> i Entonces
				Escribir Sin Saltar j " * "
				cuentita = cuentita * j
			SiNo
				Escribir Sin Saltar j " = "
				cuentita = cuentita * j
			FinSi
			
		FinPara
		
		Escribir cuentita ""
		
	FinPara
	
	///nF = 1 * 2 * 3 * 4 * 5 
	
	//nF = 1 * 2 * 3 * 4 * 5 * (num-1) * num
	
	
FinAlgoritmo

//La función factorial se aplica a números enteros positivos. El factorial de un número entero
//positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
//	n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n

//	Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
//hasta el 5. 

//El programa deberá mostrar la siguiente salida:
//	!1 = 1
//	!2 = 1*2 = 2
//	...
//	!5 = 1*2*3*4*5 = 120