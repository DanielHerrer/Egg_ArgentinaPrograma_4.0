Algoritmo aumentoPrecio
	
	Definir precioInicial Como Real
	Definir precioFinal Como Real
	
	Escribir "Por favor ingrese el precio inicial, luego ingrese el precio final."
	Leer precioInicial
	Leer precioFinal
	
	Definir porcentajeCambio Como Real
	
	porcentajeCambio = ((precioFinal * 100) / precioInicial) - 100
	
	Escribir "El porcentaje de cambio fue de ",porcentajeCambio "%"
	
FinAlgoritmo