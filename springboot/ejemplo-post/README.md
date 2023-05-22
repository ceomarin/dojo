# **Solicitudes POST y Datos Flash**

Ahora que sabe cómo utilizar las *cadenas de consulta*, veamos las solicitudes `POST` y por qué utilizarlas. Primero imagine que utilizamos *cadenas de consulta* para pasar nuestra información de usuario y contraseña. Eso significa que mostraríamos algo como esto: `https://www.gmail.com?user=ninja&pass=SuperSecretPassword`. ¿Sería bueno dejar eso en el historial del navegador? (existen otras razones más técnicas para utilizar `POST` en lugar de `GET`, pero puede analizarlas más adelante).

¡Por supuesto que no quieres eso en el historial del navegador! Ahora conozcamos las solicitudes`POST`, donde puedes enviar información sin preocuparte de dejar rastro de la información del usuario en el navegador; en lugar de eso incluiremos la información enviada en *el cuerpo* de la solicitud. Como mencioné antes, es tan fácil como agregar el argumento llamado `method` a nuestra anotación`@RequestMapping`.

```
// ...
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login() {
// ...copy
```

| Método | Ruta | Controlador |
| --- | --- | --- |
| POST | /login | HelloWorldController.login |

Bueno, eso es muy bueno y todo, pero ¿cómo hacemos actualmente para enviar algo? ¡Solo necesitamos crear un formulario y establecer `POST` como su método!

```
<!-- ... -->
<form method="POST" action="/login">
    <label>Username: <input type="text" name="username"></label>
    <label>Password: <input type="password" name="password"></label>
    <button>Login</button>
</form>copy
```

Bueno, pero todavía tenemos un problema. ¿Cómo obtenemos la información una vez se ha enviado? ¡Exactamente de la misma manera que obteníamos la información en las cadenas de consulta!

```
// ...
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
// ...copy
```

Realmente es así de fácil. Luego, una vez que tenemos esa información, ¿qué hacemos con ella? La procesamos y agregamos lo que queramos guardar a nuestra Session y luego redirigimos a una página para mostrar la información.

```
// ...
@Controller
public class UsersController {
      @RequestMapping(value="/login", method=RequestMethod.POST)
      public String login(@RequestParam(value="user") String user, @RequestParam(value="password") String password) {
            // ... procesar la información y guardarla en la Session
            return "redirect:/dashboard";
      }
// ...copy
```

```
// ...
@Controller
public class DashboardController {
    @RequestMapping("/dashboard")
    public String dashboard() {
      // ... algún código para procesar antes de mostrar la página
      return "dashboard.jsp";
    }
// ...
```

# **Datos Flash**

Los datos Flash son datos que solo se persisten en la próxima solicitud. Este tipo de datos son muy útiles como para mensajes de error, notificaciones de éxito o cualquier otra cosa que desee mostrarle al usuario inmediatamente después de la solicitud.

# **Utilizando Datos Flash**

Para utilizar nuestros datos Flash tenemos que inyectar `RedirectAttributes` en nuestro método y agregarle atributos flash. Por ejemplo, podríamos colocar `RedirectAttributes` en nuestro método `createError` para intentar enviar un error de vuelta a nuestro método `index`.

```
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}

	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test errror!");
        return "redirect:/";
	}
}
copy
```

En el escenario anterior, la única vez que un error será mostrado es inmediatamente después de visitar `/createError`. Esto nos permite pasar datos temporales a través de nuestra aplicación para notificar a los usuarios dentro de un nuevo ciclo de  solicitud/respuesta.

### **Enlaces Útiles**

- **[Definiciones del método Request.](https://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)**
- **[Notas de Configuración de Spring Boot.](http://docs.spring.io/spring-boot/docs/1.5.3.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-auto-configuration)**
- **[@RequestParam.](https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html)**
- **[Spring MVC Flash.](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-flash-attributes)**