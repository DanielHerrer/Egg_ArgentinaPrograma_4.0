Algoritmo MinMax
	
	Definir i, bandera, numIngresado, numMax, numMin, promedio Como Real
	promedio = 0
	i = 0
	
	Hacer
		
		Escribir "Ingrese un numero entero: "
		Leer numIngresado
		
		//Compara SI ES EL PRIMER NUMERO INGRESADO
		Si i == 0 Entonces
			
			numMax = numIngresado
			numMin = numIngresado
			
		FinSi
		
		//Compara los numeros
		Si numIngresado <> 0 Entonces
			
			Si numIngresado > numMax
				numMax = numIngresado
			FinSi
			Si numIngresado < numMin
				numMin = numIngresado
			FinSi
			
			promedio = promedio + numIngresado
			i = i + 1
			
		SiNo
			
			Si promedio > 0 Entonces
				
				Escribir "El programa ha finalizado."
				Escribir "El numero maximo ingresado fue: ", numMax
				Escribir "El numero minimo ingresado fue: ", numMin
				Escribir "El promedio de los ", i " numeros ingresados es: ", trunc(promedio / i)
				
			SiNo
				
				Escribir "Usted no ha ingresado una cantidad de numeros correcta."
				
			FinSi
			
		FinSi
		
	Mientras Que numIngresado <> 0 	
	
	
FinAlgoritmo

//ENTEROS negativos y positivos NATURALES positivos unicamente NATURALES EXTENDIDO positivos incluyendo 0

//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.
//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
//	numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable.
//	Si es mayor reemplazaremos el valor de numeroMaximo. Por ejemplo, si 5 > 0 entonces el
//		m�ximo entre estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2 > 5 lo que
//			resultar� falso y por lo tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica
//			similar tendr� el m�nimo.