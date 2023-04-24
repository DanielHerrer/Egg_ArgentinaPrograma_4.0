Algoritmo letra_A_Buscar
	
	Definir palabra, letraB Como Cadena
	
	Escribir "Ingrese la palabara: "
	Leer palabra
	palabra = Mayusculas(palabra)
	Escribir "Ingrese la letra a buscar: "
	Leer letraB
	letraB = Mayusculas(letraB)
	
	Escribir "La letra ", letraB " se ha encontrado en la palabra ", palabra " un total de ", letraBuscada(palabra,letraB) " veces..."
	
FinAlgoritmo

Funcion cantVeces <- letraBuscada(palabra Por Referencia, letraB Por Referencia)
	Definir i Como Entero
	Definir cantVeces Como Entero
	cantVeces = 0
	
	Para i <- 1 Hasta Longitud(palabra) Con Paso 1 Hacer
		
		Si SubCadena(palabra,i,i) == letraB Entonces
			
			cantVeces = cantVeces + 1
			
		FinSi
		
	FinPara
	
FinFuncion

//  Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
//  ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
//	ción Subcadena().