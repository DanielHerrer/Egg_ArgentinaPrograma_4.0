Algoritmo llegarTarde
	
	Definir hh, mm, ss Como Entero
	
	Escribir "Por favor, ingrese la hora actual, hora, minutos y segundos, en ese orden: "
	Leer hh, mm, ss
	
	Si hh < 16
		Escribir "Todavia no es la hora."
	FinSi
	Si hh = 16 Y mm <= 15
		Escribir "Llegaste a tiempo, tienes presente"
	SiNo
		Escribir "Hoy tendrás tardanza. Recuerda avisarle a tus coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"
	FinSi
	
	Escribir "Adios"
	
FinAlgoritmo
