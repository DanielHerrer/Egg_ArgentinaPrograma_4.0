CREATE DATABASE IF NOT EXISTS libreria;

#seleccionar la base de datos
USE libreria;

CREATE TABLE IF NOT EXISTS Editorial (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(255) UNIQUE,
    alta BOOLEAN
);

CREATE TABLE IF NOT EXISTS Autor (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nombre VARCHAR(255) UNIQUE,
    alta BOOLEAN
);

CREATE TABLE IF NOT EXISTS Libro (
	isbn BIGINT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) UNIQUE,
    anio INT,
    ejemplares INT,
    ejemplaresPrestados INT,
    ejemplaresRestantes INT,
    alta BOOLEAN
);

INSERT INTO Autor VALUES (1,'Daniel',null);