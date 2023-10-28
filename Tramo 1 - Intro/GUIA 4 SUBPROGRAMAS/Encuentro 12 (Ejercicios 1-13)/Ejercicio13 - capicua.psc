Algoritmo capicuaFuncion
	
	Definir num Como Entero
	Escribir "Ingrese un num: "
	Leer num
	
	Si Capicua(num) Entonces
		Escribir "El numero SI es capic�a."
	SiNo
		Escribir "El numero NO es capic�a."
	FinSi
	
FinAlgoritmo

Funcion esOno <- Capicua(num Por Valor)
	
	Definir esOno Como Logico
	Definir numAux, numInv Como Entero
	numAux = num
	numInv = 0
	
	Hacer 
		numInv = numInv + (numAux % 10)
		numAux = trunc(numAux / 10)
		Si numAux <> 0 Entonces
			numInv = numInv * 10
		FinSi
	Mientras Que numAux <> 0
	
	Si numInv == num Entonces
		esOno = Verdadero
	SiNo
		esOno = Falso
	FinSi
	
FinFuncion

//      Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//      capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//		transformar el numero a cadena para realizar el ejercicio.