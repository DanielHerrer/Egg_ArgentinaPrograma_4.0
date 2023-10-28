Algoritmo promedio4notas
	
	Definir nota1, nota2, nota3, nota4, promedio Como Real
	
	Escribir "Ingrese las 4 notas a promediar: "
	Leer nota1, nota2, nota3, nota4
	
	Si nota1 < nota2 Y nota1 < nota3 Y nota1 < nota4 Entonces
		
		promedio = (nota2 + nota3 + nota4) / 3
		Escribir "El promedio de sus trabajos practicos es de ", promedio ", y su nota mas baja fue ", nota1 "."
		
	SiNo
		Si nota2 < nota1 Y nota2 < nota3 Y nota2 < nota4 Entonces
			
			promedio = (nota1 + nota3 + nota4) / 3
			Escribir "El promedio de sus trabajos practicos es de ", promedio ", y su nota mas baja fue ", nota2 "."
			
		SiNo
			Si nota3 < nota4 Y nota3 < nota2 Y nota3 < nota1 Entonces
				
				promedio = (nota1 + nota2 + nota4) / 3
				Escribir "El promedio de sus trabajos practicos es de ", promedio ", y su nota mas baja fue ", nota3 "."
				
			SiNo
				
				promedio = (nota1 + nota2 + nota3) / 3
				Escribir "El promedio de sus trabajos practicos es de ", promedio ", y su nota mas baja fue ", nota4 "."
				
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo