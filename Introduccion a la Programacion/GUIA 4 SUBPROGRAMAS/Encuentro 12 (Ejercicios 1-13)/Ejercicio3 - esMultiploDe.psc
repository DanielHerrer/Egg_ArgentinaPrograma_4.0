Algoritmo esMultiploDe
	
	Definir num1, num2 Como Entero
	
	Escribir "Ingrese dos numeros: "
	Leer num1, num2
	
	Escribir "La afirmacion de que el numero1 es multiplo del numero2 es: ", esMultiplo(num1, num2)
	
FinAlgoritmo

Funcion multiplo <- esMultiplo(num1 Por Valor, num2 Por Valor)
	
	Definir multiplo Como Logico
	
	Si num1 MOD num2 == 0 Entonces
		
		multiplo = Verdadero
		
	SiNo
		
		multiplo = Falso
		
	FinSi
	
FinFuncion

// Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
// que el primer número es múltiplo del segundo y devuelva verdadero si el primer número es múlti-
//	plo del segundo, sino es múltiplo que devuelva falso.