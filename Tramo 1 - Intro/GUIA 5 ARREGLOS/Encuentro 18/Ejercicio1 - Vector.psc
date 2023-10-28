Algoritmo vector
	Definir i, num, vector_num Como Entero
	Dimension vector_num(5)
	
	i=0
	Hacer
		Escribir "Ingrese un numero: "
		Leer num
		vector_num(i) = num
		i = i + 1
	Mientras Que i <= 4 
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "[" vector_num(i) "], "
	FinPara
	
FinAlgoritmo

//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.