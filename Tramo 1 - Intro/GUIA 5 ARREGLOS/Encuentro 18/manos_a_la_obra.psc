Algoritmo manos_a_la_obra
	
	Definir i, num, vector_num Como Entero
	Definir frase, vector_frase Como Cadena
	
	Dimension vector_num[5] /// 0 , 1 , 2 , 3 , 4
	Dimension vector_frase[5]
	
	i = 0
	Hacer
		Escribir "Ingrese un numero entero: "
		Leer num
		
		vector_num[i] = num
		i = i + 1
	Mientras Que i <= 4 
	
	i = 0
	Hacer
		Escribir "Ingrese una frase: "
		Leer frase
		
		vector_frase[i] = frase
		i = i + 1
	Mientras Que i <= 4 
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
		Escribir Sin Saltar "[" vector_num[i] "], "
		
	FinPara
	
	Escribir ""
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		
		Escribir Sin Saltar "[" vector_frase[i] "], "
		
	FinPara
	
FinAlgoritmo

//Define un vector que alojará números enteros y otro de cadena. Dimensiona ambos de la longitud
//que tu desees. Ahora en lapiz y papel, escribe la dimensión de tus vectores y sus subíndices.

//Ahora es tu turno. Llena uno de los vectores que definiste y dimensionaste anteriormente, de
//forma manual y el otro con un Bucle Para.

