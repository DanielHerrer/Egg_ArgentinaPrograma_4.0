Algoritmo loguearse
	
	Definir user, pass Como Cadena
	Definir logueado Como Logico
	logueado = Login(user, pass)
	Escribir "Su inicio de sesion fue: ", logueado
	
FinAlgoritmo

Funcion on <- Login (user Por Referencia, pass Por Referencia)
	Definir on Como Logico
	Definir intentos Como Entero
	intentos = 3
	on = Falso
	
	Hacer
		
		Si intentos > 0 Entonces
			
			Escribir "Usted posee ", intentos " intentos.."
			Escribir "Ingrese su nombre de usuario: "
			Leer user
			Escribir "Ingrese su contrase�a: "
			Leer pass
			
			Si user == "usuario1" Y pass == "asdasd"
				
				on = Verdadero
				
			FinSi
			
		FinSi
		
		intentos = intentos - 1
		
	Mientras Que on <> Verdadero Y intentos > 0

FinFuncion

//Crear una funci�n llamada "Login", que recibe un nombre de usuario y una contrase�a y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contrase�a es "asdasd". 

//		Adem�s, la funci�n calculara el n�mero de intentos que se ha usado para loguearse, tenemos solo
//			3 intentos, si nos quedamos sin intentos la funci�n devolver� Falso.