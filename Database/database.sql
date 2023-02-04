USE db_tutorados;

CREATE TABLE profesores (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255),
  apellidos VARCHAR(255),
  correo VARCHAR(255),
  anioIngreso VARCHAR(255),
  gradoAcademico VARCHAR(255),
  adscripcion VARCHAR(255)
);

CREATE  TABLE alumnos (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(60),
	matricula VARCHAR(60),
	apellidos VARCHAR(50),
  	correo VARCHAR(50),
  	telefonoCasa VARCHAR(50),
  	telefonoCelular VARCHAR(50),
  	fechaNacimiento VARCHAR(50),
  	anioIngreso VARCHAR(50),
  	carrera VARCHAR(50),
	profesor_id INT,
	FOREIGN KEY (profesor_id) REFERENCES profesores(id)
);


CREATE TABLE tutorias (
  id INT AUTO_INCREMENT PRIMARY KEY,
  fecha VARCHAR(255),
  hora VARCHAR(255),
  duracion VARCHAR(255),
  comentarios VARCHAR(255),
  alumno_id INT,
  FOREIGN KEY (alumno_id) REFERENCES alumnos(id)
);
