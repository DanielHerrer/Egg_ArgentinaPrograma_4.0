Algoritmo programaFinal
	
	Definir i, op, intentos, saldo, numBotellas, pesoBotella, pesoTotal, valorBotella, valorTotal Como Real
	Definir  user, pass, confirmacion Como Cadena
	Definir login Como Logico
	saldo = 0
	intentos = 3
	pesoTotal = 0
	valorTotal = 0
	
	Escribir "Por favor, ingrese a su cuenta."
	Escribir "Ingrese su usuario: "
	Leer user
	
	/// Compara el user
	Si user == "Albus_D"
		
		Hacer	
			
			Escribir "Ingrese su contraseña, usted tiene ", intentos " intentos: "
			Leer pass
			
			/// Compara el pass
			Si pass == "caramelosDeLimon"
				
				login = verdadero
				Escribir "Usted ha ingresado a su cuenta."
				
			SiNo
				
				Escribir "Contraseña incorrecta."
				login = falso
				intentos = intentos - 1
				
			FinSi
			
		Mientras Que intentos <> 0 Y login == falso
		
	SiNo
		
		Escribir "Usuario incorrecto."
		login = falso
		
	FinSi
	
	/// Si el login se cumple ..
	Si login == verdadero Entonces
		
		/// Se repite el menu HASTA que se elija la opcion 3
		Hacer
			
			Escribir "Bienvenido"
			Escribir "1. Ingresar botellas"
			Escribir "2. Calcular saldo"
			Escribir "3. Salir"
			
			Escribir "Ingrese su operacion:"
			Leer op
			
			/// Compara la opcion elegida
			Segun op Hacer
				
				1:	
					
					Escribir "Digite cuantas botellas va a ingresar: "
					Leer numBotellas
					
					/// Compara CADA botella
					Para i <- 1 Hasta numBotellas Con Paso 1 Hacer
						
						/// Asigna el peso en gr de la botella aleatoriamente
						pesoBotella = Aleatorio(100,3000)	
						
						/// Dependiendo del peso le asigna un valor
						Si pesoBotella <= 500
							
							valorBotella = 50
							
						FinSi
						Si pesoBotella <= 1500 Y pesoBotella > 500
							
							valorBotella = 125
							
						FinSi
						Si pesoBotella > 1500
							
							valorBotella = 200
							
						FinSi
						
						pesoTotal = pesoTotal + pesoBotella			///Acumula el peso de las botellas
						valorTotal = valorTotal + valorBotella 		///Acumula el valor de las botellas
						
					FinPara
					
					Escribir "Usted tiene un peso total de botellas de: ", pesoTotal " gr. "
					Escribir "Su valor es de: $", valorTotal
					
					/// Confirma si se desea realizar la venta y acumular el total al saldo
					Hacer
						
						Escribir "Desea la platica? (S/N): "
						Leer confirmacion
						confirmacion = Mayusculas(confirmacion)
						
						Si confirmacion == "N"
							
							Escribir "Devolviendo materiales..."
							pesoTotal = 0	/// El peso total se limpia
							
						SiNo
							
							Si confirmacion == "S"
								
								saldo = saldo + valorTotal /// Acumula el valorTotal de botellas al saldo
								pesoTotal = 0 
								
							SiNo
								
								Escribir "Ingrese una opcion correcta."
								
							FinSi
							
						FinSi
						
						// Se ha puesto un No() ya que sino NO toma la confirmacion correctamente
					Mientras Que No(confirmacion == "S" O confirmacion == "N")   
					
				2:
					
					Escribir "Su saldo es de $", saldo
					
				3:
					
					Escribir "Usted ha elegido salir."
					
				De Otro Modo:
					
					Escribir "Ingrese una opcion correcta."
					
			FinSegun
			
		Mientras Que op <> 3
		
		Si op == 3 Entonces
			Escribir "Saliendo.. nos vimo en disney"
		FinSi
		
	FinSi
	
FinAlgoritmo

//	Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
//	máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
//	nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.

//	- Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//		erdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
//		correcta haremos que una variable llamada Login sea verdadera.
//	- Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un
//		bucle Mientras para darle al usuario sólo 3 intentos para poner la contraseña.
//  - Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al
//		menú de opciones:

//										o Ingresar botellas
//										o Consultar saldo
//										o Salir
//										


//		o Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema.
//			Una vez que tenemos el número vamos a usar un bucle para, a fin de ir ingresando
//			cada botella. En cada ciclo del bucle se debe generar un número aleatorio entre 100 y
//			3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario está
//			ingresando botellas en la máquina). Una vez generado, según el peso del material,
//			usaremos un condicional múltiple para asignarle un valor monetario:

//										o Si es menos de 500 gr, corresponden $50
//										o Si es entre 501 gr y 1500 gr, corresponden $125
//										o Si es más de 1501 gr, corresponden $200

//			Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
//			ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
//			material (sólo mostrar en pantalla "Devolviendo material"). Para esto usaremos un
//			condicional doble.

//		o Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".

//	*** Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.