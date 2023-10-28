Algoritmo fibonacciN
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero: "
	Leer num
	
	Fibonacci(num)
	
FinAlgoritmo

SubProceso Fibonacci (n Por Valor)
	
	Definir numF, numF1, numAux Como Entero
	numF = 0
	numF1 = 1
	
	/// Repite mientras que el num Aux sea distinto y menor que el num ingresado
	Hacer
		
		numAux = numF + numF1
		
		/// Si el num Aux es distinto y menor que el num Ingresado entonces se actualizan los valores a sumar en el prox. loop
		Si numAux <> n Y numAux < n Entonces
			
			numF1 = numF
			numF = numAux
			
		FinSi
		
	Mientras Que numAux <> n Y numAux < n
	
	
	/// Finalmente compara el numero para saber si es equivalente a un numero fibonacci
	Si numAux <> n
		
		Escribir "El numero ingresado no pertenece a la sucesion de Fibonacci"
		
	SiNo
		
		Escribir "La sucesion del numero ", n " es: (", numF " + ", numF1 ")"
		
	FinSi
	
	
FinSubProceso


//La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
//	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//		Fibonacci (n) = 1 para todo n <= 1
//			Por lo tanto, si queremos calcular el término "n" debemos escribir una función que reciba
//				como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.