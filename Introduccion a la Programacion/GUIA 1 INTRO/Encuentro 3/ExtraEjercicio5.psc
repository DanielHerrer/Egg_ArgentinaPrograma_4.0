Algoritmo rombo
	
	Definir area, perimetro, diagonalMayor, diagonalMenor, lado Como Real
	Escribir "Teniendo en cuenta un rombo simetrico .."
	
	Escribir "Defina el largo de uno de sus lados: "
	Leer lado
	
	Escribir "Defina la diagonal mayor y luego la diagonal menor, en ése orden: "
	Leer diagonalMayor
	Leer diagonalMenor
	
	perimetro = lado * 4
	area = (diagonalMayor * diagonalMenor) / 2
	
	Escribir "El rombo posee un perimetro de ", perimetro " cm y un área de ", area " cm2"
	
FinAlgoritmo