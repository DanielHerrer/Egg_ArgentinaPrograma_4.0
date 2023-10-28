Algoritmo empresaPagos
	
	Definir op, pagoXhora, cantHoras, ventasTotal, pagoFinal Como Entero
	
	Escribir "Bienvenido a la Empresa, ingrese el tipo de contrato: "
	Escribir "1- Comision"
	Escribir "2- Salario Fijo + Comision"
	Escribir "3- Salario Fijo"
	Leer op
	
	Si op == 1 Entonces
		
		Escribir "El empleado corresponde al contrato por comision."
		Escribir "Ingrese el monto total de ventas realizado en la semana:"
		Leer ventasTotal
		pagoFinal = ventasTotal * 0.4
		
		Escribir "El pago semanal es de $", pagoFinal
		
	SiNo
		
		Si op == 2 Entonces
			
			Escribir "El empleado corresponde al contrato de salario fijo mas comision."
			Escribir "Ingrese el monto pagado por hora:"
			Leer pagoXhora
			
			Escribir "Ingrese la cantidad de horas realizadas en la semana:"
			Leer cantHoras
			
			Si cantHoras > 40 Entonces
				
				cantHoras = 40
				pagoFinal = pagoXhora * cantHoras
				
			SiNo
				
				pagoFinal = pagoXhora * cantHoras
				
			FinSi
			
			Escribir "Ingrese el monto total de ventas realizado en la semana:"
			Leer ventasTotal
			
			pagoFinal = pagoFinal + (ventasTotal * 0.25)
			
			Escribir "El pago semanal es de $", pagoFinal
			
		SiNo
			
			Si op == 3 Entonces
				
				Escribir "El empleado corresponde al contrato de salario fijo"
				Escribir "Ingrese el monto pagado por hora:"
				Leer pagoXhora
				
				Escribir "Ingrese la cantidad de horas realizadas en la semana:"
				Leer cantHoras
				
				Si cantHoras > 40 Entonces
					
					pagoFinal = (pagoXhora * 40) + (((cantHoras - 40) * pagoXhora) * 1.5)
					Escribir "El pago semanal es de $", pagoFinal
					
				SiNo
					
					pagoFinal = pagoXhora * cantHoras
					Escribir "El pago semanal es de $", pagoFinal
					
				FinSi
				
			SiNo
				
				Escribir "La opcion ingresada no es correcta."
				
			FinSi
			
		FinSi
		
	FinSi
	
FinAlgoritmo


// LUNES A VIERNES

//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//	realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//	empleado.

//	b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//		hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//		esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//		como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//		del valor de venta total.

//		c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//			hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//			horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//			hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un
//				empleado.