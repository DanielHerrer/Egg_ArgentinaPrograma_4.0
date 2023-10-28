Algoritmo ejercicio8
	definir matrizA como real
	definir i,j como entero
	dimension matrizA[4,5]
	
	Para i = 0 Hasta 3 	
		Para j = 0 Hasta 4 
			matrizA[i,j] = 0
		Fin Para
	Fin Para
	
	muestraMenu(matrizA)	
	
FinAlgoritmo

SubProceso cargarVentas(matrizA)
	definir i, j Como Entero
	definir ingreso como real
	
	Para i = 0 Hasta 3 	
		Para j = 0 Hasta 4 
			matrizA[i,j] = 0
		Fin Para
	Fin Para
	
	Para i = 0 Hasta 3 
		escribir "VENDEDOR: ", i
		Para j = 0 Hasta 4 
			escribir "INGRESE VENTAS ZONA: ",j
			leer ingreso
			matrizA[i,j] = matrizA[i,j] + ingreso
		Fin Para
	Fin Para
FinSubProceso

SubProceso muestraMatriz(matrizA)
	definir i, j Como Entero
	
	Para i = 0 Hasta 3 
		Para j = 0 Hasta 4 	
			escribir sin saltar "[",matrizA[i,j],"]" 
		Fin Para
		escribir ""
	Fin Para
	escribir ""
FinSubProceso

SubProceso muestraMenu(matrizA)
	definir i, j, seleccion, zona, vendedor Como Entero
	definir ventasZona, ventasVendedor, totalVentas como real
	definir bandera Como Logico
	dimension ventasVendedor[5]
	dimension totalVentas[5]
	bandera = verdadero
	
	repetir
		escribir "----------------------------------------------------------"
		escribir "1. Total de ventas de una zona"
		escribir "2. Total de ventas de un vendedor en cada una de las zonas"
		escribir "3. Total de ventas de todos los representantes"
		escribir "4. Cargar ventas"
		escribir "5. Salir"
		escribir "----------------------------------------------------------"
		leer seleccion
		
		Segun seleccion 
			1:
				escribir "Ingrese la zona que sea ver el total"
				escribir "0 - NORTE"
				escribir "1 - SUR"
				escribir "2 - ESTE"
				escribir "3 - OESTE"
				escribir "4 - CENTRO"
				leer zona
				ventasZona = 0
				
				Para i = 0 Hasta 3 
					Para j = 0 hasta 4
						si j = zona
							ventasZona = ventasZona + matrizA[i,j]
						FinSi
					Fin Para
				Fin Para
				
				escribir "LA VENTAS TOTALES DE LA ZONA ", zona, " ES: ", ventasZona
				
				bandera = verdadero
			2:
				escribir "Ingrese el vendedor para ver sus totales"
				escribir "0 - VENDEDOR 1"
				escribir "1 - VENDEDOR 2"
				escribir "2 - VENDEDOR 3"
				escribir "3 - VENDEDOR 4"				
				leer vendedor
				
				Para j = 0 hasta 4						
					ventasVendedor[j] = 0					
				Fin Para				
				
				Para i = 0 Hasta 3 
					si i = vendedor
						Para j = 0 hasta 4
							ventasVendedor[j] = ventasVendedor[j] + matrizA[i,j]
						Fin Para
					FinSi
					escribir "LA VENTAS TOTALES DEL VENDEDOR ", vendedor, " EN ZONA: ", i, " ES: ", ventasVendedor[i]
				Fin Para
				bandera = verdadero
			3:
				Para j = 0 hasta 4						
					totalVentas[j] = 0					
				Fin Para
				
				Para i = 0 Hasta 3 
					Para j = 0 hasta 4						
						totalVentas[j] = totalVentas[j] + matrizA[i,j]						
					Fin Para					
				Fin Para
				
				Para i = 0 Hasta 3 
					escribir "LA VENTAS TOTALES DE LOS VENDEDORES EN ZONA: ", i, " ES: ", totalVentas[i]														
				Fin Para
				
				bandera = verdadero
			4:
				cargarVentas(matrizA)
				bandera = verdadero
			5:
				bandera = falso
		Fin Segun
		
	mientras que bandera = verdadero
	
FinSubProceso
	