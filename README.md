#  Implementación y Pruebas de la Clase Impresora

Este proyecto consiste en crear una aplicación Java que implemente la clase Impresora y realice pruebas unitarias utilizando JUnit, conforme a las especificaciones de la tarea proporcionada. A continuación se detallan las acciones a realizar:

## Descripción del Proyecto

El proyecto incluye la creación de la clase Impresora con las siguientes propiedades y métodos:

- Propiedad `capacidadDelToner`: Indica la capacidad del tóner de la impresora en páginas.
- Propiedad `cantidadDeToner`: Indica la cantidad de páginas que quedan por imprimir.
- Constructor: Recibe la cantidad de páginas con la que se crea la impresora y establece la capacidad del tóner. Si se proporciona un número negativo, la capacidad del tóner será de 100 páginas.
- Método `imprime(cant)`: Recibe la cantidad de páginas a imprimir y actualiza la cantidad de tóner restante.
- Método `estadoDelToner()`: Devuelve un número entre 0 y 1 que representa el porcentaje de tóner que queda en la impresora.

## Pruebas Unitarias con JUnit

Se realizarán pruebas unitarias utilizando JUnit para verificar el comportamiento correcto de la clase Impresora. Las pruebas incluirán lo siguiente:

1. Verificación de que el constructor crea una impresora con la capacidad de tóner pasada como argumento, incluyendo casos de cantidad positiva y negativa.
2. Verificación de que el método `imprime(cant)` actualiza correctamente la cantidad de tóner que queda en la impresora.
3. Verificación de que el método `estadoDelToner()` devuelve correctamente un número entre 0 y 1 que representa el porcentaje de tóner restante.

## Documentación de Pruebas y Resultados

Se documentará la estrategia de pruebas utilizada, incluyendo capturas claras de la definición de la clase Impresora y de las pruebas realizadas con los resultados obtenidos.

## Requisitos Previos

- JDK (Java Development Kit) instalado en tu sistema.
- Conocimientos básicos de Java y JUnit.

## Preguntas Adicionales

### (RA8_d) Pruebas de Volumen y Estrés

Las pruebas de volumen y estrés nos permiten comprobar cómo se comporta una aplicación bajo cargas de trabajo extremas o con grandes volúmenes de datos. Utilizaríamos herramientas como JMeter o Gatling para llevar a cabo estas pruebas.

### (RA8_e) Pruebas de Seguridad

Las pruebas de seguridad nos garantizan que una aplicación es resistente a ataques y vulnerabilidades, como por ejemplo inyecciones SQL o ataques de denegación de servicio. Estas pruebas pueden realizarse utilizando herramientas especializadas de seguridad como OWASP ZAP.

### (RA8_f) Pruebas de Consumo de Recursos

Con las pruebas de consumo de recursos se verifica cómo una aplicación utiliza los recursos del sistema, como memoria o CPU. El objetivo es asegurarse de que la aplicación no tenga fugas de memoria o consuma recursos excesivos. Estas pruebas pueden realizarse utilizando herramientas de monitoreo de recursos como VisualVM o JConsole.

## Autor

Esta aplicación fue realizada por Jesús Tagua Camargo. Versión 1.0.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](https://opensource.org/licenses/MIT).
