# **Actualizar y Eliminar**

En esta actividad, implementará los métodos de Actualizar y Eliminar y comprobará las rutas con Postman. Continue usando el mismo proyecto mvc que ha estado usando hasta ahora. Aquí está algo de código del controlador para empezar.

### **src/main/java/com/codingdojo/mvc/controllers/BooksApi.java**

```java
// ..
import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;
@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    //Otros métodos han sido removidos para resumir.
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }

    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}copy
```

Su trabajo es escribir los métodos de servicio que actualizarán y eliminarán correctamente un libro. Para actualizar un libro, tendrá que utilizar métodos setters del modelo y luego llamar al método `save`. Como puedes ver, `save` es usado por ambos métodos *crear* y *actualizar*. Para eliminar un libro, tendrá que utilizar el método `deleteById`. A continuación, he colocado el enlace a la documentación de `CrudRepository`.

### **Enlaces Útiles**

- **[Métodos de CrudRepository](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html)**

# **Mostrar**

En esta actividad, continuará creando nuestra aplicación web CRUD e implementará el método para mostrar (show). Por ejemplo, cuando el usuario visita la ruta "/books/1", usted debe responder con una Vista que tenga toda la información sobre ese libro.

![https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/Screen_Shot_2018-05-23_at_7.00.10_PM.png](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/Screen_Shot_2018-05-23_at_7.00.10_PM.png)

Aquí está el código JSP:

### **src/main/webapp/WEB-INF/books/show.jsp**

```java
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1><c:out value="${book.title}"/></h1>
<p>Description: <c:out value="${book.description}"/></p>
<p>Language: <c:out value="${book.language}"/></p>
<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
<a href="/books/${book.id}/edit">Edit Book</a>
<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
```