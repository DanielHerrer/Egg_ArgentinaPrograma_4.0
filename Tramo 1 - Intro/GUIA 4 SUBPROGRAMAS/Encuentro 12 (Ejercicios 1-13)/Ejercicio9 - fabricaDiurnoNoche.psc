Algoritmo fabrica
	Definir nombre, diaSemana, turno, esFeriado Como Cadena
	Definir hsTrabajadas, tarifaDiurno, tarifaNocturno Como Real
	
	Escribir "Ingrese el nombre del empleado: "
	Leer nombre
	
	Hacer
		
		Escribir "Ingrese el dia LABORAL de la semana: "
		Leer diaSemana
		diaSemana = Mayusculas(diaSemana)
		
	Mientras Que diaSemana <> "LUNES" Y diaSemana <> "MARTES" Y diaSemana <> "MIERCOLES" Y diaSemana <> "JUEVES" Y diaSemana <> "VIERNES"
	
	Hacer
		
		Escribir "Ingrese que turno realiza (Diurno, Nocturno) : "
		Leer turno
		turno = Mayusculas(turno)
		
	Mientras Que turno <> "DIURNO" Y turno <> "NOCTURNO"
	
	
	Escribir "Ingrese las hs. trabajadas: "
	Leer hsTrabajadas
	
	Hacer
		
		Escribir "El dia ", diaSemana " fue Feriado? (Si/No) : "
		Leer esFeriado
		esFeriado = Mayusculas(esFeriado)
		
	Mientras Que esFeriado <> "SI" Y esFeriado <> "NO"
	
	Escribir "El empleado ", nombre " por trabajar un dia ", diaSemana " (FERIADO:", esFeriado ") en turno ", turno 
	Escribir " una cantidad total de ", hsTrabajadas " horas le corresponde un jornal de $", diaLaboral(turno,hsTrabajadas,esFeriado) 
	
FinAlgoritmo

Funcion jornal <- diaLaboral(turno Por Referencia, hsTrabajadas Por Referencia, esFeriado Por Referencia)
	
	Definir jornal Como Real
	
	Si turno == "DIURNO" Entonces
		
		Si esFeriado == "SI" Entonces
			
			jornal = (90 * hsTrabajadas) * 1.1
			
		SiNo
			
			jornal = 90 * hsTrabajadas
			
		FinSi
		
	SiNo
		
		Si esFeriado == "SI" Entonces
			
			jornal = (125 * hsTrabajadas) * 1.15
			
		SiNo
			
			jornal = 125 * hsTrabajadas
			
		FinSi
		
	FinSi
	
FinFuncion

//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:

//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//		El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debe-
//			mos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o
//				no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.