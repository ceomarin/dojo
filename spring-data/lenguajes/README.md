# **Lenguajes**

Para esta actividad necesita crear una aplicación CRUD para un panel de idiomas.

● name: Min char 2, Max char 20

● creator: Min char 2, Max char 20

● currentVersion: Cannot be empty

![https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/08_07_languages.png](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/08_07_languages.png)

### **Temas**

- Conservar datos.
- CRUD.

### **Actividades**

- La ruta **GET** `/languages` debe mostrar una tabla con todos los lenguajes y los botones de Editar y Eliminar para cada lenguaje, también debe incluir un formulario para crear un nuevo lenguaje,
- La ruta **POST** `/languages` debe crear un lenguaje.
- La ruta **GET** `/languages/{id}` debe retronar un lenguaje específico y sus detalles.
- La ruta **GET** `/languages/{id}/edit` debe mostrar la página para editar un lenguaje específico.
- La ruta **PUT** `/languages/{id}` debe actualizar un lenguaje.
- La ruta **DELETE** `/languages/{id}` debe eliminar el lenguaje con ese id.
- Todas las rutas deben estar validadas y mostrar errores.
- Los datos se deben conservar en una base de datos MySQL.