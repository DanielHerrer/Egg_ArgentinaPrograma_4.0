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
	
	Escribir ", la temperatura media es: ",tempMedia "º"
	
FinSubProceso

//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. 

//El programa pedirá el número de días que se van a introducir.