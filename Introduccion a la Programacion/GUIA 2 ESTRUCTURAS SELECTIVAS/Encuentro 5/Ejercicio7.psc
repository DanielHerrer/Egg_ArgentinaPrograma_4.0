Algoritmo letraInicialFinal
	
	Definir palabra Como Cadena
	Definir letraFinal Como Entero
	
	Escribir "Ingrese una palabra EN MINUSCULAS: "
	Leer palabra
	
	letraFinal = (Longitud(palabra) - 1)
	
	Si Subcadena(palabra,0,0) == Subcadena(palabra,letraFinal,letraFinal) Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi

FinAlgoritmo
