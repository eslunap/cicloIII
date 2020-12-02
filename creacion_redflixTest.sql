DROP SCHEMA IF EXISTS RedFlixTest;
CREATE SCHEMA IF NOT EXISTS RedFlixTest;
USE RedFlixTest;

CREATE TABLE director(
	id_director INT PRIMARY KEY,
	nombre_director char (20),
	apellido_director char(20),
	nacionalidad_director char(40)
);
insert into director values (101, "Hayo","Miyazaki", "japones");
insert into director values (102, "Joss", "Whedon", "estadounidense");
insert into director values (103, "Christopher", "Nolan", "estadounidense");
insert into director values (104, "Bong", "Joon-ho", "coreano");
insert into director values (105, "Vincent", "Ward", "neozelandes");

CREATE TABLE pelicula(
	id_pelicula INTEGER PRIMARY KEY AUTO_INCREMENT,
	titulo_pelicula VARCHAR(100) NOT NULL UNIQUE,
	resumen TEXT (500) NOT NULL,
	anio YEAR NOT NULL,
	nombre_director VARCHAR(20) UNIQUE
);

INSERT INTO pelicula (titulo_pelicula, resumen, anio, nombre_director) VALUES
	("Los Vengadores","Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.",1990,"Joss Whedon"),
	("Interestelar","Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.",2014,"Christopher Nolan"),
	("El viaje de Chihiro",	"Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.",2001,"Hayo Miyazaki"),
	("Parasitos", "Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.", 2019,"Bong Joon-ho"),
	("Mas alla de los sueños","Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.",1998,"Vincent Ward");
    
CREATE TABLE serie(
	id_serie INTEGER PRIMARY KEY AUTO_INCREMENT,
	titulo_serie VARCHAR(100) NOT NULL UNIQUE,
	num_episodios INT NOT NULL,
	num_temporadas INT NOT NULL
);

INSERT INTO serie (titulo_serie, num_episodios, num_temporadas) VALUES 
("The walking dead", 153, 11), ("Viaje a las estrellas: la serie original", 80, 3),	("Glow", 30, 3), ("La casa de papel", 31, 4), ("Friends",	236, 10),("Arrow", 170, 8),	("The big bang theory", 279, 12),("Vikingos", 79, 6);

CREATE TABLE usuario(
	id_username VARCHAR (40) PRIMARY KEY NOT NULL unique,
	nombre_usuario VARCHAR (40) NOT NULL,
	apellido_usuario VARCHAR (40) NOT NULL,
	email_usuario VARCHAR (100) NOT NULL,
	celular_usuario  VARCHAR (15) NOT NULL,
	contrasena_usuario VARCHAR(20) NOT NULL,
	fecha_nacimiento date NOT NULL
);
INSERT INTO usuario VALUES
	("lucky","Pedro", "Perez", "pedro@gmail.com","3221987253","password1","1973-08-14"),
	("malopez","Maria", "Lopez", "maria@gmail.com","3226291424","password2","1988-02-02"),
	("diva","Ana", "Diaz", "anadiaz@gmail.com","3222870349","password3","1981-05-11"),
	("dreamer","Luis", "Rojas", "luis@hotmail.com","3224173688","password4","1965-09-15"),
	("ninja","Andres", "Cruz", "cruz@gmail.com","3225001028","password5","1985-07-07"),
	("neon","Nelson", "Ruiz", "nelruiz@gmail.com","3223668642","password6","1993-05-26"),
	("rose","Claudia", "Mendez", "claumendez@gmail.com","3227536106","password7","1996-12-18"),
	("green","Jorge", "Rodriguez", "jorgerod@gmail.com","3221616598","password8","1981-05-15");
    
CREATE TABLE registro_transmisiones(
	id_transmision INTEGER PRIMARY KEY AUTO_INCREMENT,
	username_id VARCHAR (40) NOT NULL,
	titulo_contenido VARCHAR(100) NOT NULL,
	fecha_hora datetime NOT NULL,
	FOREIGN KEY (username_id) REFERENCES usuario(id_username) ON DELETE CASCADE
);

INSERT INTO registro_transmisiones (username_id, titulo_contenido, fecha_hora) VALUES
	("lucky", "Los Vengadores", "2017-10-25 20:00:00"),
	("lucky",  "Parasitos", "2019-03-15 18:30:00"),
	("lucky", "La casa de papel", "2019-05-20 20:30:00"),
	("malopez", "Los Vengadores", "2018-05-20 20:30:00"),
	("malopez", "La casa de papel", "2020-01-20 20:30:00"),
	("diva", "Interestelar", "2019-05-20 20:30:00"),
	("diva", "El viaje de Chihiro", "2018-06-22 21:30:00"),
	("diva", "The walking dead", "2020-03-17 15:30:20"),
	("dreamer", "The walking dead", "2020-03-17 15:30:20"),
	("dreamer", "Viaje a las estrellas: la serie original", "2020-04-10 18:30:20"),
	("ninja",  "Glow", "2020-02-17 20:30:20"),
	("ninja", "La casa de papel", "2020-02-20 16:30:20"),
	("ninja", "Arrow", "2020-03-27 18:30:20"),
	("rose",  "Friends", "2020-03-20 21:30:20"),
	("green", "Interestelar", "2020-01-10 17:30:20"),
	("green", "Parasitos",  "2020-02-15 20:30:20"),
	("green", "Mas alla de los sueños", "2020-03-17 18:30:20");


    