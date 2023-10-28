Algoritmo empleado
	
	Definir tornillosDef, tornillosPerf, tornillosTot, grado Como Entero
	
	Escribir "Cuantos tornillos defectuosos ha producido?: "
	Leer tornillosDef
	
	Escribir "Cuantos tornillos sin defectos produjo?: "
	Leer tornillosPerf
	
	Si tornillosDef < 200 Y tornillosPerf > 10000 Entonces
		grado = 8
	SiNo
		Si tornillosDef > 200 Y tornillosPerf > 10000 Entonces
			grado = 7
		SiNo
			Si tornillosDef < 200 Y tornillosPerf < 10000 Entonces
				grado = 6
			SiNo
				grado = 5
			FinSi
		FinSi
	FinSi
	
	Segun grado Hacer 
		5: Escribir "Usted es grado 5"
		6: Escribir "Usted es grado 6"
		7: Escribir "Usted es grado 7"
		8: Escribir "Usted es grado 8"
	FinSegun
	
FinAlgoritmo

//Segun tornillosDef Y tornillosPerf Hacer
//	
//	tornillosDef < 200 Y tornillosPerf > 10000:
//		grado = 8
//	tornillosDef > 200 Y tornillosPerf > 10000:
//		grado = 7
//	tornillosDef < 200 Y tornillosPerf < 10000:
//		grado = 6
//	De Otro Modo: 
//		grado = 5
//		
//FinSegun


// menos de 200 
// mas de 10000
