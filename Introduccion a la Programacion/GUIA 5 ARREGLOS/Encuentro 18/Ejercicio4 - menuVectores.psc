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
		Escribir "Ingrese el tamaño de los vectores: "
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
					Escribir "Elija qué vector desea mostrar (A/B/C): "
					Leer opVector
				Mientras Que No(opVector=="A" O opVector=="B" O opVector=="C")
				
				Segun opVector 
					"A":
						Si vAlleno <> Verdadero
							Escribir "El vector A no posee datos guardados aún."
						SiNo
							Para i<-0 Hasta dim-1 Con Paso 1 Hacer
								Escribir Sin Saltar "[" vA(i) "], "
							FinPara
						FinSi
					"B":
						Si vBlleno <> Verdadero
							Escribir "El vector B no posee datos guardados aún."
						SiNo
							Para i<-0 Hasta dim-1 Con Paso 1 Hacer
								Escribir Sin Saltar "[" vB(i) "], "
							FinPara
						FinSi
					"C":
						Si vClleno <> Verdadero
							Escribir "El vector C no posee datos guardados aún."
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

//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.

//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. 
//La longitud para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una vez.