Algoritmo manzanas
	Definir numKilos, precioTotal, kiloValor Como Real
	
	Escribir "Cuantos kilos de manzanas lleva?: "
	Leer numKilos
	
	kiloValor = 800 //Valor actual 19/1/2023
	
	
	Si numKilos == 0 Entonces
		Escribir "Usted no esta llevando ninguna manzana."
	FinSi
	
	Si numKilos > 0 Y numKilos < 2 Entonces
		
		precioTotal = numKilos * kiloValor
		Escribir "El precio a pagar por llevar ",numKilos " kilos de manzanas es de $", precioTotal
		
	SiNo
		
		Si numKilos > 2 Y numKilos <= 5 Entonces
			
			precioTotal = (numKilos * kiloValor) * 0.9
			Escribir "El precio a pagar por llevar ",numKilos " kilos de manzanas es de $", precioTotal " con un 10% de desc. ya aplicado."
			
		SiNo
			
			Si numKilos > 5 Y numKilos <= 10 Entonces
				
				precioTotal = (numKilos * kiloValor) * 0.85
				Escribir "El precio a pagar por llevar ",numKilos " kilos de manzanas es de $", precioTotal " con un 15% de desc. ya aplicado."
				
			SiNo
				
				Si numKilos > 10 Entonces
					
					precioTotal = (numKilos * kiloValor) * 0.80
					Escribir "El precio a pagar por llevar ",numKilos " kilos de manzanas es de $", precioTotal " con un 20% de desc. ya aplicado."
					
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo

