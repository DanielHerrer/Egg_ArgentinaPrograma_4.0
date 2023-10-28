Algoritmo sin_titulo
	
	Definir i, num, suma, resta, multip, vector_real Como Real
	suma = 0
	resta = 0
	multip = 1
	
	Dimension vector_real(10)
	
	Escribir "Ingrese 10 numeros reales"
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese un numero real: "
		Leer num
		vector_real(i) = num
	FinPara
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		Escribir Sin Saltar "[" vector_real(i) "], "
		multip = vector_real(i) * multip /// SIN CHEQUEAR
		resta = vector_real(i) - resta /// SIN CHEQUEAR
		suma = vector_real(i) + suma
	FinPara
	
	Escribir ""
	Escribir "La SUMA de todos los valores es: ", suma
	Escribir "La RESTA de todos los valores es: ", resta
	Escribir "La MULTIPLICACION de todos los valores es: ", multip
	
FinAlgoritmo

//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arreglo.