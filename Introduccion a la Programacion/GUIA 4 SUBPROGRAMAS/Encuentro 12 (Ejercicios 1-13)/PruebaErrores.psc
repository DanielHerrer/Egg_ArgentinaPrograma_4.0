Algoritmo Prueba
	
	Definir num1, num2 Como Entero
	Definir resultado Como Logico
	num1 = 3
	num2 = 6
	
	                 /// ARGUMENTOS
	resultado = Comparar(num1,num2)
	
	Escribir "El num1 es mayor a num2, esta afirmación es: " resultado
	
FinAlgoritmo

						    /// PARAMETROS
Funcion retorno <- Comparar ( num1 Por Valor, num2 Por Valor)
	
	Definir retorno Como Logico
	retorno = num1 > num2
	
FinFuncion

/// POR VALOR, NO MODIFICA LA VARIABLE DEL Algoritmo 
/// POR REFERENCIA, SI MODIFICA LA VARIABLE DEL Algoritmo 