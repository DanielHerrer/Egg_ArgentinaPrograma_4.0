Algoritmo ejercicio6
	definir vectorBase, frase, ingreso como caracter	
	definir i, pos, contador, j, k , l como entero
	dimension vectorBase[20]
	contador = 0
	escribir "ingrese una frase de hasta 20 caracteres"
	leer frase
	
	Para i = 0 Hasta 19 		
		vectorBase[i] = Subcadena(frase, i, i)	
	Fin Para
	
	escribir "ingrese el caracter % para ubicarlo dentro de un espacio de ser posible"
	leer ingreso
	escribir "Posición de 0 a 19"
	leer pos
	
	para j <- pos hasta 19 Hacer
		si Subcadena(frase, j, j) == " " o Subcadena(frase, j, j)	== ""
			contador = contador + 1
		FinSi
	FinPara
	si contador > 0 Entonces
		
			si Subcadena(frase, pos, pos)	== " " o Subcadena(frase, pos, pos)	== ""
				vectorBase[pos] = ingreso
				
			Para i = 0 Hasta 19 		
				escribir sin saltar vectorBase[i] 
			Fin Para
			
			SiNo
		
				para l <- 19 hasta pos con paso -1 Hacer
					
					vectorBase[l] = vectorBase[l-1]
		
				FinPara
				
				vectorBase[pos] = ingreso
				
				para k <- 0 hasta 19 Hacer
					Escribir sin saltar vectorBase[k]
				FinPara
		FinSi
	sino 
		Escribir "no hay espacio sufuciente para introducir su caracter" 
	FinSi
	

		

	escribir ""
		

	
FinAlgoritmo
