Algoritmo teLlevoATodosLados
	
	Definir precioFinal, litrosNafta, hh, mm Como Real
	
	Escribir "Cuantos minutos estuvo arriba del auto?: "
	Leer mm
	
	hh = trunc(mm / 60)
	mm = trunc(mm % 60)
	
	Si (hh <= 1 Y mm <= 59) O (hh == 2 Y mm == 0)
		
		precioFinal = 200
		Escribir "El precio final es de: ", precioFinal
		
	SiNo
		
		Escribir "Cuantos litros de nafta ha usado?: "
		Leer litrosNafta
		
		precioFinal = litrosNafta * 40

		precioFinal = precioFinal + (((hh * 60) + mm) * 5.20)
		
		Escribir "El precio final es de: ", precioFinal
		
	FinSi
	
FinAlgoritmo