Algoritmo fraseEspaciada
	
	Definir palabra Como Cadena
	Definir i, longPalabra Como Entero
	
	Escribir "Ingrese una palabra: "
	Leer palabra
	longPalabra = Longitud(palabra) - 1
	
	Para i <- 0 Hasta longPalabra Con Paso 1 Hacer
		
		Escribir sin saltar Subcadena(palabra,i,i) " " 
		
	FinPara
	
FinAlgoritmo

//Realizar un programa que pida una frase y el programa deber� mostrar la frase con un
//espacio entre cada letra. La frase se mostrar� as�: H o l a. Nota: recordar el funcionamiento
//		de la funci�n Subcadena().

//	NOTA:. En PseInt, si queremos escribir sin que haya saltos de l�nea, al final de la operaci�n
//		"escribir" escribimos "sin saltar". Por ejemplo:
//			Escribir sin saltar "Hola, "
//			Escribir sin saltar "c�mo est�s?"
//		Imprimir� por pantalla: Hola, c�mo est�s?