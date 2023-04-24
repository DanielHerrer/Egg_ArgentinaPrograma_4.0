Algoritmo multiplos_2_3
	
	Definir i, num Como Entero
	
	Escribir "Multiplos de 2 o de 3?"
	Leer num
	
	Si num <> 2 Y num <> 3 Entonces
		
		Escribir "Opcion incorrecta."
		
	SiNo
		
		Si num == 2 Entonces
			
			Escribir "Los numeros multiplos de 2 comprendidos entre 1 y 100 son:"
			
			Para i <- 1 Hasta 100 Con Paso 1 Hacer
				
				Si i % 2 == 0 Entonces
					
					Escribir Sin Saltar i " "
					
				FinSi
				
			FinPara
			
		SiNo
			
			Escribir "Los numeros multiplos de 3 comprendidos entre 1 y 100 son:"
			
			Para i <- 1 Hasta 100 Con Paso 1 Hacer
				
				Si i % 3 == 0 Entonces
					
					Escribir Sin Saltar i " "
					
				FinSi
				
			FinPara
			
		FinSi
		
	FinSi
	
FinAlgoritmo

//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
//comprendidos entre 1 y 100.