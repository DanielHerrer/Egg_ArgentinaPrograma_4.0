Algoritmo eureka
	
	Definir passIngresado Como Cadena
	Definir intentos Como Entero
	
	intentos = 3
	
	Hacer
		Escribir "Intentos restantes: ", intentos
		Escribir "Ingrese la contrase�a: "
		Leer passIngresado
		intentos = intentos - 1
		
	Mientras Que intentos > 0 Y passIngresado <> "eureka"
	
	
	Si passIngresado == "eureka"
		Escribir "Contrase�a correcta."
	SiNo
		Escribir "Contrase�a incorrecta."
	FinSi
	
	
FinAlgoritmo

//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. S�lo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deber�
//		mostrar un mensaje indic�ndonos que hemos agotado esos 3 intentos. Si acertamos la
//			clave se deber� mostrar un mensaje que indique que se ha ingresado al sistema
//			correctamente.