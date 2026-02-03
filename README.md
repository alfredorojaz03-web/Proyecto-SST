# Proyecto Web SENA – Aplicación SST

**Aprendiz:** Alfredo Arregocés  

---

## ¿De qué se trata este proyecto?
Este proyecto es una aplicación web sencilla para el Sistema de Gestión de Seguridad y Salud en el Trabajo (SST).  
Fue desarrollada como parte de los talleres del programa **Tecnología de Análisis y Desarrollo de Software** otorgada por el SENA.

La aplicación permite registrar incidentes SST a través de un formulario y guardar la información en una base de datos, integrando los diferentes módulos del sistema.


Este proyecto hace parte de las guías de aprendizaje GA7 y GA8 de la fase ejecución en la plataforma Zajuna

---

## Objetivo del proyecto
Aprender a desarrollar una aplicación web básica, organizada por módulos, donde se integren formularios, servlets, clases Java y base de datos, aplicando lo visto durante la formación.

---

## ¿Qué hace el sistema?
El sistema permite:
- Registrar incidentes SST desde un formulario web.
- Enviar la información al servidor.
- Guardar los datos en una base de datos.
- Mostrar un mensaje de respuesta al usuario.

---

## ¿Cómo está organizado el proyecto?
El proyecto está organizado en paquetes para que sea más fácil de entender y mantener:

- **modelo:** contiene las clases que representan la información del sistema.
- **dao:** contiene las clases que se encargan de guardar los datos en la base de datos.
- **servlet:** contiene los servlets que reciben la información del formulario.
- **util:** contiene clases de apoyo como la conexión a la base de datos.
- **web:** contiene las páginas HTML y JSP que ve el usuario.

Esta organización permite que cada parte del sistema cumpla una función específica.

---

## Integración de los módulos
Los módulos del sistema trabajan de la siguiente forma:

1. El usuario ingresa a la página web.
2. Diligencia el formulario de incidentes.
3. El servlet recibe la información.
4. La información se envía al DAO.
5. El DAO guarda los datos en la base de datos.
6. El sistema muestra un mensaje de resultado al usuario.

De esta manera se demuestra que los módulos están integrados y funcionando correctamente.

---

## Tecnologías utilizadas
Para el desarrollo del proyecto se utilizaron las siguientes herramientas:
- Lenguaje de programación: Java
- IDE: NetBeans
- Servidor de aplicaciones: Apache Tomcat
- Base de datos: MySQL
- Tecnologías web: HTML y JSP
- Control de versiones: Git y GitHub

---

## ¿Cómo ejecutar el proyecto?
Para ejecutar el proyecto se deben seguir estos pasos:
1. Descargar o clonar el repositorio desde GitHub.
2. Abrir el proyecto en NetBeans.
3. Configurar Apache Tomcat como servidor.
4. Ejecutar el proyecto.
5. Acceder a la aplicación desde el navegador.

---

## Pruebas realizadas
Se realizaron pruebas básicas para verificar:
- El envío de datos desde el formulario.
- La correcta integración entre el servlet y la base de datos.
- El almacenamiento de la información.
- La respuesta del sistema al usuario.

Las pruebas fueron satisfactorias.

---

## Control de versiones
El proyecto se encuentra almacenado en GitHub, lo que me permite llevar un control de los cambios realizados durante el desarrollo.


---

## Ambiente de desarrollo
- Sistema operativo: Windows
- IDE: NetBeans
- Servidor web: Apache Tomcat
- Base de datos: MySQL
- JDK: Java Development Kit

---

## Conclusión
Con el desarrollo de este proyecto se logró integrar los diferentes módulos de una aplicación web básica, aplicando los conocimientos adquiridos durante la formación.  
El sistema funciona correctamente y cumple con los requisitos solicitados.

