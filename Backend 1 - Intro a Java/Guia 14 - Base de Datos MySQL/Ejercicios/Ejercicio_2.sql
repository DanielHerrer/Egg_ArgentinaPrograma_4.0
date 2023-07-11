# Abrir el script de la base de datos llamada “tienda.sql” y ejecutarlo para crear sus tablas e
# insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
# obtener un diagrama de entidad relación igual al que se muestra a continuación:

# A continuación, se deben realizar las siguientes consultas sobre la base de datos:
SELECT * FROM fabricante;
SELECT * FROM producto;

# 1. Lista el nombre de todos los productos que hay en la tabla producto.
SELECT nombre FROM producto;

# 2. Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT nombre, precio FROM producto;

# 3. Lista todas las columnas de la tabla producto.
SELECT * FROM producto;

# 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando
# el valor del precio.
SELECT nombre, ROUND(precio) AS precio FROM producto;

# 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
SELECT fab.codigo FROM fabricante fab INNER JOIN producto prod ON fab.codigo = prod.codigo_fabricante
		HAVING (SELECT COUNT(p.codigo_fabricante) FROM producto p WHERE p.codigo_fabricante = prod.codigo_fabricante) > 0;

# 6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar
# los repetidos.
SELECT fab.codigo FROM fabricante fab INNER JOIN producto prod ON fab.codigo = prod.codigo_fabricante
		GROUP BY prod.codigo_fabricante HAVING (SELECT COUNT(p.codigo_fabricante) FROM producto p WHERE p.codigo_fabricante = prod.codigo_fabricante) > 0;

# 7. Lista los nombres de los fabricantes ordenados de forma ascendente.
SELECT nombre FROM fabricante ORDER BY nombre ASC;

# 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
# ascendente y en segundo lugar por el precio de forma descendente.
SELECT nombre FROM producto AS por_nombre_ASC ORDER BY nombre ASC;
SELECT nombre FROM producto AS por_precio_DESC ORDER BY precio DESC;

# 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
SELECT * FROM fabricante LIMIT 5;

# 10. Lista el nombre y el precio del producto más barato. 
# (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;

# 11. Lista el nombre y el precio del producto más caro. 
# (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;

# 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
SELECT nombre FROM producto WHERE precio <= 120;

# 13. Lista todos los productos que tengan un precio entre $60 y $200. 
# Utilizando el operador BETWEEN.
SELECT * FROM producto WHERE precio BETWEEN 60 AND 200;

# 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. 
# Utilizando el operador IN.
SELECT * FROM producto WHERE codigo IN (1,3,5);

# 15. Devuelve una lista con el nombre de todos los productos 
# que contienen la cadena Portátil en el nombre.
SELECT * FROM producto WHERE nombre LIKE ("%Portatil%");

-- Consultas Multitabla
# 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante
# y nombre del fabricante, de todos los productos de la base de datos.
SELECT prod.codigo, prod.nombre, prod.codigo_fabricante, fabr.nombre AS nombre_fabricante
	FROM producto prod INNER JOIN fabricante fabr ON prod.codigo_fabricante = fabr.codigo;

# 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
# los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
# orden alfabético.
SELECT prod.codigo, prod.nombre, prod.codigo_fabricante, fabr.nombre AS nombre_fabricante
	FROM producto prod INNER JOIN fabricante fabr ON prod.codigo_fabricante = fabr.codigo
		ORDER BY fabr.nombre ASC;

# 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
# más barato.
SELECT prod.nombre, prod.precio, fabr.nombre AS nombre_fabricante
	FROM producto prod INNER JOIN fabricante fabr ON prod.codigo_fabricante = fabr.codigo
		ORDER BY prod.precio ASC LIMIT 1;

# 4. Devuelve una lista de todos los productos del fabricante Lenovo.
SELECT producto.nombre, fabricante.nombre AS nombre_fabricante 
	FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo
		WHERE fabricante.nombre LIKE "%Lenovo%";

# 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
# mayor que $200.
SELECT producto.nombre, producto.precio, fabricante.nombre AS nombre_fabricante 
	FROM producto LEFT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo 
		WHERE fabricante.nombre LIKE "%Crucial%" AND producto.precio > 200;

# 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
# Utilizando el operador IN.
SELECT producto.nombre, fabricante.nombre AS nombre_fabricante 
	FROM producto LEFT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo 
		WHERE fabricante.nombre IN ("Asus","Hewlett-Packard");

# 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
# los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
# lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
# ascendente)
SELECT prod.nombre, prod.precio, fabr.nombre AS nombre_fabricante FROM producto prod 
	INNER JOIN fabricante fabr ON prod.codigo_fabricante = fabr.codigo
		WHERE prod.precio >= 180 ORDER BY prod.precio DESC;
SELECT prod.nombre, prod.precio, fabr.nombre AS nombre_fabricante FROM producto prod 
	INNER JOIN fabricante fabr ON prod.codigo_fabricante = fabr.codigo
		WHERE prod.precio >= 180 ORDER BY prod.nombre ASC;

-- Consultas Multitabla
# Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.

# 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
# productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
# fabricantes que no tienen productos asociados.
SELECT fabr.nombre AS nombre_fabricante, prod.nombre FROM fabricante fabr 
	LEFT JOIN producto prod ON fabr.codigo = prod.codigo_fabricante;

# 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
# producto asociado.
SELECT fabr.nombre AS nombre_fabricante, prod.nombre FROM fabricante fabr 
	LEFT JOIN producto prod ON fabr.codigo = prod.codigo_fabricante
		WHERE prod.codigo_fabricante IS NULL;
        
-- Subconsultas (En la cláusula WHERE)
# Con operadores básicos de comparación

# 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT producto.nombre FROM producto 
	WHERE producto.codigo_fabricante = 
		(SELECT codigo FROM fabricante WHERE fabricante.nombre LIKE "%Lenovo%");

# 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto
# más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT * FROM producto 
	WHERE producto.codigo_fabricante = 
		(SELECT codigo FROM fabricante WHERE fabricante.nombre LIKE "%Lenovo%")
			AND producto.precio = 
				(SELECT MAX(precio) FROM producto WHERE producto.codigo_fabricante = 
					(SELECT codigo FROM fabricante WHERE fabricante.nombre LIKE "%Lenovo%"));

# 3. Lista el nombre del producto más caro del fabricante Lenovo.
SELECT prod.nombre FROM	producto prod
	WHERE prod.codigo_fabricante = 
		(SELECT codigo FROM fabricante WHERE fabricante.nombre LIKE "%Lenovo%")
			ORDER BY prod.precio DESC LIMIT 1;

# 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio
# medio de todos sus productos.
SELECT prod.nombre FROM	producto prod
	WHERE prod.codigo_fabricante = 
		(SELECT codigo FROM fabricante WHERE fabricante.nombre LIKE "%Asus%")
			AND prod.precio > 
				(SELECT AVG(precio) FROM producto WHERE producto.codigo_fabricante = 
					(SELECT codigo FROM fabricante WHERE fabricante.nombre LIKE "%Asus%"));
            
-- Subconsultas con IN y NOT IN
# 1. Devuelve los nombres de los fabricantes que tienen productos asociados. 
# (Utilizando IN o NOT IN).
SELECT fabr.nombre AS nombre_fabricante FROM fabricante fabr 
	WHERE fabr.codigo IN (SELECT prod.codigo_fabricante FROM producto prod);

# 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando
# IN o NOT IN).
SELECT fabr.nombre AS nombre_fabricante FROM fabricante fabr 
	WHERE fabr.codigo NOT IN (SELECT prod.codigo_fabricante FROM producto prod);

-- Subconsultas (En la cláusula HAVING)
# 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
# de productos que el fabricante Lenovo.
SELECT fabr.nombre FROM fabricante fabr 
	HAVING (SELECT COUNT(*) FROM producto WHERE producto.codigo_fabricante = fabr.codigo) = 
		(SELECT COUNT(*) FROM producto WHERE producto.codigo_fabricante = (SELECT codigo FROM fabricante WHERE fabricante.nombre LIKE "%Lenovo%"));