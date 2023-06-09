# **Licencia de Manejo**

En esta actividad, creará una aplicación que permita a los usuarios crear diferentes licencia para cada persona.

### **Diagrama de Entidad Relación y Estructura**

!https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/onetoone.png

!https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/license-wf.png

### **Temas**

- Relaciones 1:1.
- Métodos JPA.

### **Actividades**

- Permitir a los usuarios crear una nueva persona con su primer nombre y apellido.
- Permitir a los usuarios crear una licencia con su estado y fecha de caducidad, sin embargo la licencia es creada por el servidor. La primera persona en la base de datos tendrá una licencia 000001. Incremente en 1 cada vez que una persona es agregada.
- Tener una página de presentación que muestre el nombre de la persona, número de licencia, estado de la licencia y la fecha de caducidad de la licencia.

# **Archivo .war**

Para comprobar si ha completado esta actividad correctamente, hemos creado un proyecto que simplemente muestra todas las personas en su base de datos con la información de su licencia.

!https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/war.png

Primero descargue este archivo .war: **[license-0.0.1-SNAPSHOT.war](https://github.com/itzedu/warFiles/raw/master/license-0.0.1-SNAPSHOT.war)**. Ahora puede ejecutar `java -jar license-0.0.1-SNAPSHOT.war` y empezará un proyecto Spring Boot en el puerto 3000. Navegue a localhost:3000 y debería ver la imagen anterior pero con la información de su base de datos. Si no, es porque ha agregado personas u licencias de manera incorrecta. **Asegúrese que su esquema en la base de datos MySQL se llama "relationships"**.