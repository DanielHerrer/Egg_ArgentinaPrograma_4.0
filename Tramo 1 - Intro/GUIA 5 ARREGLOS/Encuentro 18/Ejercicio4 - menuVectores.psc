Algoritmo menuVectores
	
	Definir op, i, dim, vA, vB, vC Como Entero
	Definir opVector Como Caracter
	Definir salir, vAlleno, vBlleno, vClleno Como Logico
	salir = Falso
	vAlleno = Falso
	vBlleno = Falso
	vClleno = Falso
	
	Escribir "Bienvenido"
	Hacer
		Escribir "Ingrese el tama�o de los vectores: "
		Leer dim
	Mientras Que dim <= 0
	
	Dimension vA(dim)
	Dimension vB(dim)
	Dimension vC(dim)
	
	Hacer
		Hacer
			Escribir "1. Llenar Vector A."
			Escribir "2. Llenar Vector B."
			Escribir "3. Llenar Vector C con la SUMA de los vectores A y B."
			Escribir "4. Llenar Vector C con la RESTA de los vectores A y B."
			Escribir "5. Mostrar A/B/C"
			Escribir "6. Salir"
			
			Escribir "Ingrese su opcion: "
			Leer op
		Mientras Que No(op<7 O op>0)
		
		Segun (op)
			
			1:
				Para i<-0 Hasta dim-1 Con Paso 1 Hacer
					vA(i) = Aleatorio(-100,100)
				FinPara
				vAlleno = Verdadero
			2:
				Para i<-0 Hasta dim-1 Con Paso 1 Hacer
					vB(i) = Aleatorio(-100,100)
				FinPara
				vBlleno = Verdadero
			3:
				Para i<-0 Hasta dim-1 Con Paso 1 Hacer
					vC(i) = vA(i) + vB(i)
				FinPara
				vClleno = Verdadero
			4:
				Para i<-0 Hasta dim-1 Con Paso 1 Hacer
					vC(i) = vA(i) - vB(i)
				FinPara
				vClleno = Verdadero
			5:
				Hacer
					Escribir "Elija qu� vector desea mostrar (A/B/C): "
					Leer opVector
				Mientras Que No(opVector=="A" O opVector=="B" O opVector=="C")
				
				Segun opVector 
					"A":
						Si vAlleno <> Verdadero
							Escribir "El vector A no posee datos guardados a�n."
						SiNo
							Para i<-0 Hasta dim-1 Con Paso 1 Hacer
								Escribir Sin Saltar "[" vA(i) "], "
							FinPara
						FinSi
					"B":
						Si vBlleno <> Verdadero
							Escribir "El vector B no posee datos guardados a�n."
						SiNo
							Para i<-0 Hasta dim-1 Con Paso 1 Hacer
								Escribir Sin Saltar "[" vB(i) "], "
							FinPara
						FinSi
					"C":
						Si vClleno <> Verdadero
							Escribir "El vector C no posee datos guardados a�n."
						SiNo
							Para i<-0 Hasta dim-1 Con Paso 1 Hacer
								Escribir Sin Saltar "[" vC(i) "], "
							FinPara
						FinSi
				FinSegun
				Escribir ""
			6:
				salir = Verdadero
		FinSegun
		
	Mientras Que salir == Falso
	Escribir "Finalizando.."
	
FinAlgoritmo

//Realizar un programa con el siguiente men� y le pregunte al usuario que quiere hacer hasta
//que ingrese la opci�n Salir:
//	A. Llenar Vector A. Este vector es de tama�o N y se debe llenar de manera aleatoria
//	usando la funci�n Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector tambi�n es de tama�o N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opci�n debe permitir al usuario decidir qu� vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.

//NOTA: El rango de los n�meros aleatorios para los Vectores ser� de [-100 a 100]. 
//La longitud para todos los vectores debe ser la misma, por lo tanto, esa informaci�n s�lo se solicitar� una vez.