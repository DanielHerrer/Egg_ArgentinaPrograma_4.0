////	Se debe crear una matriz con las siguientes palabras como se muestra a continuación. Luego de
////	eso debemos acomodar las palabras para que la primera letra ?R? de cada una quede en la
////	posición 5, alineándose.

Algoritmo desafioGuia5
	Definir matriz como Cadena
	Dimension matriz[9, 12]
	inicializarMatriz(matriz, 9, 12)
	agregarPalabra(matriz, "VECTOR", 0)
	agregarPalabra(matriz, "MATRIX", 1)
	agregarPalabra(matriz, "PROGRAMA", 2)
	agregarPalabra(matriz, "SUBPROGRAMA", 3)
	agregarPalabra(matriz, "SUBPROCESO", 4)
	agregarPalabra(matriz, "VARIABLE", 5)
	agregarPalabra(matriz, "ENTERO", 6)
	agregarPalabra(matriz, "PARA", 7)
	agregarPalabra(matriz, "MIENTRAS", 8)
	imprimirMatriz(matriz, 9, 12)
	Escribir "////////////////////////////////////////////////"
	acomodarPalabras(matriz)
	imprimirMatriz(matriz, 9, 12)
FinAlgoritmo

SubProceso inicializarMatriz(matriz,filas,columnas)
	Definir i, j Como Entero
	
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			matriz(i,j) = "*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(matriz,filas,columnas)
	Definir i, j Como Entero
	
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "] "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso agregarPalabra(matriz,palabra,fila)
	Definir j Como Entero
	
	Para j<-0 Hasta Longitud(palabra)-1 Con Paso 1 Hacer
		matriz(fila,j) = Subcadena(palabra,j,j) 
	FinPara
FinSubProceso

Funcion posicion <- buscarR(palabra)
	Definir j, posicion Como Entero
	Definir encontradoR Como Logico
	encontradoR = Falso
	
	Para j<-0 Hasta Longitud(palabra)-1
		Si encontradoR == Falso Y j <= Longitud(palabra)-1 Entonces
			Si Subcadena(palabra,j,j) == "R" Entonces
				encontradoR = Verdadero
				posicion = j
			FinSi
		FinSi
	FinPara
FinSubProceso

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
SubProceso acomodarPalabras(matriz)
	Definir i, j, k, posicionR1, posicionR2, contadorJ, diferencia Como Entero
	Definir palabra Como Cadena
	palabra = ""
	
	/// JUNTA TODOS LOS CARACTERES DE LA FILA 0 EN UNA PALABRA
	Para j<-0 Hasta 11 Con Paso 1 Hacer
		Si matriz(0,j) <> "*"
			palabra = palabra + matriz(0,j) 
		FinSi
	FinPara
	/// GUARDA LA POSICION DE LA "R" DE LA PRIMER PALABRA
	posicionR1 = buscarR(palabra)
	
	/// RECORRE TODAS LAS FILAS
	Para i<-1 Hasta 8 Con Paso 1 Hacer
		/// JUNTA TODOS LOS CARACTERES DE CADA FILA EN UNA PALABRA
		palabra = ""
		Para j<-0 Hasta 11 Con Paso 1 Hacer
			Si matriz(i,j) <> "*"
				palabra = palabra + matriz(i,j) 
			FinSi
		FinPara
		
		/// GUARDA LA POSICION DE LA "R" DE CADA PALABRA
		posicionR2 = buscarR(palabra)
		/// GUARDA LA DIFERENCIA DE POSICIONES QUE HAY ENTRE LA PRIMER PALABRA Y LA PALABRA ACTUAL
		diferencia = posicionR1 - posicionR2
		
		/// RECORRE LA DIFERENCIA QUE HAY ENTRE LAS DOS "R" HASTA QUE POSICION A POSICION SE CORRA A LA DERECHA
		contadorJ = 0
		Para k<-0 Hasta diferencia-1 Con Paso 1 Hacer
			Para j<-(Longitud(palabra)-1)+contadorJ Hasta 0+contadorJ Con Paso -1 Hacer
				matriz(i,j+1) = matriz(i,j)
			FinPara
			matriz(i,contadorJ) = "*"	/// LIMPIA LA PRIMERO POSICION
			contadorJ = contadorJ + 1	/// EL CONTADOR AYUDA PARA AVANZAR 1 EN 1 A LA DERECHA
		FinPara
	FinPara
	
FinSubProceso