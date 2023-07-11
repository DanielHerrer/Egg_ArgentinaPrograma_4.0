-- Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e
-- insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá
-- obtener un diagrama de entidad relación igual al que se muestra a continuación:

-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:

SELECT * FROM equipos;
SELECT * FROM estadisticas;
SELECT * FROM jugadores;
SELECT * FROM partidos;

# 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT nombre FROM jugadores ORDER BY nombre ASC;

# 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
# ordenados por nombre alfabéticamente.
SELECT nombre, posicion FROM jugadores WHERE posicion LIKE '%C%';

# 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT nombre FROM equipos ORDER BY nombre ASC;

# 4. Mostrar el nombre de los equipos del este (East).
SELECT nombre, conferencia FROM equipos WHERE conferencia LIKE '%East%';

# 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT * FROM equipos WHERE ciudad LIKE 'C%';

# 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT * FROM jugadores ORDER BY nombre_equipo ASC;

# 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT * FROM jugadores WHERE nombre_equipo LIKE '%Raptors%';

# 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT jug.nombre, est.jugador, est.puntos_por_partido FROM jugadores jug
	INNER JOIN estadisticas est ON jug.codigo = est.jugador
		WHERE jug.nombre LIKE '%Pau Gasol%';

# 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT jug.nombre, est.jugador, est.puntos_por_partido, est.temporada FROM jugadores jug
	INNER JOIN estadisticas est ON jug.codigo = est.jugador
		WHERE jug.nombre LIKE '%Pau Gasol%' AND est.temporada = '04/05';

# 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT jug.nombre, est.jugador, ROUND(SUM(est.puntos_por_partido)) AS total_puntos 
	FROM jugadores jug INNER JOIN estadisticas est ON jug.codigo = est.jugador
		GROUP BY jug.codigo;

# 11. Mostrar el número de jugadores de cada equipo.
SELECT COUNT(codigo) AS num_jugadores, nombre_equipo FROM jugadores
	GROUP BY nombre_equipo;

# 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT jug.nombre, est.jugador, ROUND(SUM(est.puntos_por_partido)) AS total_puntos 
	FROM jugadores jug INNER JOIN estadisticas est ON jug.codigo = est.jugador
		GROUP BY jug.codigo ORDER BY total_puntos DESC LIMIT 1;

# 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT jug.nombre, jug.nombre_equipo, jug.altura, equ.conferencia, equ.division
	FROM jugadores jug INNER JOIN equipos equ ON jug.nombre_equipo = equ.nombre
		ORDER BY jug.altura DESC LIMIT 1;

# 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
SELECT ROUND(AVG(total_puntos)) AS media_puntos_Pacific 
	FROM (
		SELECT par.puntos_local AS total_puntos
		FROM partidos par INNER JOIN equipos equ ON par.equipo_local = equ.nombre
		WHERE equ.division LIKE '%Pacific%'
    UNION ALL
		SELECT par.puntos_visitante AS total_puntos
		FROM partidos par INNER JOIN equipos equ ON par.equipo_visitante = equ.nombre
		WHERE equ.division LIKE '%Pacific%'
	) AS puntos_totales;

# 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
# diferencia de puntos.
SELECT equipo_local, equipo_visitante, 
	MAX(ABS(puntos_local - puntos_visitante)) AS diferencia_puntos
		FROM partidos;

# 16. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
SELECT equipos.nombre, SUM(total_puntos) AS puntos_totales
	FROM equipos LEFT JOIN (
		SELECT par.equipo_local AS equipo, par.puntos_local AS total_puntos 
		FROM partidos par
			UNION ALL
		SELECT par.equipo_visitante AS equipo, par.puntos_visitante AS total_puntos
		FROM partidos par
    ) AS puntos_totales
		ON equipos.nombre = puntos_totales.equipo GROUP BY equipos.nombre;
        
# 17. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
# equipo_ganador), en caso de empate sera null.
SELECT par.codigo, par.equipo_local, par.equipo_visitante,
    CASE
        WHEN par.puntos_local > par.puntos_visitante THEN par.equipo_local
        WHEN par.puntos_local < par.puntos_visitante THEN par.equipo_visitante
        ELSE NULL
    END AS equipo_ganador
		FROM partidos par;

SELECT * FROM fabricante;