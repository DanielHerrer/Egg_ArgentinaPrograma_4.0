SubProceso rellenar(v1 por referencia, v2 Por Referencia, dim)
	Definir i como entero
	Para i = 0 hasta dim-1 con paso 1 Hacer
		v1(i) = Aleatorio(0,1)
		v2(i) = Aleatorio(0,1)
	FinPara
FinSubProceso

Funcion igualdad = iguales(v1 Por Referencia,v2 Por Referencia, dim)
	Definir igualdad Como Logico
	Definir i Como Entero
	igualdad = Verdadero
	Para i = 0 hasta dim-1 con paso 1 Hacer
		Si v1(i) <> v2(i) Entonces
			igualdad = Falso
		FinSi
	FinPara
FinFuncion

Algoritmo Ejercicio7
	Definir v1, v2, i, dim Como Entero
	
	Escribir "Ingrese el tamaño de los vectores"
	Leer dim
	Dimension v1(dim)
	Dimension v2(dim)
	
	rellenar(v1, v2, dim)
	
	Si iguales(v1,v2, dim) = Verdadero
		Escribir "Los dos vectores son iguales"
		Para i = 0 hasta dim-1 con paso 1 Hacer
			Escribir sin saltar "{" v1(i) "} "
		FinPara
		Escribir ""
		Para i = 0 hasta dim-1 con paso 1 Hacer
			Escribir sin saltar "{" v2(i) "} "
		FinPara
	SiNo
		Escribir "Los dos vectores son distintos"
		Para i = 0 hasta dim-1 con paso 1 Hacer
			Escribir sin saltar "{" v1(i) "} "
		FinPara
		Escribir ""
		Para i = 0 hasta dim-1 con paso 1 Hacer
			Escribir sin saltar "{" v2(i) "} "
		FinPara
	FinSi
	Escribir ""
FinAlgoritmo
//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
// hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
// función debe devolver el resultado de esta validación, para mostrar el mensaje en el algoritmo.
//	Nota: recordar el uso de las variables de tipo lógico.