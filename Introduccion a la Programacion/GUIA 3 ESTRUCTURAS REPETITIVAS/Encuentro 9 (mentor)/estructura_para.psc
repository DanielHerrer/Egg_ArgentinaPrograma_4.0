Algoritmo estructura_para
	
	Definir i, num, numAlto, numMax Como Entero
	numMax = Aleatorio(3,10)
	numAlto = 0
	
	Escribir "Usted deberá ingresar ", numMax " numeros. "
	
	Para i <- 1 Hasta numMax Con Paso 1 Hacer
		
		Escribir "Ingrese un numero: "
		Leer num
		
		Si num > numAlto Entonces
			
			numAlto = num
			
		FinSi
		
	Fin Para
	
	Escribir "Ha ingresado todos los numeros. El numero más alto fue: ", numAlto
	
FinAlgoritmo

//Escribir una estructura PARA que le solicite al usuario varios números y al finalizar muestre el
//	mayor número ingresado.