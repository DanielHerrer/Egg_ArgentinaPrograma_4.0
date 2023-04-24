Algoritmo anioBisiesto
	
	Definir anio Como Entero
	
	Escribir "Escriba el año"
	Leer anio
	
	Si anio % 4 == 0 Y No(anio % 100 = 0)
		Escribir "Su año es bisiesto."
	SiNo
		Si anio % 400 = 0 Entonces
			Escribir "Su año es bisiesto."
		SiNo
			Escribir "Su año NO es bisiesto."
		FinSi
	FinSi
	
FinAlgoritmo

//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//	bisiesto. Nota: recuerde la función mod de PseInt