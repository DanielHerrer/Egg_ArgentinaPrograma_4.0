Algoritmo diferenciasDeNumeros
	
	Definir i, vector, num, dim Como Entero
	
	Escribir "Definir el tama�o del vector: "
	Leer dim
	Dimension vector(dim)
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero entero de la posicion " i+1 ": "
		Leer num
		vector(i) = num
	FinPara
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[", vector(i) "]"
	FinPara
	
	Escribir ""
	Escribir "La diferencia entre el num m�s grande y el m�s chico es: " diferenciaNum(vector,dim)
	
FinAlgoritmo

Funcion diferencia <- diferenciaNum(vector Por Referencia, dim Por Valor)
	
	Definir i, numGrande, numChico, diferencia Como Entero
	i=0
	numChico = vector(i)
	numGrande = vector(i)
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Si vector(i) > numGrande Entonces
			numGrande = vector(i)
		FinSi
		Si vector(i) < numChico Entonces
			numChico = vector(i)
		FinSi
	FinPara
	
	diferencia = numGrande - numChico
	
FinFuncion

////Crear una funci�n que devuelva la diferencia que hay entre el valor m�s chico de un arreglo y
////su valor m�s grande.