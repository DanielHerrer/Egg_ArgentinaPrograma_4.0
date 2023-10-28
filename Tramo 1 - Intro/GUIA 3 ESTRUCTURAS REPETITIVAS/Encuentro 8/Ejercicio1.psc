Algoritmo eureka
	
	Definir passIngresado Como Cadena
	Definir intentos Como Entero
	
	intentos = 3
	
	Hacer
		Escribir "Intentos restantes: ", intentos
		Escribir "Ingrese la contraseña: "
		Leer passIngresado
		intentos = intentos - 1
		
	Mientras Que intentos > 0 Y passIngresado <> "eureka"
	
	
	Si passIngresado == "eureka"
		Escribir "Contraseña correcta."
	SiNo
		Escribir "Contraseña incorrecta."
	FinSi
	
	
FinAlgoritmo

//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//		mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//			clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
//			correctamente.