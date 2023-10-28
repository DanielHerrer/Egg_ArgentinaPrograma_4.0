Algoritmo compraDesc
	
	Definir precioReal, desc, precioDesc Como Real
	
	Escribir "Cual es el valor total de la compra?: "
	Leer precioReal
	
	precioDesc = precioReal - (precioReal * 0.15)
	Escribir "El precio total con descuento del 15% es de ",precioDesc
	
FinAlgoritmo
