# Reporte de Tutorados 

## Descripción
Este es un pequeño si   stema de reporte que se encarga de
registrar profesores alumnos, donde los profesores pueden tener el 
rol de ser tutores de muchos alumnos.
<br>
Proyecto final de materia programacion funcional, pasamos este codigo de haskell a java con la api stream 8 de java.
<br>
## ¿Cómo ejecutar el proyecto?
Es importante conocer que se debe de crear la base de datos en MYSQL y modificar el archivo "config.propierties"
<br>
Para ejecutar el proyecto se puede hacer mediante un ide como IntelligeIDEA o por medio de maven.
<br>
1. Ejecuta el siguiente comando para instalar las dependecias:

```
mvn install
```
2. Para limpiar el proyecto
```
mvn clean install
```
3. Para compilar y generar el .jar del proyecto
```
mvn package
```
4. Ejecuta el proyecto con java
```
java -jar target/ReporteTutorados-1.0-SNAPSHOT.jar
```
## Visualizacion del proyecto
1. Imagen de la ventana principal
![Imagen del programa principal](Recurso/img.png)
2. Imagen de la relación y construcción de la base de datos 
![Imagen de la base de datos relacion](Recurso/img_1.png)
