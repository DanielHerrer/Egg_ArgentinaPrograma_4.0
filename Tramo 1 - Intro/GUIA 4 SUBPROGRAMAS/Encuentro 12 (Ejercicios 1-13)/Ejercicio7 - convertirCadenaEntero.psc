Algoritmo convertir_a_Numero
	
	Definir numero1 Como Cadena
	
	Hacer
		
		Escribir "Ingrese un numero de hasta 3 cifras: "
		Leer numero1
		
	Mientras Que Longitud(numero1) > 3
	
	Escribir "La CADENA de numeros ", numero1 " se ha convertido en un ENTERO de igual valor: ", Convert_cadena_entero(numero1)
	
FinAlgoritmo

Funcion numEntero <- Convert_cadena_entero (numero1 Por Referencia)
	
	Definir numEntero Como Entero
	
	numEntero = ConvertirANumero(numero1)
	
FinFuncion

//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con de-
//cimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).