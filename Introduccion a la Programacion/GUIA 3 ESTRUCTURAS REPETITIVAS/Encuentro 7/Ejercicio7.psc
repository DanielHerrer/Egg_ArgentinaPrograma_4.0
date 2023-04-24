Algoritmo promedioAlumnos
	
	Definir notaPractica, notaProblemas, notaTeorica, notaFinal, promedio Como Real
	Definir nombre Como Cadena
	
	nombre = "xxx"
	
	Mientras nombre <> ""
		
		Escribir "Ingrese el nombre del alumno: "
		Leer nombre
		
		Si nombre == "" Entonces
			
			Escribir "Adios"
			
		SiNo
			
			Escribir "Ingrese la nota de trabajos practicos, problemas y teorico, en ese orden: "
			Leer notaPractica, notaProblemas, notaTeorica
			
			promedio = ((notaPractica * 0.1) + (notaProblemas * 0.5) + (notaTeorica * 0.4))
			Escribir "El promedio de sus notas ingresadas: %", promedio 
			
		FinSi
		
	FinMientras
	
FinAlgoritmo
