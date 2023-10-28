Algoritmo vectorNumGrande
	
	Definir i, vectorA, dim, num Como Entero
	Escribir "Ingrese la dimension del vector: "
	Leer dim
	
	Dimension vectorA(dim)
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Escribir "Ingrese un valor para la posicion ", i + 1 ": "
		Leer num
		vectorA(i) = num
	FinPara  
	
	Escribir "El valor mas grande del vector es: ", valorMasGrande(vectorA,dim)
	
FinAlgoritmo
										/// VECTOR P REF   ! DIMENSION P VALOR    
Funcion numGrande <- valorMasGrande(vector Por Referencia, dim Por Valor)
	
	Definir numGrande, i Como Entero
	numGrande = 0			/// iniciar numero grande en 0
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Si vector(i) > numGrande Entonces 
			numGrande = vector(i) 
		FinSi
	FinPara
	
FinFuncion

//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usua-
//rio. A continuación, se deberá crear una función que reciba el vector y devuelva el valor más
//grande del vector.