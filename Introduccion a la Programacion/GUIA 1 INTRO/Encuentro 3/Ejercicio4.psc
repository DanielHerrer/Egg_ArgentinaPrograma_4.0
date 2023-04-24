Algoritmo tiempo
	Definir tiempoDias Como Entero
	Escribir "Por favor, ingrese la cantidad de dias"
	Leer tiempoDias
	
	Definir tiempoHoras Como Entero
	Definir tiempoMinutos Como Entero
	Definir tiempoSegundos Como Entero 
	
	tiempoHoras = tiempoDias * 24 
	tiempoMinutos = tiempoHoras * 60
	tiempoSegundos = tiempoMinutos * 60
	
	/// 365 dias - 100% el total
	/// 30 - El porcentaje que necesito
	/// 30 * 100 / 365
	
	Escribir "La cantidad de horas es ", tiempoHoras ", la cantidad de minutos es de ", tiempoMinutos " y la cantidad de segundos es de ",tiempoSegundos "."
	
	
FinAlgoritmo