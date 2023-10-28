Algoritmo promedio3Notas
	
	Definir nota1, nota2, nota3, promedio Como Real
	Definir bandera1, bandera2, bandera3 Como Logico
	
	Escribir "Ingrese las 3 notas del año en orden: "
	Leer nota1, nota2, nota3
	
	Si nota1 > 0  Y nota1 <= 10
		bandera1 = Verdadero
	SiNo
		bandera1 = Falso
	FinSi
	
	Si nota2 > 0 Y nota2 <= 10
		bandera2 = Verdadero
	SiNo
		bandera2 = Falso
	FinSi
	
	Si nota3 > 0 Y nota3 <= 10
		bandera3 = Verdadero
	SiNo
		bandera3 = Falso
	FinSi
	
	Si bandera1 == Verdadero Y bandera2 == Verdadero Y bandera3 == Verdadero
		promedio = (nota1 + nota2 + nota3) / 3
		Escribir "Su promedio de notas es ", promedio
	SiNo
		Escribir "Una, o varias de sus notas son incorrectas, vuelvalas a ingresar..."
	FinSi
	
	Escribir "Adios"
	
FinAlgoritmo
