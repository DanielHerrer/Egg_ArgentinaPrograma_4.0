//////Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//////almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//////debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//////	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.
Algoritmo ejercicio2
	
	Definir vector2, i, dim, lon Como Entero
	definir vector1, nombre Como Caracter
	
	Escribir "ingrese la dimencion de los vectores"
	Leer dim
	
	lon = 0
	
	Dimension vector1[dim]
	Dimension vector2[dim]
	
	para i <- 0 hasta dim-1 Hacer
		
		Escribir "ingrese un nombre"
		leer nombre
		vector1[i] = nombre
		lon = Longitud(nombre)
		vector2[i] = lon
		
	FinPara
	
	para i <- 0 hasta dim-1 Hacer
		
		Escribir sin saltar vector1[i] "-"
		Escribir sin saltar vector2[i]
		escribir ""
		
	FinPara
	

	
FinAlgoritmo
