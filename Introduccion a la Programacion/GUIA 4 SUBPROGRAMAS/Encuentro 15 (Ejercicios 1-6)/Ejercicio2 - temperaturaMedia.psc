Algoritmo temperaturas
	
	Definir i, cantDias, tempMin, tempMax Como Entero

	Escribir "Ingrese la cantidad de dias: "
	Leer cantDias
	
	Para i<-1 Hasta cantDias Con Paso 1 Hacer
		
		Escribir "Escribir la temperatura Minima y la temperatura Maxima del dia ", i " : "
		Leer tempMin, tempMax
		
		Escribir Sin Saltar "Dia ", i " "
		temperaturaMedia(tempMin, tempMax)
		
	FinPara
	
FinAlgoritmo

SubProceso temperaturaMedia(tempMax Por Valor, tempMin Por Valor)
	
	Definir tempMedia Como Real
	tempMedia = (tempMax + tempMin) / 2
	
	Escribir ", la temperatura media es: ",tempMedia "�"
	
FinSubProceso

//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. 

//El programa pedir� el n�mero de d�as que se van a introducir.