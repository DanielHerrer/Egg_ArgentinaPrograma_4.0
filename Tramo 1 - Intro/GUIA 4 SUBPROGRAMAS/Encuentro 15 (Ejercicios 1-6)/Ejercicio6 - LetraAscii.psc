Algoritmo letraAscii
	
	Definir letra Como Caracter
	
	Escribir "Ingrese una letra: "
	Leer letra
	letra = Mayusculas(letra)
	
	entreMyT(letra)
	
FinAlgoritmo


/// SEGUN EL MENTOR DEBERIAMOS USAR UN SEGUN, SIN EMBARGO, HA FUNCIONADO SOLO COMPARANDO LOS CARACTERES

SubProceso entreMyT(letra Por Valor)
	
	Si letra > "M" Y letra < "T" Entonces
		Escribir "La letra esta dentro del rango M y T."
	SiNo
		Escribir "La letra esta fuera del rango M y T."
	FinSi
 	
FinSubProceso

//		Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//		letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//		Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.