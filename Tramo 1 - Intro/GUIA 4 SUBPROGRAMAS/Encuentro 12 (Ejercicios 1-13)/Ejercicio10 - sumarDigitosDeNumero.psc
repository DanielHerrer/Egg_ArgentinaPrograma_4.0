Algoritmo sumarNumeros
	
	Definir num Como Entero
	
	Escribir "Ingrese un num: "
	Leer num
	
	Escribir "La suma de todos los digitos de ", num " es: ", SumarDigitos(num)
	
FinAlgoritmo

Funcion numEnt <- SumarDigitos(num Por Valor)
	
	Definir numEnt, numAux, numUni Como Entero
	numEnt = 0
	
	Hacer 
		
		numUni = num % 10
		num = trunc(num / 10)
		numEnt = numEnt + numUni
		
	Mientras Que num <> 0
	
//	Definir numCad, numC1, numC2 Como Cadena
//	Definir numEnt, numE1, numE2, i Como Entero
//	numEnt = 0
//	numCad = ConvertirATexto(num)
//	
//	Para i <- 0 Hasta Longitud(numCad) - 1 Con Paso 2 Hacer
//		
//		numC1 = SubCadena(numCad,i,i)
//		numC2 = SubCadena(numCad,i+1,i+1)
//		numE1 = ConvertirANumero(numC1)
//		numE2 = ConvertirANumero(numC2)
//		
//		numEnt = numEnt + numE1 + numE2
//		
//	FinPara
	
FinFuncion

//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//		resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.