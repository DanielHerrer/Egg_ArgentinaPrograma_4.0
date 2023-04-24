Algoritmo conoAsteriscos
	
	Definir num, aux, i, j Como Entero 
	
	Escribir "Ingrese un numero entero: "
	Leer num
	
	aux = num
	
	Para i <- 1 Hasta num Con Paso 1 Hacer 
		
		Para j <- 1 Hasta aux Con Paso 1 Hacer
			
			Escribir Sin Saltar "*"
			
		FinPara
		
		Escribir ""
		aux = aux - 1
		
	FinPara
	
FinAlgoritmo


//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deberá mostrar:
//	*****
//	****
//	***
//	**
//	*