Algoritmo capicua
	
	Definir num, num2, cen, dec, uni, cen2, dec2, uni2 Como Entero
	
	Escribir "Escriba un numero de 3 CIFRAS: "
	Leer num 
	
	Si num <= 999 Y num >= 100 Entonces
		
		cen = trunc(num / 100)
		dec = trunc((num - (cen * 100)) / 10) 
		uni = trunc((num - (cen * 100) - (dec * 10)))
	
		Si cen == uni Entonces 
			Escribir "El numero es capicua"
		SiNo
			Escribir "El numero no es capicua"
		FinSi
		
	SiNo
		
		Escribir "Su numero no es correcto"
		
	FinSi
	
	Escribir "Adios"
	
FinAlgoritmo
