Algoritmo Cooperar
	
	Definir palabra1, palabra2 Como Caracter
	
	Escribir "Ingrese:  Cooperando "
	Leer palabra1
	Escribir "Ingrese:  trabajamos mejor"
	Leer palabra2
	
	Escribir Concatenado(palabra1,palabra2)
	
FinAlgoritmo


Funcion texto_concatenado <- Concatenado ( palabra1 Por Referencia , palabra2 Por Referencia )
	
	Definir texto_concatenado Como Caracter
	
	texto_concatenado = Concatenar(palabra1, " ")
	texto_concatenado = Concatenar(texto_concatenado, palabra2)
	
FinFuncion

//Realiza una funci�n llamada Cooperar que reciba dos variables de tipo car�cter, una variable debe
//contener el mensaje "Cooperando" y la otra "trabajamos mejor". La funci�n debe concatenar am-
//bos textos.
