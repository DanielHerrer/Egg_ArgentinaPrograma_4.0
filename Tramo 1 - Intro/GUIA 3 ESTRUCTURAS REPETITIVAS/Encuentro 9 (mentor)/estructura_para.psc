Algoritmo estructura_para
	
	Definir i, num, numAlto, numMax Como Entero
	numMax = Aleatorio(3,10)
	numAlto = 0
	
	Escribir "Usted deber� ingresar ", numMax " numeros. "
	
	Para i <- 1 Hasta numMax Con Paso 1 Hacer
		
		Escribir "Ingrese un numero: "
		Leer num
		
		Si num > numAlto Entonces
			
			numAlto = num
			
		FinSi
		
	Fin Para
	
	Escribir "Ha ingresado todos los numeros. El numero m�s alto fue: ", numAlto
	
FinAlgoritmo

//Escribir una estructura PARA que le solicite al usuario varios n�meros y al finalizar muestre el
//	mayor n�mero ingresado.