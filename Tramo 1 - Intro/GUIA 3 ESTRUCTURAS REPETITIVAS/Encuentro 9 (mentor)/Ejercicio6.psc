Algoritmo fraseInversaEspaciada
	
	Definir palabra Como Cadena
	Definir i, longPalabra Como Entero
	
	Escribir "Ingrese una palabra: "
	Leer palabra
	longPalabra = Longitud(palabra) - 1
	
	Para i <- longPalabra Hasta 0 Con Paso -1 Hacer
		
		Escribir sin saltar Subcadena(palabra,i,i) " " 
		
	FinPara
	
FinAlgoritmo

//Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
//pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
//		deberemos mostrar a l o H.