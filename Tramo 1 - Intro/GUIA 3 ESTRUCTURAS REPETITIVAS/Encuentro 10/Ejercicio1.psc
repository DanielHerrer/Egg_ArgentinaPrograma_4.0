Algoritmo pagosComisiones
	
	Definir i, j, nVendedores, sueldoBase, sueldoFinal, nComisiones, precioComision, totalComision Como Real
	
	Escribir "Ingrese cuantos vendedores contratados tiene: "
	Leer nVendedores
	
	Para i <- 1 Hasta nVendedores Con Paso 1 Hacer
		totalComision = 0
		
		Escribir "Ingrese cual es el sueldo base semanal del empleado N�", i " : "
		Leer sueldoBase
		
		Escribir "Ingrese cuantas ventas ha realizado: "
		Leer nComisiones
		
		Para j <- 1 Hasta nComisiones Con Paso 1 Hacer
			
			Escribir "Ingrese cuanto ha cobrado por la venta N�", j " : "
			Leer precioComision
			
			totalComision = totalComision + precioComision
			
		FinPara
		
		Escribir "Datos completos del empleado N�", i
		Escribir "Total por las ", nComisiones " comisiones realizadas $", totalComision * 0.1
		Escribir "Sueldo base + Total de comision $", sueldoBase + (totalComision * 0.1)
		
	FinPara
	
	Escribir "Finalizando programa..."
	
FinAlgoritmo

//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.