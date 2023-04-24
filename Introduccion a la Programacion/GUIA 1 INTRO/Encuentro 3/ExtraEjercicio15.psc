Algoritmo tiempoViaje
	
	Definir t, ss, mm, hh, ssFinal, mmFinal, hhFinal Como Entero	
	
	Escribir "Qué hora es? A continuación defina el tiempo actual. HH : MM : SS"
	Leer hh, mm, ss
	
	Escribir "Usted salió de Mar del Plata a las ", hh ":", mm ":", ss
	
	Escribir "Cuantos segundos te lleva llegar a tu ciudad destino?"
	Leer t
	
	ss = ss + t
	
	Si ss > 60 Entonces
		ssFinal = ss % 60
		mm = mm + trunc(ss / 60)
	FinSi
	
	Si mm > 60 Entonces
		mmFinal = mm % 60
		hh = hh + trunc(mm / 60)
	FinSi
	
	Si hh == 24 Entonces
		hhFinal = 00
	FinSi
	Si hh < 24 Entonces
		hhFinal = hh
	SiNo
		hhFinal = hh % 24
	FinSi

	Escribir "Usted ha llegado a la ciudad destino a las ", hhFinal ":", mmFinal ":", ssFinal
	
FinAlgoritmo