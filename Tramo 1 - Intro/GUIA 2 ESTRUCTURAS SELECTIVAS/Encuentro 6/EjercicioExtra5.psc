Algoritmo anioBisiesto
	
	Definir anio Como Entero
	
	Escribir "Escriba el a�o"
	Leer anio
	
	Si anio % 4 == 0 Y No(anio % 100 = 0)
		Escribir "Su a�o es bisiesto."
	SiNo
		Si anio % 400 = 0 Entonces
			Escribir "Su a�o es bisiesto."
		SiNo
			Escribir "Su a�o NO es bisiesto."
		FinSi
	FinSi
	
FinAlgoritmo

//Realice un programa que, dado un a�o, nos diga si es bisiesto o no. Un a�o es bisiesto
//bajo las siguientes condiciones: Un a�o divisible por 4 es bisiesto y no debe ser divisible
//	por 100. Si un a�o es divisible por 100 y adem�s es divisible por 400, tambi�n resulta
//	bisiesto. Nota: recuerde la funci�n mod de PseInt