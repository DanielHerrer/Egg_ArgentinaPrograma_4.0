Algoritmo calificacionFinal
	
	Definir calif1, calif2, calif3, promedioCalif, examenFinal, trabajoFinal Como Real
	Definir porcCalif, porcExam, porcTrab Como Real
	
	Escribir "Escriba las 3 calificaciones parciales en orden: "
	Leer calif1
	Leer calif2
	Leer calif3
	promedioCalif = (calif1+calif2+calif3) / 3
	
	Escribir "Escriba la nota de su examen final: "
	Leer examenFinal
	
	Escribir "Escriba la nota de su trabajo final: "
	Leer trabajoFinal
	
	porcCalif = (55 / 10) * promedioCalif
	porcExam = (30 / 10) * examenFinal
	porcTrab = (15 / 10) * trabajoFinal
	
	Definir porcTotal Como Real
	porcTotal = porcCalif + porcExam + porcTrab
	Escribir "Su porcentaje total de calificaciones es de: ", trunc(porcTotal) "%"
	
FinAlgoritmo
