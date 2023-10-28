Algoritmo llantasNuevas
	
	Definir numLlantas, precioTotal, precioDesc, precioUni Como Real
	
	Escribir "Cuantas llantas lleva?: "
	Leer numLlantas
	Si numLlantas == 0 Entonces
		
		Escribir "Usted no esta llevando ninguna llanta"
		
	SiNo
	
		Si numLlantas < 5 Entonces
			precioTotal = numLlantas * 3000
		SiNo
			Si numLlantas >= 5 Y numLlantas <= 10 Entonces
				precioTotal = numLlantas * 2500
			SiNo
				Si numLlantas > 10 Entonces
					precioTotal = numLlantas * 2000
				FinSi
			FinSi
		FinSi
		
		Escribir "Usted va a pagar $", precioTotal " y está pagando $", precioTotal / numLlantas " por cada llanta."
	FinSi
	
	
	
	
FinAlgoritmo

//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//		entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//			Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//			llantas que compra, y el monto total que tiene que pagar por el total de la compra.