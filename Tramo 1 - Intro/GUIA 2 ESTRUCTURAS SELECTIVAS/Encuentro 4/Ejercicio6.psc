Algoritmo auditoriaInterna
	
	Definir usuario Como Caracter
	Definir correosSinLeer, solicitudesEjecutivos, solicitudDeEmergencia Como Entero
	Definir computadorEncendida, plantaRegada, userAdmin Como Logico
	
	Escribir "Ingrese el usuario: "
	Leer usuario
	
	correosSinLeer = azar(25)
	solicitudesEjecutivos = azar(6)
	solicitudDeEmergencia = azar(4)
	
	Si usuario == "administrador" Entonces
		Escribir "Se ha ingresado como administrador."
		
		Escribir "Usted posee ", correosSinLeer " correos sin leer."
		Escribir "Usted posee ", solicitudDeEmergencia " solicitudes de emergencia de otros departamentos."
		Escribir "Usted posee ", solicitudesEjecutivos " correos de voz de ejecutivos."
	
		Escribir "Se reviso los ingresos de marketing."
		
		Escribir "Se completó las hojas de cálculo correctamente."
	
		Si correosSinLeer < 10 Entonces
			
			Si solicitudDeEmergencia >= 1 Entonces
				Escribir "Se han resuelto las solicitudes de emergencia de otro departamento."
				
				Si solicitudesEjecutivos >= 1 Entonces
					Escribir "Se revisó los correos de voz por solicitudes de ejecutivos"
				SiNo
					Escribir "No hubo solicitud de ejecutivos"
				FinSi
				
			SiNo
				
				Escribir "No hubo solicitud de emergencia de otros departamentos."
				
				Si solicitudesEjecutivos >= 1 Entonces
					Escribir "Se revisó los correos de voz por solicitudes de ejecutivos"
				SiNo
					Escribir "No hubo solicitud de ejecutivos"
				FinSi
				
			FinSi
			
			Escribir "Se han revisado los correos sin leer"
			
		SiNo 
			
			Escribir "Se han revisado los correos sin leer."
			
			Si solicitudDeEmergencia >= 1 Entonces
				Escribir "Se han resuelto las solicitudes de emergencia de otro departamento."
				
				Si solicitudesEjecutivos >= 1 Entonces
					Escribir "Se revisó los correos de voz por solicitudes de ejecutivos"
				SiNo
					Escribir "No hubo solicitud de ejecutivos"
				FinSi
				
			SiNo
				
				Escribir "No hubo solicitud de emergencia de otros departamentos."
				
				Si solicitudesEjecutivos >= 1 Entonces
					Escribir "Se revisó los correos de voz por solicitudes de ejecutivos"
				SiNo
					Escribir "No hubo solicitud de ejecutivos"
				FinSi
				
			FinSi
			
		FinSi
		
		Escribir "Se ha apagado la computadora."
		
		Escribir "Se ha regado la planta."
		
		Escribir "Dame el sanguche"
		
	SiNo
		
		Escribir "Usted no es admin."
		
	FinSi
	
FinAlgoritmo