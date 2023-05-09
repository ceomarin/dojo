# **Trazando tus Bloques**

Intenta duplicar la siguiente imagen ajustando el código CSS. Usa **margins y paddings** para ajustar los espacios entre divisiones y utiliza la propiedad display para lograr situar cada bloque en el lugar correcto. Tal vez necesites propiedades de CSS adicionales.

![https://assets.codingdojo.com/boomyeah/company_209/chapter_2135/handouts/chapter2135_3264_position-blocks.png](https://assets.codingdojo.com/boomyeah/company_209/chapter_2135/handouts/chapter2135_3264_position-blocks.png)

Este es el código de HTML:

```html
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Position Practice</title>
      <link rel="stylesheet" type="text/css" href="style.css">

   </head>
   <body>
       <div id="wrapper">
         <div id="header"></div>
         <div id="navigation"></div>
         <div id="main_content">
            <div class="subcontents"></div>
            <div class="subcontents"></div>
            <div class="subcontents"></div>
            <div id="advertisement"></div>
         </div>
      </div><!-- end of wrapper -->
   </body>
</html>
copy
```

y CSS:

```css
/*CSS reset settings here*/
*{
 margin: 0px;
 padding: 0px;
}
#wrapper{
 width: 950px;
 background-color: silver;
 margin: 0px auto;
}
#header{
 min-height: 150px;
 background-color: green;
}
#navigation{
 min-height: 300px;
 width: 200px;
 background-color: blue;
}
#main_content{
 min-height: 400px;
 width: 700px;
 background-color: red;
}
.subcontents{
 min-height: 200px;
 width: 210px;
 background-color: yellow;
}
#advertisement{
 min-height: 120px;
 width: 660px;
 background-color: purple;
}
copy
```

*No gastes más de 2-3 horas en esta actividad.*

Mientras realizas esta actividad, utiliza min-height (altura mínima) y vertical align (alineación vertical) para darle una altura mínima a la separación y alinear verticalmente algunos de los inline-blocks. Por favor, NO uses float (utiliza display:inline-block).