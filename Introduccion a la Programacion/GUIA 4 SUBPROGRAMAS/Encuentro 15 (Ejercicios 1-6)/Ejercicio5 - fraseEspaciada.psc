Algoritmo fraseEspaciada
	
	Definir frase Como Cadena
	
	Escribir "Ingrese una frase: "
	Leer frase
	
	Escribir frase " (SIN ESPACIAR)" 
	
	espaciar(frase)
	
FinAlgoritmo

SubProceso espaciar(frase Por Valor)
	
	Definir letraAux, fraseFinal Como Cadena
	Definir i Como Entero
	letraAux = ""
	
	Para i<-0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		
		letraAux = letraAux + Subcadena(frase,i,i) + " "
		fraseFinal = letraAux
		
	FinPara
	
	Escribir fraseFinal " (ESPACIADO)" 
	
FinSubProceso

//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.
