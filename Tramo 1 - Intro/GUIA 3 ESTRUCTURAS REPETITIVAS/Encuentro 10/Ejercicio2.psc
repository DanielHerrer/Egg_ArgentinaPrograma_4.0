Algoritmo cuadroAsteriscos
	
	Definir i, j, h, num Como Entero
	
	Escribir "Ingrese el diametro del cuadro: "
	Leer num
	
	Para i <- 1 Hasta num Con Paso 1 Hacer
		
		Si i == 1 O i == num Entonces
			
			Para j <- 1 Hasta num Con Paso 1 Hacer
				
				Escribir Sin Saltar "* "
				
			FinPara
			
		SiNo
			
			Escribir Sin Saltar "* "
			
			Para h <- 1 Hasta (num - 2) Con Paso 1 Hacer
				
				Escribir Sin Saltar "  "
				
			FinPara
			
			Escribir Sin Saltar "* "
			
		FinSi
		
		Escribir ""
		
	FinPara
	
FinAlgoritmo

//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
//cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:

//* * * *
//*     *
//*     *
//* * * *