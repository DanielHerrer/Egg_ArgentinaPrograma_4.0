//////Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//////20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//////Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:

//////	a) Deficientes 0-5
//////	b) Regulares 6-10
//////	c) Buenos 11-15
//////	d) Excelentes 16-20

Algoritmo vectorAlumnos
	
	Definir i, vectorNotas, alumDef, alumReg, alumBue, alumExc Como Entero
	Dimension vectorNotas(100)
	alumDef = 0
	alumReg = 0
	alumBue = 0
	alumExc = 0
	
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		vectorNotas(i) = Aleatorio(0,20)
	FinPara
	
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		Si vectorNotas(i) < 21 Y vectorNotas(i) > 15 Entonces
			alumExc = alumExc + 1
		SiNo
			Si vectorNotas(i) < 16 Y vectorNotas(i) > 10 Entonces
				alumBue = alumBue + 1
			SiNo
				Si vectorNotas(i) < 11 Y vectorNotas(i) > 5 Entonces
					alumReg = alumReg + 1
				SiNo
					Si vectorNotas(i) < 6 Y vectorNotas(i) >= 0 Entonces
						alumDef = alumDef + 1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "-------------------------------------------------------"
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		Escribir Sin Saltar "[" vectorNotas(i) "]"
	FinPara
	Escribir ""
	Escribir "-------------------------------------------------------"
	
	Escribir "Los alumnos excelentes son:  " alumExc
	Escribir "Los alumnos buenos son:      " alumBue
	Escribir "Los alumnos regulares son:   " alumReg
	Escribir "Los alumnos deficientes son: " alumDef
	
FinAlgoritmo
