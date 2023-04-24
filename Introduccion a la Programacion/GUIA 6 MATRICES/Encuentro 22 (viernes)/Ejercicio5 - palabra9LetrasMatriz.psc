////Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encon-
////trando la manera de que la frase se muestre de manera continua en la matriz.
////Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
////H A B
////I L I
////D A D

Algoritmo palabra9LetrasMatriz

	Definir matriz Como Caracter
	Dimension matriz(3,3)
	Definir palabra Como Cadena
	
	Hacer
		Escribir "Ingrese una palabra de 9 letras"
		Leer palabra
	Mientras Que No(Longitud(palabra)==9)
	
	rellenarMatriz3x3Letras(matriz,palabra)
	mostrarMatriz3x3(matriz)
	
FinAlgoritmo

SubAlgoritmo rellenarMatriz3x3Letras(matriz Por Referencia, palabra Por Valor)
	Definir i, j, cUni, cTotal Como Entero
	cTotal = Longitud(palabra)
	cUni = 0
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matriz(i,j) = SubCadena(palabra,cUni,cUni)
			cUni = cUni + 1
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo mostrarMatriz3x3(matriz Por Referencia)
	Definir i, j Como Entero
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir ""
	FinPara
FinSubAlgoritmo
	