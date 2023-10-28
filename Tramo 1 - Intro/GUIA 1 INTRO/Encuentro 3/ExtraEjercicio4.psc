Algoritmo tiempoSegundos
	
	Definir segTotales, horFinal, minFinal, segFinal Como Entero
	
	Escribir "Ingrese la cantidad total de segundos: "
	Leer segTotales
	
	segFinal = segTotales % 60
	minFinal = trunc(segTotales / 60)
	horFinal = trunc(minFinal / 60)
	minFinal = trunc(minFinal % 60)
	
	Escribir "El tiempo total sería ",horFinal ":",minFinal ":",segFinal
	
FinAlgoritmo
