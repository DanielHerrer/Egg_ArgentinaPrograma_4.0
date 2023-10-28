Algoritmo promedioSinLimite
	
	Definir contador, numIngresado, promedio Como Real

	promedio = 0
	contador = 0
	numIngresado = 0
	
	Mientras numIngresado <> -1
		
		Escribir "Ingrese una nota a promediar: "
		Leer numIngresado
		
		Si numIngresado == -1 Entonces
			
			Escribir "Su promedio es: ", promedio / contador
			
		SiNo
			
			promedio = promedio + numIngresado
			contador = contador + 1
			
		FinSi
		
	FinMientras
	
FinAlgoritmo
