Algoritmo codificarFrase
	
	Definir frase Como Cadena
	Definir cantCar Como Entero
	
	Hacer
		
		Escribir "Ingrese una cadena terminada en punto: "
		Leer frase
		cantCar = Longitud(frase) - 1
		
	Mientras Que SubCadena(frase,cantCar,cantCar) <> "."
	
	codificacion(frase)
	Escribir frase
	
FinAlgoritmo

SubProceso codificacion(frase Por Referencia)
	
	Definir texto1, letraAux, texto2 Como Caracter
	Definir i Como Entero
	
	Para i<-0 Hasta Longitud(frase) - 1 Con Paso 1 Hacer
		
		Segun Subcadena(frase,i,i)
			
			"a" o "A": 
				texto1 = Subcadena(frase,0,i-1)
				letraAux = "@"
				texto2 = Subcadena(frase,i+1,Longitud(frase)-1)
				frase = texto1 + letraAux + texto2
			"e" o "E":
				texto1 = Subcadena(frase,0,i-1)
				letraAux = "#"
				texto2 = Subcadena(frase,i+1,Longitud(frase)-1)
				frase = texto1 + letraAux + texto2
			"i" o "I":
				texto1 = Subcadena(frase,0,i-1)
				letraAux = "$"
				texto2 = Subcadena(frase,i+1,Longitud(frase)-1)
				frase = texto1 + letraAux + texto2
			"o" o "O":
				texto1 = Subcadena(frase,0,i-1)
				letraAux = "%"
				texto2 = Subcadena(frase,i+1,Longitud(frase)-1)
				frase = texto1 + letraAux + texto2
			"u" o "U":
				texto1 = Subcadena(frase,0,i-1)
				letraAux = "*"
				texto2 = Subcadena(frase,i+1,Longitud(frase)-1)
				frase = texto1 + letraAux + texto2
			De Otro Modo:
			
		FinSegun
		
	FinPara
	
FinSubProceso

//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y termi-
//nada en punto, 

//y luego codifique la palabra o frase ingresada de la siguiente manera: cada vo-
//	cal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (inclu-
//	yendo a las vocales acentuadas) se mantienen sin cambios.

//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación co-
//rrespondiente. Utilice la estructura "según" para la transformación.

//a e i o u
//@ # $ % *

//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//	NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.