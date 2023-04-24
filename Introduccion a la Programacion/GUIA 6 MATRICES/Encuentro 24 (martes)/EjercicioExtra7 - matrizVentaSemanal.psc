////	Una empresa de venta de productos por correo desea realizar una estadística de las ventas
////	realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 productos
////	en los 5 días hábiles de la semana. Se desea conocer:

////	a) Total de ventas por cada día de la semana.
////	b) Total de ventas de cada producto a lo largo de la semana.
////	c) El producto más vendido en cada semana.
////	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo sin_titulo
	
	Definir i, j, ventasTotal, ventasXproductoSemana, ventasTproductos, mejorVentaCant, mejorProductoDia, prod1, prod2, prod3, prod4, prod5 Como Entero 
	Definir matriz Como Cadena
	
	Dimension matriz(8,7)
	
	Para i<-0 Hasta 7 Con Paso 1 Hacer
		Para j<-0 Hasta 6 Con Paso 1 Hacer
			/// RELLENA LA PRIMER FILA CON LOS TITULOS
			Si i == 0 Entonces
				Segun j Hacer		
					0:	matriz(i,j) = ""
					1:	matriz(i,j) = "Lunes"
					2:	matriz(i,j) = "Martes"
					3:	matriz(i,j) = "Miercoles"
					4:	matriz(i,j) = "Jueves "
					5:	matriz(i,j) = "Viernes"
					6:	matriz(i,j) = "Total Producto"
				FinSegun
			FinSi
			/// RELLENA LA PRIMER COLUMNA CON LOS TITULOS
			Si i > 0 Y j == 0 Entonces
				Segun i Hacer
					1:	Escribir "Ingrese el nombre del primer producto: "
						Leer matriz(i,j)
					2:	Escribir "Ingrese el nombre del segundo producto: "
						Leer matriz(i,j)
					3:	Escribir "Ingrese el nombre del tercer producto: "
						Leer matriz(i,j)
					4:	Escribir "Ingrese el nombre del cuarto producto: "
						Leer matriz(i,j)
					5:	Escribir "Ingrese el nombre del quinto producto: "
						Leer matriz(i,j)
					6:	matriz(i,j) = "Total Semana"
					7:	matriz(i,j) = "Producto más vendido"	
				FinSegun
			FinSi
		FinPara
	FinPara
	Escribir "/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////"

	prod1 = 0
	prod2 = 0
	prod3 = 0
	prod4 = 0
	prod5 = 0
	Para j<-1 Hasta 5 Con Paso 1 Hacer
		mejorVentaCant = 0
		ventasTotal = 0
		Para i<-1 Hasta 5 Con Paso 1 Hacer
			/// RELLENA CON LAS VENTAS DE LOS PRODUCTOS DIA X DIA
			Escribir "Ingrese la cant. de ventas del producto " matriz(i,0) " del dia " matriz(0,j) " : "
			Leer matriz(i,j)
			/// GUARDA LAS VENTAS TOTALES DEL DIA CONVIRTIENDO -> CADENA A NUMERO
			ventasTotal = ventasTotal + ConvertirANumero(matriz(i,j))
			/// GUARDA EL PRODUCTO MAS VENDIDO DEL DIA
			Si ConvertirANumero(matriz(i,j)) > mejorVentaCant Entonces
				mejorVentaCant = ConvertirANumero(matriz(i,j))
				mejorProductoDia = i
			FinSi
		FinPara
		Escribir "/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////"
		
		/// GUARDA TOTAL DE VENTAS DEL DIA
		matriz(6,j) = ConvertirATexto(ventasTotal)

		/// GUARDA EL NOMBRE DEL PRODUCTO MAS VENDIDO DEL DIA
		matriz(7,j) = matriz(mejorProductoDia,0)
		
		/// GUARDA EL PRODUCTO MAS VENDIDO DE LA SEMANA
		Segun mejorProductoDia Hacer
			1:	prod1 = prod1 + 1
			2:	prod2 = prod2 + 1
			3:	prod3 = prod3 + 1
			4:	prod4 = prod4 + 1
			5:	prod5 = prod5 + 1
		FinSegun
		
	FinPara
	
	ventasTproductos = 0
	Para i<-1 Hasta 7 Con Paso 1 Hacer
		ventasXproductoSemana = 0
		/// GUARDA LA CANTIDAD DE VENTAS REALIZADAS EN LA SEMANA DE UN MISMO PRODUCTO
		Si i <= 5 Entonces
			Para j<-1 Hasta 5 Con Paso 1 Hacer
				ventasXproductoSemana = ventasXproductoSemana + ConvertirANumero(matriz(i,j))
			FinPara
		FinSi
		matriz(i,6) = ConvertirATexto(ventasXproductoSemana)
		
		///GUARDA LA CANTIDAD DE VENTAS REALIZADAS EN LA SEMANA DE TODOS LOS PRODUCTOS
		Si i == 6 Entonces
			Para j<-1 Hasta 5 Con Paso 1 Hacer
				ventasTproductos = ventasTproductos + ConvertirANumero(matriz(6,j))
			FinPara
		FinSi
		matriz(6,6) = ConvertirATexto(ventasTproductos)
		
		Si i == 7 Entonces
			/// GUARDA EL PRODUCTO MAS VENDIDO EN LA SEMANA
			Si prod1 > prod2 Y prod1 > prod3 Y prod1 > prod4 Y prod1 > prod5 Entonces
				matriz(7,6) = matriz(1,0)
			SiNo
				Si prod2 > prod1 Y prod2 > prod3 Y prod2 > prod4 Y prod2 > prod5 Entonces
					matriz(7,6) = matriz(2,0)
				SiNo
					Si prod3 > prod2 Y prod3 > prod1 Y prod3 > prod4 Y prod3 > prod5 Entonces
						matriz(7,6) = matriz(3,0)
					SiNo
						Si prod4 > prod1 Y prod4 > prod2 Y prod4 > prod3 Y prod4 > prod5 Entonces
							matriz(7,6) = matriz(4,0)
						SiNo
							Si prod5 > prod1 Y prod5 > prod2 Y prod5 > prod3 Y prod5 > prod4 Entonces
								matriz(7,6) = matriz(5,0)
							SiNo
								matriz(7,6) = "VARIOS"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	mostrarMatriz(matriz,8,7)
	
FinAlgoritmo

SubProceso mostrarMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j Como Entero
	Definir text, text2 Como Cadena
	text = "                      "		/// 22 espacios
	text2= "                "			/// 16 espacios
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Si j==0 Entonces
				text = matriz(i,j) + Subcadena(text,0,21-(Longitud(matriz(i,j))))
				Escribir Sin Saltar "[" text "]"
			SiNo
				text2 = matriz(i,j) + Subcadena(text2,0,15-(Longitud(matriz(i,j))))
				Escribir Sin Saltar "[" text2 "]"
			FinSi
			text = "                      "
			text2= "                "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
