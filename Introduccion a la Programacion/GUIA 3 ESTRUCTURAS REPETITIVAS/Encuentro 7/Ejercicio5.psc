Algoritmo minMax
	
	Definir numIngresado, contador, numMin, numMax Como Entero
	contador = 0
	
	Escribir "Ingrese dos numeros enteros, uno minimo, y uno maximo, en ese orden: "
	Leer numMin, numMax
		// 30       80
	
	//  basura    =   30 + 1
	numIngresado = numMin + 1
	
				// 31       >=  30          31      <=       80
	Mientras numIngresado >= numMin Y numIngresado <= numMax
		
		Escribir "Ingrese un numero que se encuentre entre ", numMin " y ", numMax "" 
		Leer numIngresado
		
		contador = contador + 1		
		
	FinMientras
	
FinAlgoritmo