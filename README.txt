#prueba tecnica amaris Manuel Sanchez
Ver archivo Prueba Técnica Manuel Sanchez.pdf para ver la respuesta al punto 1 de la prueba

#Para usar este repositorio

Este proyecto contiene tanto el codigo fuente como el war listo para desplegarse en wildfly, el codigo fuente es una aplicacion
spring boot gestionada con maven, por lo cual podra clonarse como un proyecto.

También se encuentra un archivo sql para ser ejecutado en una base de datos local MySQL 

Adicional se encuentra una carpeta que contiene el código de angular para la aplicación.

# Requisitos previos

Java 8 o superior
navegador web
git
IDE de desarrollo

# Probar la aplicación

1. Clonar el repositorio y correr el proyecto o bien desplegar el .war en wildfly (Se correrá en el puerto 9000)
2. Ejecutar el archivo amaris.sql en un gestor de base de datos local de MySQL y si se va a utilizar wildfly agregar el Datasource
de Mysql con la URL: jdbc:mysql://localhost:3306/amaris
3. Abrir una consola en la carpeta angular/view y ejecutar el comando "ng serve" para inicializar el servidor de angular en
el puerto 4200
4. Finalmente para comprobar el funcionamiento de la aplicación, entrar a http://localhost:4200 y probar las respectivas funcionalidades.



