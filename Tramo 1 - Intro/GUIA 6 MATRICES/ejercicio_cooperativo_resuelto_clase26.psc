Algoritmo ejercicio_cooperativo_resuelto_clase26
	Definir matriz como caracter
	Dimension matriz[9, 12]
	inicializarMatriz(matriz, 9, 12)
	agregarPalabra(matriz, "vector", 0)
	agregarPalabra(matriz, "gracias", 1)
	agregarPalabra(matriz, "Jeremias", 2)
	agregarPalabra(matriz, "subprograma", 3) 
	agregarPalabra(matriz, "Integrador", 4)
	agregarPalabra(matriz, "variable", 5)
	agregarPalabra(matriz, "Jocker", 6)
	agregarPalabra(matriz, "porque", 7)
	agregarPalabra(matriz, "mientras", 8)
	acomodarPalabras(matriz)
	imprimirMatriz(matriz, 9, 12)
	
FinAlgoritmo

SubProceso inicializarMatriz(matriz,i,j)
	para i<-0 hasta 8 Con Paso 1	Hacer
		para j<-0 hasta 11 hacer
			matriz[i,j]="."			
		FinPara			
	FinPara
	
FinSubProceso

subProceso imprimirMatriz(matriz, i, j)
	Para i=0 Hasta 8
		Para  j= 0 hasta 11
			
			Escribir  Sin Saltar " " matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso

SubProceso agregarPalabra(matriz, palabra, k)
	Definir  j Como Real
	
	Para j=0 Hasta Longitud(palabra)-1 Hacer
		matriz(k,j)=SubCadena(Mayusculas(palabra),j,j)
		
	Fin Para
	
FinSubProceso

Funcion retorno<- buscarR(matriz,i)
	Definir k,l,retorno Como Entero
	Para l=i hasta 8
		Para k=0 hasta 11
			si matriz(i,k)= "R" O matriz(i,k)="r"
				retorno=k
				k=12
				l=9
			FinSi
		FinPara
	FinPara
FinFuncion


SubProceso acomodarPalabras(matriz)
	Definir l, j,i, correr Como Entero
	Para i=0 Hasta 8
		
		correr=5-buscarR(matriz,i)
		
		Para j=11 Hasta correr
			matriz[i,j]=matriz[i,j-correr]
		FinPara
		
		Si correr>0
			Para j=0 Hasta correr-1
				matriz[i,j]="."
			FinPara
		FinSi
		
	FinPara
FinSubProceso
