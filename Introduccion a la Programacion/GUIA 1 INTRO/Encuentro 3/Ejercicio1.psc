Algoritmo porcentajeColegio
	
	Definir cantNinios Como Entero
	Definir cantNinias Como Entero
	
	Escribir "Por favor ingrese la cantidad de ni�os que estan inscriptos al Colegio: "
	Leer cantNinios
	Escribir "Por favor ingrese la cantidad de ni�as que estan inscriptas al Colegio: "
	Leer cantNinias
	
	Definir porcentNinios Como Real
	Definir porcentNinias Como Real
	Definir totalAlumnos Como Entero
	totalAlumnos = cantNinios + cantNinias
	porcentNinios = (100 / totalAlumnos) * cantNinios
	porcentNinias = (100 / totalAlumnos) * cantNinias
	
	Escribir "El Colegio dispone de un ", trunc(porcentNinios) "% de ni�os y un ", trunc(porcentNinias) "% de ni�as inscriptxs."
	
FinAlgoritmo
