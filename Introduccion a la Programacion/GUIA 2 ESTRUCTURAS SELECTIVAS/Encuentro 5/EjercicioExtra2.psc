Algoritmo descuento10
	
	Definir precioTotal, precioFinal, numMes Como Real
	
	Escribir "Ingrese el monto total de la compra: "
	Leer precioTotal
	
	Escribir "Ingrese el numero del mes actual: "
	Leer numMes
	
	
	Si numMes > 0 Y numMes <= 12
		
		Si numMes >= 9 Y numMes <= 11
			precioFinal = precioTotal * 0.9
			Escribir "Usted esta dentro de los meses del 10% de desc. El precio final es de $", precioFinal
		SiNo
			Escribir "El precio final es de $", precioTotal
		FinSi
		
	SiNo
		
		Escribir "Usted ha ingresado un mes incorrecto."
		
	FinSi
	
FinAlgoritmo
