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

//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el funcionamiento
//		de la función Subcadena().

//	NOTA:. En PseInt, si queremos escribir sin que haya saltos de línea, al final de la operación
//		"escribir" escribimos "sin saltar". Por ejemplo:
//			Escribir sin saltar "Hola, "
//			Escribir sin saltar "cómo estás?"
//		Imprimirá por pantalla: Hola, cómo estás?