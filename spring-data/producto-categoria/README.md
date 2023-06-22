# **Productos y Categorías**

En esta actividad, creará una aplicación que guardará productos y categorías.

### **Diagrama Entidad Relación (ERD - Entity Relationship Diagramm) y Estructura**

!https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/manytomany.png

!https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/manytomany-wf.png

### **Temas**

- Relaciones Muchos-a-Muchos.
- Métodos JPA.

### **Actividades**

- Permitir a los usuarios crear productos.
- Permitir a los usuarios crear categorías.
- En la página que muestra los productos, permitir a los usuarios agregar categorías a un producto específico.
- En la página que muestra las categorías, permitir a los usuarios agregar productos a una categoría específica.

# **Archivo .war**

Para probar si ha completado la actividad correctamente, hemos creado un proyecto que simplemente muestra todos los productos y cuenta en cuántas categorías aparece y vice versa.

!https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/manytomanywar.png

Primero descargue el archivo .war: **[license-0.0.3-SNAPSHOT.war](https://github.com/itzedu/warFiles/raw/master/license-0.0.3-SNAPSHOT.war)**. Ahora puede ejecutar `java -jar license-0.0.3-SNAPSHOT.war` y empezará este proyecto Spring Boot en el puerto 3000. Navegue a localhost:3000 y debería ver una imagen como la anterior pero con la información de su base de datos. Si no, ha agregado productos y categorías de manera incorrecta.