Algoritmo escaleraNums
	
	Definir i, j, num, numAux Como Entero
	
	Escribir "Ingrese un numero:"
	Leer num
	numAux = 1
	
	Para i<-1 Hasta num Con Paso 1 Hacer
		
		Para j<-1 Hasta numAux Con Paso 1 Hacer
			
			Escribir Sin Saltar j " "
			
		FinPara
		
		numAux = numAux + 1
		Escribir ""
		
	FinPara
	
FinAlgoritmo


//Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros co-
//mience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario al
//comenzar. Ejemplo: si se ingresa el n�mero 3:

//1
//12
//123