Algoritmo notaCorrecta
	
	Definir nota Como Real
	
	Escribir "Ingrese una nota v�lida: "
	Leer nota
	
	Mientras nota < 0 O nota > 10
		
		Escribir "Escriba nuevamente una nota valida: "
		Leer nota
		
	FinMientras
	
	Escribir "Adios, la nota ", nota  " es correcta."
	
FinAlgoritmo

//Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la nota
//		se pedir� de nuevo hasta que la nota sea correcta.