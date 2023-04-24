////Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina ofreciendo
////sus productos. Para tareas administrativas el país está dividido en cinco zonas: 

////		Norte, Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas estadísticas
////		sobre el comportamiento de sus representantes en cada zona. Se desea hacer un programa
////		que lea el monto de las ventas de los representantes en cada zona y calcule luego:

////		a) el total de ventas de una zona introducida por teclado
////		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
////		c) el total de ventas de todos los representantes.

Algoritmo matrizNescafe
	
	Definir matriz Como Cadena
	Definir i, j, ventasTotal, ventasTotalxRep, ventasTotalxZona Como Entero
	
	Dimension matriz(7,6)
	
	Para i<-0 Hasta 6 Con Paso 1 Hacer
		Para j<-0 Hasta 5 Con Paso 1 Hacer
			
			Si i == 0 Entonces
				Segun j Hacer		
					0:	matriz(i,j) = "Nescafé"
					1:	matriz(i,j) = "Representante A"
					2:	matriz(i,j) = "Representante B"
					3:	matriz(i,j) = "Representante C"
					4:	matriz(i,j) = "Representante D"
					5:	matriz(i,j) = "Total Ventas x Zona"
				FinSegun
			FinSi
			
			Si i > 0 Y j == 0 Entonces
				Segun i Hacer
					1:	matriz(i,j) = "Norte"
					2:	matriz(i,j) = "Sur"
					3:	matriz(i,j) = "Este"
					4:	matriz(i,j) = "Oeste"
					5:	matriz(i,j) = "Centro"
					6:	matriz(i,j) = "Ventas x Vendedor"
				FinSegun
			FinSi
		FinPara
	FinPara
	
	ventasTotal = 0
	ventasTotalxZona = 0
	Para j<-1 Hasta 4 Con Paso 1 Hacer
		
		ventasTotalxRep = 0
		Para i<-1 Hasta 5 Con Paso 1 Hacer
			Escribir "Ingrese la cant. de ventas de la zona " matriz(i,0) " realizadas por el " matriz(0,j) " : "
			Leer matriz(i,j)
			ventasTotalxRep = ventasTotalxRep + ConvertirANumero(matriz(i,j))
		FinPara
		
		/// GUARDA TOTAL DE VENTAS DE UN REPRESENTANTE Y POR CADA j GUARDA LAS VENTAS TOTALES
		matriz(6,j) = ConvertirATexto(ventasTotalxRep)
		ventasTotal = ventasTotal + ventasTotalxRep
		
		Escribir "/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////"
	FinPara
	
	/// GUARDA EL TOTAL DE LAS VENTAS TOTALES
	matriz(6,5) = ConvertirATexto(ventasTotal)
	
	/// RECORRE LAS VENTAS POR ZONA Y GUARDA LAS VENTAS X ZONA
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		ventasTotalxZona = 0
		Para j<-1 Hasta 4 Con Paso 1 Hacer
			ventasTotalxZona = ventasTotalxZona + ConvertirANumero(matriz(i,j))
		FinPara
		matriz(i,5) = ConvertirATexto(ventasTotalxZona)
	FinPara
	
	mostrarMatriz(matriz,7,6)
	
FinAlgoritmo

SubProceso mostrarMatriz(matriz Por Referencia, filas Por Valor, columnas Por Valor)
	Definir i, j Como Entero
	Definir text, text2 Como Cadena
	text = "                      "		/// 22 espacios
	text2= "                    "			/// 20 espacios
	Para i<-0 Hasta filas-1 Con Paso 1 Hacer
		Para j<-0 Hasta columnas-1 Con Paso 1 Hacer
			Si j==0 Entonces
				text = matriz(i,j) + Subcadena(text,0,21-(Longitud(matriz(i,j))))
				Escribir Sin Saltar "[" text "]"
			SiNo
				text2 = matriz(i,j) + Subcadena(text2,0,19-(Longitud(matriz(i,j))))
				Escribir Sin Saltar "[" text2 "]"
			FinSi
			text = "                      "
			text2= "                    "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
