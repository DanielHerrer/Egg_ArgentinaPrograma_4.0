Algoritmo frase4
	
	Definir palabra, palabra2 Como Cadena
	
	Escribir "Escriba una palabra: "
	Leer palabra
	
	Si Longitud(palabra) == 4 Entonces
		
		palabra2 = Concatenar(palabra,"!")
		Escribir palabra2
		
	SiNo
		
		palabra2 = Concatenar(palabra,"?")
		Escribir palabra2
		
	FinSi
	
FinAlgoritmo
