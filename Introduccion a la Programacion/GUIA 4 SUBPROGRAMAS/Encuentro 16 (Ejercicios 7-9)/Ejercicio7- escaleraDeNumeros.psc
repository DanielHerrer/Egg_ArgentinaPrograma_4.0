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


//Crear un programa que dibuje una escalera de números, donde cada línea de números co-
//mience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al
//comenzar. Ejemplo: si se ingresa el número 3:

//1
//12
//123