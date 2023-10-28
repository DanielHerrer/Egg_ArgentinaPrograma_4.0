Algoritmo vectorPosicionTeclaCambiar 
	Definir vector, letra Como Caracter
	Definir i, posicion Como Entero
	Definir frase Como Cadena ///Caracter
	
	Dimension vector(20)

//	Para i<-0 Hasta 19	
//		vector[i] = " "	
//	Fin Para
//	
	Hacer
		Escribir "Ingrese una frase: "
		Leer frase
		
		Para i<-0 Hasta 19 Con Paso 1 Hacer
			Si Subcadena(frase,i,i) <> "" Entonces
				vector(i) = Subcadena(frase,i,i)
			SiNo
			vector(i) = " "
			FinSi
		FinPara
		
	Mientras Que Longitud(frase)>20
	
	Escribir "Ingrese una tecla cualquiera: "
	Leer letra
	Escribir "Ingrese una posicion entre el 1 y el 20: "
	Leer posicion
	
	Si vector(posicion-1) <> " " Entonces
		Escribir "No hay lugar."
	SiNo
		vector(posicion-1) = letra
	FinSi
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar "[" vector(i) "], "
	FinPara
	
FinAlgoritmo

//Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide desarro-
//llar un programa que:
//	
//	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la funci�n Subcadena de PSeInt.
//	
//	b) Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una posi-
//	ci�n dentro del arreglo, y el programa debe intentar ingresar el car�cter en la posici�n
//	indicada, si es que hay lugar (es decir la posici�n est� vac�a o es un espacio en
//	blanco). De ser posible debe mostrar el vector con la frase y el car�cter ingresado, de
//	lo contrario debe darle un mensaje al usuario de que esa posici�n estaba OCUPADA.

//Por ejemplo, suponiendo la siguiente frase y los sub�ndices del vector:
//	H o l a m u n d o  c  r  u  e  l  !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19

//Si se desea ingresar el car�cter "%" en la posici�n 10, entonces el resultado ser�a:
//		H o l a m u n d o % c r u e l !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19