Algoritmo userPass
	
	Definir user, pass Como Entero
	
	Hacer
		
		Escribir "Ingrese su numero de usuario: "
		Leer user
		
		Escribir "Ingrese su contraseña: "
		Leer pass
		
		Si user <> 1024 Y pass <> 4567
			
			Escribir "El usuario y la contraseña son incorrectos."
			
		SiNo
			
			Si user <> 1024 
				
				Escribir "Ese numero de usuario no esta registrado."
				
			FinSi
			
			Si pass <> 4567
				
				Escribir "La contraseña es incorrecta."
				
			FinSi
			
		FinSi
		
	Mientras Que user <> 1024 O pass <> 4567
	
	Escribir "Usted ha iniciado sesion correctamente."
	
FinAlgoritmo

//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no le
//debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567.
//El programa finaliza cuando ingresa los datos correctos.
