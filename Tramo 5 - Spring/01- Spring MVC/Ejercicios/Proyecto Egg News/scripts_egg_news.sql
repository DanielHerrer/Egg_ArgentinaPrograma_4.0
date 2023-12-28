CREATE DATABASE egg_noticias;

INSERT INTO `egg_noticias`.`noticia`(`id`,`titulo`,`cuerpo`,`fecha`)
VALUES
("17",
"Se cae un perro en la calle",
"Descabellante historia pasa en ----",
"2023-10-26 14:30:57");

SELECT * FROM noticia;

UPDATE noticia SET activo = true WHERE id = 'f69421cb-9c90-4f93-b5e7-98b79481ea1d';
