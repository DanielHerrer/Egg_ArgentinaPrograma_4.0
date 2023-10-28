Algoritmo promedioParImpar
	
	Definir i, num, numTotalPar, numTotalImpar, sumaPar, sumaImpar Como Entero
	i = 0
	numTotalImpar = 0
	sumaImpar = 0
	numTotalPar = 0
	sumaPar = 0
	
	Hacer
		
		Escribir "Ingrese un numero: "
		Leer num
		
		Si num MOD 2 == 0 
			sumaPar = sumaPar + num
			numTotalPar = numTotalPar + 1
		SiNo
			sumaImpar = sumaImpar + num
			numTotalImpar = numTotalImpar + 1
		FinSi
		
		i = i + 1
		
	Mientras Que i < 10 
	
	Escribir "El promedio de los numeros pares: ", sumaPar / numTotalPar
	Escribir "El promedio de los numeros impares: ", sumaImpar / numTotalImpar
	
FinAlgoritmo
