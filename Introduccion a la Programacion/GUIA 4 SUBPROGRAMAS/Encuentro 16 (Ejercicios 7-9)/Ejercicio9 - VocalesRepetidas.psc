Algoritmo vocalesRep
	Definir palabra Como Cadena 
	
	Escribir "Ingrese una palabra:"
	Leer palabra
	
	vocalesRepetidas(palabra)
FinAlgoritmo

SubProceso vocalesRepetidas(frase Por Valor)
	
	Definir i, num, cA, cE, cI, cO, cU Como Entero
	Definir fraseFinal, letra, texto1, texto2 Como Cadena
	fraseFinal = frase
	cA=0
	cE=0
	cI=0
	cO=0
	cU=0
	
	Para i<-0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		///Separa en 3 partes el texto, dejando sola la letra
		letra = Subcadena(fraseFinal,i,i)
		texto1 = Subcadena(fraseFinal,0,i-1)
		texto2 = Subcadena(fraseFinal,i+1,(Longitud(fraseFinal)-1))
		
		Segun letra Hacer
			"a":
				cA = cA + 1
				Si cA >= 2 Entonces
					fraseFinal = texto1 + texto2
				SiNo
					fraseFinal = texto1 + letra + texto2
				FinSi
			"e":
				cE = cE + 1
				Si cE >= 2 Entonces
					fraseFinal = texto1 + texto2
				SiNo
					fraseFinal = texto1 + letra + texto2
				FinSi
			"i":
				cI = cI + 1
				Si cI >= 2 Entonces
					fraseFinal = texto1 + texto2
				SiNo
					fraseFinal = texto1 + letra + texto2
				FinSi
			"o":
				cO = cO + 1
				Si cO >= 2 Entonces
					fraseFinal = texto1 + texto2
				SiNo
					fraseFinal = texto1 + letra + texto2
				FinSi
			"u":
				cU = cU + 1
				Si cU >= 2 Entonces
					fraseFinal = texto1 + texto2
				SiNo
					fraseFinal = texto1 + letra + texto2
				FinSi
		FinSegun
	FinPara
	
	Escribir fraseFinal
	
FinSubProceso

//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales re-
//petidas. Al final el procedimiento mostrará la frase final.
//
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	
//	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? que-
//		dan al no estar repetidas.