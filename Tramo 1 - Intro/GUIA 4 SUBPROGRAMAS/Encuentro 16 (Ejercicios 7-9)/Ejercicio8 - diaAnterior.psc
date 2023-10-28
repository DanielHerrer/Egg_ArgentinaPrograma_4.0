Algoritmo unDiaAntes
	
	Definir dd, mm, aa Como Entero
	
	Escribir "Ingrese una fecha completa, dia, mes y año. En ese orden: "
	Leer dd, mm, aa
	///Se asume que el usuario ingresará una fecha válida.
	
	diaAnterior(dd,mm,aa)
	
FinAlgoritmo

SubProceso diaAnterior(dd, mm, aa) 
	
	Definir i, ddF, mmF, aaF Como Entero
	
	Si dd == 1 Entonces
		/// Correspondiente dia para cada mes, EJEMPLO: FEBRERO tiene 28 dias, no 31
		Segun mm Hacer
			1: 
				ddF = 31
				mmF = 12
				aaF = aa - 1
			2:
				ddF = 31
				mmF =  mm - 1
				aaF = aa
			3: 
				ddF = 28
				mmF =  mm - 1
				aaF = aa
			4:	
				ddF = 31
				mmF =  mm - 1
				aaF = aa
			5:	
				ddF = 30
				mmF =  mm - 1
				aaF = aa
			6:
				ddF = 31
				mmF =  mm - 1
				aaF = aa
			7:
				ddF = 30
				mmF =  mm - 1
				aaF = aa
			8:
				ddF = 31
				mmF =  mm - 1
				aaF = aa
			9:
				ddF = 31
				mmF =  mm - 1
				aaF = aa
			10:
				ddF = 30
				mmF =  mm - 1
				aaF = aa
			11:
				ddF = 31
				mmF =  mm - 1
				aaF = aa
			12:
				ddF = 30
				mmF =  mm - 1
				aaF = aa
		FinSegun
	SiNo
		ddF = dd - 1
		mmF = mm
		aaF = aa
	FinSi
	
	Escribir "El dia anterior de " dd "/" mm "/" aa " es " ddF "/" mmF "/" aaF 
	
FinSubProceso

//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//	
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha repre-
//		sentada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que
//		dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para los valores
//			dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.