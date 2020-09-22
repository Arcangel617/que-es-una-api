# ¿Qué es una API?

## Un poco de teoría

Una **API** básicamente es una sigla que significa **A**plication **P**rogramming **I**nterface o en español *Interfaz de Programación de Aplicaciones*. Una API es una **interfaz** que nos permite comunicarnos con otro software. Es muy problable que asocien el termino API con aplicaciones de web como por ejemplo las APIs de Google Maps, Facebook, Twitter. Sin embargo, éstas son sólo un tipo de APIs.

## Clasificación de APIs

Las APIs pueden clasificarse de la siguiente manera: 

### APIs de servicios web:

Este tipo de APIs nos permiten el intercambio de información entre un servidor y un cliente. La comunicación se hará utilizando el **protocolo HTTP o HTTPS**. La información será comúnmente transportada en un formato **XML** o **JSON**.

### APIs basadas en bibliotecas.

Este tipo de APIs nos permiten hacer uso de funciones, métodos o rutinas todo a través de una **biblioteca**, biblioteca que debemos de importar en nuestra aplicación.

Un Ejemplo de esto es el API de Google Maps para JavaScript. Si nosotros necesitamos trabajar con mapas en nuestro proyecto, debemos de importar la librería de google.

> **Nota:** En español, biblioteca o librería son términos que se utilizan para hacer referencia al mismo concepto. En inglés sólo utilizamos *library*.

### APIs basadas en clases.

Este tipo de APIs nos permiten hacer uso de clases ya definidas las cuales ya poseen lógica de programación, de tal forma que podamos agilizar nuestro proceso de creación de software.

Un Ejemplo es la API de Java. La misma no es más que un conjunto de clases, organizadas en paquetes, las cuales ya posen lógica de programación, atributos, métodos, etc. En este API podemos encontrar clases tales cómo `System`, `Math`, `String`, etc.

### APIs de sistemas operativos.

Este tipo de APIS permiten que nuestros programas interactúen con el sistema operativo, de tal forma que podamos tener acceso a elementos como el teclado, mouse, interfaz gráfica, podamos crear procesos, hilos etc.

Entonces, podríamos decir que una **API** es un *contrato* entre diferentes productos de software. Es como un manual que indica **cómo** utilizar un producto o un servicio.

¿Muchos conceptos no? No se preocupen, ya lo vamos a ver con más detalle.

## ¿De qué API vamos a hablar?

Hoy en día las más populares son las **APIs de aplicaciones web** y son en éste tipo de APIs en las cuales nos vamos a enfocar.

## Ahora, ¿Qué tengo que tener en cuenta para desarrollar una API?

El programador es quién decide QUE es lo que hará su API y COMO va a transmitir información. Para ello se vale de metodologías para el desarrollar las mismas. Existen dos tipos de API web: **SOAP** y **REST**. La más difundida hoy en día son las **APIs REST** y es en la cual nos vamos a enfocar.

### ¿Qué es SOAP?

**SOAP** es otra sigla mas que siginica **S**imple **O**bject **A**ccess **P**rotocol. Como bien dice su nombre, es un protocolo que define cómo dos objetos en diferentes procesos pueden comunicarse entre si por medio de intercambio de datos **XML**.

### Wait, ¿XML? creo que ya mencioné eso antes... ah si

XML es otra sigla más que significa e**X**tensible **M**arkup **L**anguage. Es un lenguaje de marcado que se utiliza entre otras cosas como formato de intercambio de infomación. La **W3C** lo define como un lenguaje de marcado de propósito general.

### ¿Qué es REST?

REST es otra sigla que significa **RE**presentational **S**tate **T**ransfer. REST, a diferencia de SOAP, es una arquitectura de desarrollo que utiliza el **Protocolo HTTP** para transmitir información. REST se que se basa en **recursos**. Podemos entender recursos como el **modelo** de una aplicación.

## Perfecto, entonces... ¿Cómo funcionan?

Un ejemplo sencillo para entender como funciona una API puede ser un restaurante.

Cliente - Mesero(api) - Cocina (Servidor)

Dentro de un restaurante un mozo no tiene porque saber como cocinar. Sin embargo, debe saber como transmitir los pedidos que el cliente le hace para obtener lo que quiere.

En términos de requerimientos, el cliente le da un mensaje al mozo, éste se lo pasa a la cocina, la cocina prepara el pedido, el mozo recoge lo que cocina preparó y se lo lleva al cliente.

## Bien, ahora si... a lo que vinimos... API REST 

Cómo se mencionó antes, REST es una arquitectura de desarrollo que utiliza el **Protocolo HTTP o HTTPS** para transmitir información.

### ¿Qué es **HTTP**? 

Es otra sigla que significa **H**yper **T**ext **T**ransfer **P**rotocol. Básicamente es el **protocolo** que rige todo internet. Permite transmitir información por internet utilizando **peticiones** y **respuestas**

Las **peticiones** se definen por 2 cosas:
- un **verbo HTTP**, el cúal indica la acción que se quiere llevar a cabo mediante la llamada a un servicio;
- una **url**, que define la dirección a la que queremos realizar la petición;

Las **respuestas** se definen por un código numérico que puede venir acompañado de un mensaje o no.

En éste tipo de API, el intercambio de información se puede realizar a través de **XML** o **JSON**.

### ¿Qué es JSON?

Si bien se pronuncian similar, no es el Viernes 13, **JSON** es otra sigla más (si, otro más) que significa **J**ava**S**cript **O**bject **N**otation.

Bien, muchos conceptos en un par de lineas. 

Veamos otro ejemplo:

Supongamos que tenemos una aplicación de gestión de automóviles, el **modelo** es un automóvil. Si yo quiero actualizar los datos de un automóvil, voy a necesitar realizar una **petición**. Ésta petición voy a tener que realizarla utilizando el **Protocolo HTTP**. El protocolo me provee de varios **métodos o verbos** que me permitirán realizar una operación concreta sobre un determinado **recurso**. Éste recurso está definido por una **URL** que define a su vez la dirección a la que debemos realizar la petición. Una vez que la petición fue procesada, éste recurso nos devolverá una **respuesta** con un **código de numérico** (también llamado *código de respuesta*) que puede venir acompañada o no de un mensaje, el cual puede estar en formato **XML** o **JSON**.

Increíble. Pero... aparecieron aún nos falta explicar que son los verbos http, los códigos de respuesta y las URLs.

### ¿Qué es una URL?

Si, adivinaron... una sigla =P. **URL** significa **U**niform **R**esource **L**ocator. Básicaente es la dirección específica que se asigna a cada uno de los recursos disponibles en la red con la finalidad de que estos puedan ser localizados o identificados.

**Ejemplo:**

Si tomamos el ejemplo del automóvil, la URL de nuestro recurso podría ser:
```
http://www.miapirest.com/v1/api/automoviles/1
```

> Existe un artículo que por lo menos a mi me gusta mucho y puede resultar de utilidad a la hora de definir los nombre de nuestros recursos. El enlace es el siguiente: [https://restfulapi.net/resource-naming/](https://restfulapi.net/resource-naming/).

### ¿Qué es un verbo HTTP?

Como mecionamos antes, un **verbo HTTP** es una palabra que indica el tipo de acción que se quiere llevar a cabo mediante una petición a un servicio. Los más utilizados en REST son los siguientes:

| Verbo HTTP | Descripción
| ----------- | ----------- |
| POST | Se utiliza para enviar una entidad a un recurso en específico, causando a menudo un cambio en el estado o efectos secundarios en el servidor.
| GET | Solicita una representación de un recurso específico. Las peticiones que usan el método GET sólo deben recuperar datos.
| PUT | Reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.
| PATCH | Es utilizado para aplicar modificaciones parciales a un recurso.
| DELETE | Borra un recurso en específico.

> Como dije antes, existen más métodos HTTP. Si quieren profundizar un poco mas pueden visitar: [https://developer.mozilla.org/es/docs/Web/HTTP/Methods](https://developer.mozilla.org/es/docs/Web/HTTP/Methods)

Se puede decir entonces que las acciones que se realizan sobre los recursos están estrechamente ligados a las operaciones CRUD. 

### ¿Qué son las operaciones CRUD? 

Son las cuatro operaciones básicas en persistencia de datos. Representan las operaciones de **C**reate, **R**ead, **U**pdate y **D**elete respectivamente. Es un término que se utiliza con bastante frecuencia cuando se trabaja con bases de datos.


| Operacion CRUD | Verbo HTTP |
| :-: | :-: |
| CREATE | POST |
| READ | GET |
| UPDATE | PUT / PATCH |
| DELETE | DELETE |

### ¿Códigos de respuesta? ¿Qué es eso?

Bien, luego enviar una petición a un recurso éste nos duevelve una repuesta que está asociada a la operación que acabamos de realizar. Son códigos numéricos de tres dígitos que nos brindan un poco mas de información sobre lo que acaba de suceder. Están dadas por rangos. En REST los códigos más comunes son los siguientes:

| Código | Descripción |
| :- | :- |
| 2XX | Respuesta satisfactorias |
| 4XX | Errores de los clientes |
| 5XX | Errores del servidor |

Algunos ejemplos pueden ser:

| Código | Descripción |
| :- | :- |
| 200 OK | La solicitud ha tenido éxito |
| 201 Created | La solicitud ha tenido éxito y se ha creado un nuevo recurso como resultado de ello. |
| 400 Bad Request | Esta respuesta significa que el servidor no pudo interpretar la solicitud dada una sintaxis inválida. |
| 401 Unauthorized | Es necesario autenticar para obtener la respuesta solicitada. |
| 403 Forbiden | El cliente no posee los permisos necesarios para cierto contenido, por lo que el servidor está rechazando otorgar una respuesta apropiada. |
| 404 Not Found | El servidor no pudo encontrar el contenido solicitado. |
| 500 Internal Server Error | El servidor ha encontrado una situación que no sabe como manejarla. |
| 503 Service Unavailable | El servidor no esta listo para manejar la petición. |

> Si quieren una lista completa de los códigos de respuesta, pueden visitar el siguiente enlace: https://developer.mozilla.org/es/docs/Web/HTTP/Status
>
> En cambio, si quieren algo más divertido, puede visitar éste otro: https://http.cat/

___

## Todo concluye al fin...

Bueno, nada de éste contenido fue inventado. No podría haberlo hecho sin una búsqueda previa. En algunos casos tomé información de canales de Youtube conocidos. Les recomiendo suscribirse y naveguen por el contenido que ofrecen. Son muy buenos y valen la pena mirarlos:

- [¿Qué es una API HTTP? | Como usar una API](https://www.youtube.com/watch?v=Nw07gG6lf54)
- [¿Estás seguro de qué es una API?](https://www.youtube.com/watch?v=3nssV6l3gHg)
- [¿Qué son las APIs y para qué sirven?](https://www.youtube.com/watch?v=u2Ms34GE14U)
- [Que es una API](https://www.youtube.com/watch?v=OqZbg1OIPBE)
- [¿Qué es una API? Explicado con manzanitas](https://www.youtube.com/watch?v=rq6gdwEbowU)
- [¿Qué es una api y para qué sirve?](https://www.youtube.com/watch?v=kNHhPvDpebg)
- [¿Qué es un API?](https://codigofacilito.com/articulos/que-es-api)

### ¿Con qué puedo seguir?

Un sitio bastante interesante a revisar es el siguiente: https://restfulapi.net/. De éste lugar se puede sacar muchos mas conceptos relacionado al desarrollo de APIs REST como por ejemplo:

- [REST Architectural Constraints](https://restfulapi.net/rest-architectural-constraints/)
- [HATEOAS Driven REST APIs](https://restfulapi.net/hateoas/)
- [Statelessness in REST APIs](https://restfulapi.net/statelessness/)
- [Richardson Maturity Model](https://restfulapi.net/richardson-maturity-model/)




