Algoritmo fechaValida
	
	Definir dd, mm, aa Como Entero
	
	Escribir "Ingrese el dia, el mes y el año, en ese orden: "
	Leer dd, mm, aa
	
	Si 0 < dd Y dd < 32 Y 0 < mm Y mm < 13 Y aa > 0 Y aa < 2024 Entonces
		Segun mm Hacer
			1: 
				Escribir dd, " de enero del ", aa
			2:
				Escribir dd, " de febrero del ", aa
			3:
				Escribir dd, " de marzo del ", aa
			4:
				Escribir dd, " de abril del ", aa
			5:
				Escribir dd, " de mayo del ", aa
			6:
				Escribir dd, " de junio del ", aa
			7:
				Escribir "Julio"
			8:
				Escribir "Agosto"
			9:
				Escribir "Septiembre"
			10:
				Escribir "Octubre"
			11:
				Escribir "Noviembre"
			12:
				Escribir "Diciembre"

		FinSegun
	SiNo
		
		Escribir "Algun dato fue invalido."
		
	FinSi
	
FinAlgoritmo
