//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usuario. 
//A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar también debe ser ingresado por el usuario).
//El programa debe indicar la posición donde se encuentra el valor.
//En caso de que el número se encuentre repetido dentro del arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso de que el número a buscar no está adentro del arreglo se debe mostrar un mensaje.

Algoritmo Ejercicio3
	Definir i, tamanioV como Entero
	Escribir "Ingrese la dimension del vector"
	Leer tamanioV
	
	Definir vector como real
	Dimension vector(tamanioV)
	
	Para i = 0 hasta tamanioV-1 con paso 1 Hacer
		Escribir "Ingrese un número"
		Leer vector(i)
	FinPara
	
	buscar(vector, tamanioV)
FinAlgoritmo

SubProceso buscar(vector Por Referencia, tamanioV Por Referencia)
	Definir num, i Como Real
	Definir encontrado Como Logico
	Escribir "Ingrese un número a buscar en el vector"
	Leer num
	encontrado = falso
	Para i = 0 hasta tamanioV-1 Hacer
		Si vector(i) == num Entonces
			encontrado = Verdadero
			Escribir "Este número se encontró en la posición ", i+1
		FinSi
	FinPara
	Si encontrado = Falso Entonces
		Escribir "El número ingreasdo no está en el vector"
	FinSi
FinSubProceso

	