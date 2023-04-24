Algoritmo productoVector
	
	Definir i, vector, dim, num Como Entero

	Escribir "Definir el tamaño del vector: "
	Leer dim
	Dimension vector(dim)
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Escribir "Ingrese el valor de la posicion " i+1 ":"
		Leer num
		vector(i) = num
	FinPara
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		Escribir Sin Saltar "[", vector(i) "]"
	FinPara
	
	Escribir ""
	Escribir "El producto del vector es: " producto(vector,dim)
	
FinAlgoritmo

Funcion produc <- producto(vector Por Referencia, dim Por Valor)
	
	Definir i Como Entero
	Definir produc Como Real
	produc = 1
	
	Para i<-0 Hasta dim-1 Con Paso 1 Hacer
		produc = produc * vector(i)
	FinPara
	
FinFuncion

////Programe una función que calcule el producto de un arreglo de números enteros. Para esto
////	imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
////		igual a (V[1]*V[2]*V[3]*V[4])