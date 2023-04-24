Algoritmo vocalSecreta
	
	Definir letra, vocalS Como Caracter
	vocalS = "U"
	letra = ""
	
	Mientras letra <> vocalS
		Escribir "Ingrese una letra hasta descubrir la vocal secreta:"
		Leer letra
		letra = Mayusculas(letra)
	FinMientras
	
	Escribir "Felicidades! Ha descubierto la vocal secreta ", vocalS
	
FinAlgoritmo
