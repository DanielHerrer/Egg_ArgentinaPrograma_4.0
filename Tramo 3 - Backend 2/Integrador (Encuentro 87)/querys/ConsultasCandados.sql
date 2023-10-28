-- Egg ENCUENTRO 87 INTEGRADOR JAVA NBA CANDADOS (Daniel Franco Herrera) 

SELECT * FROM estadisticas;

# CANDADO A

-- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.

SELECT COUNT(est.Asistencias_por_partido) FROM estadisticas est WHERE est.Asistencias_por_partido = (SELECT MAX(est.Asistencias_por_partido) FROM estadisticas est); 
-- POSICION = 2
 
-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
-- centro o esté comprendida en otras posiciones.

SELECT SUM(jug.peso) FROM jugadores jug INNER JOIN equipos equ ON jug.Nombre_equipo = equ.Nombre 
WHERE jug.posicion LIKE '%C%' AND equ.Conferencia LIKE '%East%'; 
-- CLAVE = 14043

# CANDADO B

-- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
-- jugadores que tiene el equipo Heat.

SELECT COUNT(*) FROM jugadores jug INNER JOIN estadisticas est ON jug.codigo = est.jugador
WHERE est.Asistencias_por_partido > (SELECT COUNT(*) FROM jugadores jug WHERE jug.Nombre_equipo LIKE '%Heat%');
-- POSICION = 3

-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.

SELECT COUNT(*) FROM partidos par WHERE par.temporada LIKE '%99%';
-- CLAVE = 3480

# CANDADO C

-- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
-- parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
-- 195, y a eso le vamos a sumar 0.9945.

SELECT COUNT(*) FROM jugadores jug INNER JOIN equipos equ ON jug.Nombre_equipo = equ.Nombre 
WHERE jug.Procedencia LIKE '%Michigan%' AND equ.Conferencia LIKE '%West%'; -- 4
SELECT COUNT(*) FROM jugadores jug WHERE jug.Peso >= 195; -- 362
-- POSICION = (4 / 362) = (0.0110 + 0.9945) = 1.0055

-- Clave: La clave del candado C estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
-- sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
-- tapones por partido. Además, este resultado debe ser, donde la división sea central.

SELECT FLOOR(
	(SELECT AVG(est.Puntos_por_partido) FROM estadisticas est 
    INNER JOIN jugadores jug  ON est.jugador = jug.codigo
    INNER JOIN equipos equ ON jug.Nombre_equipo = equ.nombre
	WHERE equ.division LIKE 'Central') +
	(SELECT COUNT(est.Asistencias_por_partido) FROM estadisticas est 
    INNER JOIN jugadores jug ON est.jugador = jug.codigo
	INNER JOIN equipos equ ON jug.Nombre_equipo = equ.nombre
	WHERE equ.division LIKE 'Central') +
	(SELECT SUM(est.Tapones_por_partido) FROM estadisticas est 
    INNER JOIN jugadores jug ON est.jugador = jug.codigo
	INNER JOIN equipos equ ON jug.Nombre_equipo = equ.nombre
	WHERE equ.division LIKE 'Central')
) AS clave;
-- CLAVE = 631

# CANDADO D
-- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
-- resultado debe ser redondeado. Nota: el resultado debe estar redondeado

SELECT ROUND(est.Tapones_por_partido) FROM estadisticas est INNER JOIN jugadores jug ON est.jugador	= jug.codigo 
WHERE est.temporada LIKE '%00/01%' AND jug.Nombre LIKE '%Corey Maggette%';
-- POSCION = 4

-- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de datos:
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
-- de todos los jugadores de procedencia argentina.

SELECT ROUND(
	(SELECT SUM(est.Puntos_por_partido) FROM estadisticas est INNER JOIN jugadores jug ON est.jugador = jug.codigo 
	WHERE jug.Procedencia LIKE '%Argentina%')
) AS clave;
-- CLAVE = 191


