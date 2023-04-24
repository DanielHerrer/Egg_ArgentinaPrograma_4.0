Algoritmo promedioAlumnos 
	
	Definir i, numAlumnos, alumnosDesaprobados, notaPromedioDesaprobado, notaMayorExpo, notaFinal, notaExpo, notaInt, notaParcial, alumnosIntermedios, alumnosAprobados, porcAprobados, mayorNotaExpo Como Real
	notaPromedioDesaprobado = 0
	alumnosIntermedios = 0
	alumnosAprobados = 0
	alumnosDesaprobados = 0
	notaMayorExpo = 0
	
	Escribir "Ingrese el numero de estudiantes matriculados: "
	Leer numAlumnos
	
	Para i <- 1 Hasta numAlumnos Con Paso 1 Hacer
		
		Escribir "Alumno Nª", i
		
		Escribir "Ingrese la nota de exposiciones: "
		Leer notaExpo
		Escribir "Ingrese la nota de integrador: "
		Leer notaInt
		Escribir "Ingrese la nota de parcial: "
		Leer notaParcial
		
		notaFinal = (notaExpo * 0.25) + (notaInt * 0.35) + (notaParcial * 0.4)
		
		Si notaFinal < 6.5
			
			notaPromedioDesaprobado = notaPromedioDesaprobado + notaFinal
			alumnosDesaprobados = alumnosDesaprobados + 1
			
		FinSi
		
		Si notaParcial >= 4.0 Y notaParcial <= 7.5 Entonces
			
			alumnosIntermedios = alumnosIntermedios + 1
			
		FinSi
		
		Si notaInt > 7.5 Entonces
			
			alumnosAprobados = alumnosAprobados + 1
			
		FinSi
		
		Si notaExpo > notaMayorExpo Entonces
			
			notaMayorExpo = notaExpo
			
		FinSi
		
	FinPara
	
	Si alumnosDesaprobados <> 0 Entonces
		
		Escribir "La nota promedio final de los estudiantes que reprobaron el curso: ", notaPromedioDesaprobado / alumnosDesaprobados
		
	SiNo
		
		Escribir "No hubo ningun alumno desaprobado."
		
	FinSi
	
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es: ", (alumnosAprobados / numAlumnos) * 100 "%"
	Escribir "La mayor nota obtenida en las exposiciones es: ", notaMayorExpo
	Escribir "El total de alumnos que obtuvieron en el Parcial entre 4.0 y 7.5 es de: ", alumnosIntermedios
	
	Escribir "Adios."
	
FinAlgoritmo

//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
//	§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//		§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//		§ La mayor nota obtenida en las exposiciones.
//		§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno