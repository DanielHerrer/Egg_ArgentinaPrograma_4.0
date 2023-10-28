Algoritmo desafio
	Escribir "Bienvenido."
	menu()
FinAlgoritmo

SubProceso menu()
	Definir op Como Entero
	Definir bandera Como Logico
	
	Escribir "1. Calcular muro de ladrillo"
	Escribir "2. Calcular viga de hormigón"
	Escribir "3. Calcular columnas de hormigón"
	Escribir "4. Calcular contrapisos"
	Escribir "5. Calcular techo"
	Escribir "6. Calcular pisos"
	Escribir "7. Calcular pintura"
	Escribir "8. Calcular iluminacion"
	Escribir "9. Salir"
	Hacer
		Escribir "Qué opcion desea?"
		Leer op	
		Segun op
			1:
				calcularMuro()
				bandera = Falso
			2:
				calcularViga()
				bandera = Falso
			3:
				calcularColumna()
				bandera = Falso
			4:
				calcularContrapisos()
				bandera = Falso
			5:
				calcularTecho()
				bandera = Falso
			6:
				calcularPisos()
				bandera = Falso
			7:
				calcularPintura()
				bandera = Falso
			8:	
				calcularIluminacion()
				bandera = Falso
			9:
				Escribir "Cerrando progragrama..."
				bandera = Falso
			De Otro Modo:
				Escribir "Opcion incorrecta."
				bandera = Verdadero
		FinSegun
	Mientras Que bandera
FinSubProceso

Funcion superficie <- calcularSuperficie(base Por Valor, alto Por Valor)
	Definir superficie Como Real
	superficie = base * alto
FinSubProceso

Funcion volumen <- calcularVolumen(ancho Por Valor, largo Por Valor, espesor Por Valor)
	Definir volumen Como Real
	volumen = espesor * ancho * largo
FinFuncion

SubProceso calcularMuro()
	Definir espesorCm, base, altura Como Real
	
	Hacer
		Escribir "El muro será de 20 o 30 cm de espesor? "
		Leer espesorCm
	Mientras Que espesorCm < 20 O espesorCm > 30
	
	Escribir "Defina el largo y el alto: "
	Leer base, altura
	
	Escribir "La superficie es de ", calcularSuperficie(base, altura) " m2."
	
	Si espesorCm == 20
		Escribir "Requiere " 10.9 * calcularSuperficie(base, altura) " kg de cemento, " 0.09 * calcularSuperficie(base, altura) " m3 de arena y " trunc(90 * calcularSuperficie(base, altura)) " ladrillos."
	SiNo
		Escribir "Requiere " 15.2 * calcularSuperficie(base, altura) " kg de cemento, " 0.115 * calcularSuperficie(base, altura) " m3 de arena y " trunc(120 * calcularSuperficie(base, altura)) " ladrillos."
	FinSi
FinSubProceso

SubProceso calcularViga()
	Definir largoViga Como Real
	Escribir "Defina el largo de la viga: "
	Leer largoViga
	Escribir "Requiere " 9 * largoViga " kg de cemento, " 0.02 * largoViga " m3 de arena, " 0.02 * largoViga " m2 de piedra, " 4 * largoViga " m de hierro del 8 y " 3 * largoViga " m de hierro del 4."              
FinSubProceso

SubProceso calcularColumna()
	Definir largoColumna Como Real
	Escribir "Defina el largo de la columna: "
	Leer largoColumna
	Escribir "Requiere " 7.5 * largoColumna " kg de cemento, " 0.016 * largoColumna " m3 de arena, " 0.016 * largoColumna " m2 de piedra, " 6 * largoColumna " m de hierro del 10 y " 3 * largoColumna " m de hierro del 4."
FinSubProceso

SubProceso calcularContrapisos()
	Definir espesor, ancho, largo Como Real
	Escribir "Definir espesor, ancho y largo del contrapiso a calcular: "
	Leer espesor, ancho, largo
	Escribir "Requiere " 105 * calcularVolumen(ancho,largo,espesor) " kg de cemento, " 0.45 * calcularVolumen(ancho,largo,espesor) " m3 de arena, " 0.9 * calcularVolumen(ancho,largo,espesor) " m3 de piedra."
FinSubProceso

SubProceso calcularTecho()
	Definir  espesor, ancho, largo Como Real
	Escribir "Definir espesor, ancho y largo del techo a calcular: "
	Leer espesor, ancho, largo
	Escribir "Requiere " 33 * calcularVolumen(ancho,largo,espesor) " kg de cemento, " 0.072 * calcularVolumen(ancho,largo,espesor) " m3 de arena, " 0.072 * calcularVolumen(ancho,largo,espesor) " m3 de piedra ," 7 * calcularVolumen(ancho,largo,espesor) " m de hierro del 8 y " 4 * calcularVolumen(ancho,largo,espesor) " m de hierro del 6."
FinSubProceso

SubProceso calcularPisos()
	Definir ancho, largo Como Real
	Escribir "Defina el ancho y largo del paño de piso a colocar: "
	Leer ancho, largo
	Escribir calcularSuperficie(ancho,largo) * 1.10 " m2"
FinSubProceso

SubProceso calcularPintura()
	Definir pintura, base, altura Como Real
	Escribir "Defina la base y altura del muro a pintar:"
	Leer base, altura
	pintura = 6 * calcularSuperficie(base,altura)
	Escribir "Requiere ", pintura " litros de pintura para poder pintar una superficie de ", calcularSuperficie(base,altura) " m2."
FinSubProceso

SubProceso calcularIluminacion()
	Definir altura, base Como Real
	Escribir "Defina la altura y base de la habitacion: "
	Leer altura, base
	Escribir "La cantidad minima de superficie de iluminacion natural es: " calcularSuperficie(base,altura) * 0.20
FinSubProceso

//Vamos a programar una calculadora de materiales para construir
//	Primero leeremos todo el ejercicio y luego dividiremos tareas en el equipo.
//	El algoritmo principal sólo debe llamar al subPrograma menu()
//		Cada subPrograma puede descomponerse, si hiciera falta, en otros subProgramas a creatividad
//			del programador
//		El menú debe quedar de la siguiente manera:
//			1. Calcular muro de ladrillo
//			2. Calcular viga de hormigón
//			3. Calcular columnas de hormigón
//			4. Calcular contrapisos
//			5. Calcular techo
//			6. Calcular pisos
//			7. Calcular pintura
//			8. Calcular iluminación
//			9. Salir


//			subprogramas calcularSuperficie y calcularVolumen
//							Haremos ambos para usarlos dentro de los otros subprogramas. El usuario no puede acceder a
//							ellos.
//				
//			subprograma calcularMuro
//							Nos debe pedir primero si el muro será de 20 o 30 cm de espesor. Luego el largo y el alto. A partir
//							de estos datos se debe mostrar al usuario la superficie del muro y la cantidad de materiales que
//							necesitaremos para construirlo.
//							Si el muro es de 30cm necesitaremos por metro cuadrado: 15.2 kg de cemento, 0.115 m3 de arena
//							y 120 ladrillos.
//							Si el muro es de 20cm necesitaremos por metro cuadrado: 10.9 kg de cemento, 0.09 m3 de arena
//							y 90 ladrillos.
//			subprograma calcularViga
//							Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento, 0.02
//								m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
//								Debemos mostrar al usuario la cantidad de materiales necesaria.
//			subprograma calcularColumna
//							Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
//								cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
//								Debemos mostrar al usuario la cantidad de materiales necesaria.
//			subprograma calcularContrapisos
//								Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
//							Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3 de
//								piedra.
//								Debemos mostrar al usuario la cantidad de materiales necesaria.
//			subprograma calcularTecho
//								Nos debe pedir espesor, ancho y largo del techo a calcular.
//							Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3 de
//								piedra, 7 m de hierro del 8 y 4 m de hierro del 6
//								Debemos mostrar al usuario la cantidad de materiales necesaria.
//			subprograma calcularPisos
//								Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe calcular la
//								superficie y añadirle un 10% extra por recortes
//								Mostrar el resultado en m2
//			subprograma calcularPintura
//								Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en cuenta
//								que rinde 6 m2 por litro de pintura.
//			subprograma calcularIluminacion
//							Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
//								superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
//								puertas de vidrio). Mostrar resultado