Algoritmo userPass
	
	Definir user, pass Como Entero
	
	Hacer
		
		Escribir "Ingrese su numero de usuario: "
		Leer user
		
		Escribir "Ingrese su contrase�a: "
		Leer pass
		
		Si user <> 1024 Y pass <> 4567
			
			Escribir "El usuario y la contrase�a son incorrectos."
			
		SiNo
			
			Si user <> 1024 
				
				Escribir "Ese numero de usuario no esta registrado."
				
			FinSi
			
			Si pass <> 4567
				
				Escribir "La contrase�a es incorrecta."
				
			FinSi
			
		FinSi
		
	Mientras Que user <> 1024 O pass <> 4567
	
	Escribir "Usted ha iniciado sesion correctamente."
	
FinAlgoritmo

//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no le
//debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a 4567.
//El programa finaliza cuando ingresa los datos correctos.
