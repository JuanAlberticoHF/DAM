# 1. Interfaces de usuario
Sistema definido por la forma en el que los usuarios interactúan con los componentes del sistemas.
- Tipos de Interfaces: Hardware (Teclado, Ratón,...) y Software (GUI,...)
## 1.1 Diseño centrado en el usuario
El diseño de interfaces se rige por el llamado diseño centrado en el usuario, centrado en las características y necesidades de las personas usando el producto.

![](https://github.com/JuanAlberticoHF/DAM-23-25/blob/main/Temario/Pasted%20image%2020241107220349.png)

- `Análisis del contexto de uso`: tareas a realizar y particularidades de los usuario como del entorno
- `Detallar los requisitos`: especificar los requisitos que tiene que cumplir
- `Diseñar soluciones`: Diseño de prototipos, analizando su evolución.
- `Evaluar con los usuarios`: Hacer que los usuarios en las primeras versiones evalúen el diseño.
## Evolución de las interfaces de usuario
Las interfaces de usuario han evolucionado con el tiempo, desarrollándose 3 tipos:

| **CLI**                                                                                | **GUI**                                                                                                     | **NUI**                                                                                  |
| -------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| - Interfaz de comandos<br>- Conocimientos sintacticos<br>- Ordenes por líneas de texto | - Interfaz graficas de usuario<br>- Mas atractivo para el usuario<br>- Ordenes a traves de objetos graficos | - Interfaces naturales<br>- Interacción directa<br>- Ordenes de voz, táctil o movimiento |

# 2. Usabilidad
Consiste en facilidad de uso para realizar una tarea concreta.
## 2.1 Componentes de la usabilidad
La usabilidad de un producto o sistema esta formada por cinco componentes:
- `A. Aprendizaje`: Facilidad de aprendizaje (mas uso = mas facil) a través de estándares.
- `B. Eficiencia`:  Hacer del uso lo mas rapido y sencillo posible.
- `C. Recuerdo`: poder recordar con facilidad despues de un periodo de ausencia.
- `D. Errores`: Tolerar errores y en el caso informar adecuadamente al usuario para denunciarlo
- `E. Satisfaccion`: Uso agradable y sensación positiva.  

![](https://github.com/JuanAlberticoHF/DAM-23-25/blob/main/Temario/Pasted%20image%2020241107221910.png)

## 2.2 Evaluación de la usabilidad
Es muy importante evaluar la usabilidad de cara al diseño centrado en el usuario, validándolo con ellos mismos aportando para mejorar la solucion final. La evaulacion tiene tres objetivos:
- Identificar problemas del diseño
- Descubrir mejorar no esperadas
- Aprender de las preferencias de nuestros usuarios
### A. ¿Qué debemos evaluar?
Junto a un grupo de usuarios, se realizan sesiones de evaluación de la usabilidad se estudian base a tareas realistas el como podrían trabajar con la aplicación. Las tareas tienes que ser especificas y con un resultado abierto, sin dirigir excesivamente al usuario para una mejor evaluación. Las tareas planteadas pueden variar según el proceso a medir, distinguido en dos tipos de métricas:

- `Cualitativas`: Valoraciones subjetivas y de comportamiento durante la prueba, siendo importante en primeras fases.
- `Cuantitativas`: Evalúa cantidades en el uso, como el tiempo de las tareas, numero de tareas, etc. Estas normalmente se evalúan al final del desarrollo
### B. ¿Quién participa en la ecuación?
- `Moderador`: Encargado de guiar a los usuarios en las sesiones de evaluación, resolución de dudas, recomendando alguien exterior al equipo.
- `Usuarios`: De tipo potencial para el producto que estamos diseñando, recomendando alrededor de 5 usuarios en cada evaluación.
### C. ¿Cómo se lleva a cabo la evaluación?

- `Presencial`: Todos en un entorno físico. Notas y grabaciones durante la sesión.
- `Remota`: Todos en lugares diferentes, menos costosas, y mas cómodos para los usuarios. Estas evaluaciones tiene dos tipos:
	- `Moderadas`: Monitorización de la sesión (transmisión de pantalla)
	- `No moderadas`: Software especializado para evaluar la usabilidad.
## 2.3 Experiencia de usuario
El concepto de experiencia de usuario o UX hace referencia a la experiencia del usuario en relacion con el producto, una buena experiencia da como resultado una opinion positiva.

![](https://github.com/JuanAlberticoHF/DAM-23-25/blob/main/Temario/Pasted%20image%2020241108081610.png)

En resumen, conseguir una buena experiencia de usuario comienza cuando un producto o servicio es útil.
## Heurísticas de usabilidad
Jakob Nielsen propuso 10 heurísticas para el diseño de interfaces basándose en su experiencia personal.
- `Visibilidad del estado del sistema`: Informar sobre el estado de la aplicación.
- `Relacion entre el sistema y el mundo real`: Utilizar componentes fáciles de relacionar para una interfaz mas familiar.
- `Dar libertad y control al usuario`: El usuario debe tener libertad, incluso de corregir errores.
- `Consistencia y estandares`: Diseño estandarizado para similitudes con otros productos.
- `Prevencion de errores`: La interfaz tiene que estar hecha para que ayudar al usuario a no cometer errores, viendo patrones para solucionarlos cuando surjan.
- `Reconocer en lugar de recordar`: Minimizar el esfuerzo de memoria facilitando la información.
- `Flexibilidad y eficiencia de uso`:  Diferentes formas de hacer las cosas apto para todos los usuarios.
- `Estetica y diseño minimalista`: La interfaz debe ser útil evitando elementos decorativos.
- `Ayudar con los errores`: Frente a errores se informara al usuario evitando términos técnicos y ofreciendo soluciones.
- `Documentacion y ayudas`: Ofrecer documentación y ayuda para resolver dudas del usuario.
# 3. Pautas de diseño

La interfaz de usuario debe ser diseñado teniendo al usuario en mente y enfocar la aplicación una experiencia global. Para ello, hay que conocer pautas y recomendaciones existentes que nos ayudan a conseguir un diseño exitoso. Estas pautas se organizan en los siguientes niveles:

![](https://github.com/JuanAlberticoHF/DAM-23-25/blob/main/Temario/Pasted%20image%2020241108083439.png)
Algunas organizaciones elaborar sus propios estándares que pueden incluir aspectos como tipografía o colores, como tambien guías para el diseño de las aplicaciones internas.
## 3.1 Estructura de la interfaz
### A. Principios de diseño
A la hora de estructurar y organizar los elementos que forma la interfaz hay que tener en cuenta los siguientes principios:
- `Contraste`: Utilizar contraste de colores y tamaños para organizar la información.
- `Jerarquia`: Agrupar los elementos ordenándolos según su importancia. Entre ellos:
	- `Proximidad`: Crear una relacion entre distintos elementos próximos, y relacionar los alejados con funciones diferentes.
	- `Alineacion`: Una correcta alineación ayuda al usuario a procesar la información y guiarse mas fácilmente por la interfaz, evitando errores y sobreesfuerzos.
### B. Menús, Menús Contextuales y Barras de Herramientas

Gran parte de las interfaces tienen menú y barras de herramientas usar las funcionalidades con mas facilidad. Las pautas mas importantes relacionadas con cada caso son:
#### Menús
- Si el menú tiene pocas opciones, considerar otra alternativa. Si tiene muchas opciones se deberia reorganizar las opciones para reducirlas.
- Simplificar la estructura de menús y submenús. Para escenarios mas complejos buscar otras opciones.
- Las etiquetas deben ser lo mas simples posibles.
- Si un acción abre una ventana debe terminar en puntos suspensivos (*Guardar como...*)
#### Menús Contextuales
- A través de atajos y interacciones desplegar menús y mostrar un conjunto de opciones.
- Las opciones deben estar disponibles tambien desde el menú principal.
- Ordenar las opciones de mayor a menor importancia.
- Evitar el uso de submenús.
#### Barras de Herramientas
- Mostrar las herramientas mas usadas en el menú, incluyendo personalizar este mismo.
- Poder ocultar menús y acceder a ellos en otros contextos.
- Iconos consistentes con los usuarios y adivinar la función base a su representación.

## 3.2 Controles
Son componentes básicos con lo que construimos la interfaz grafica. La siguiente tabla recoge información y pautas de cada uno de los controles:
![](https://github.com/JuanAlberticoHF/DAM-23-25/blob/main/Temario/Pasted%20image%2020241108085818.png)
![](https://github.com/JuanAlberticoHF/DAM-23-25/blob/main/Temario/Pasted%20image%2020241108085828.png)
## Aspecto visual
Hay que seguir unas pautas de diseño importantes relacionadas al aspecto visual:
### A. Color
- Se utilizar para comunicar algo al usuario, evitando el uso estético.
- Nunca referenciar un elemento por su color.
- Relacionar el color con un significado.
- Los colores deben contrastar de forma adecuada.
### B. Texto
- Utilizar fuentes predeterminadas.
- Utilizar los tamaños del texto para establecer una jerarquía en la interfaz.
- Utilizar las propiedades del texto de forma consistente (negrita, cursiva, subrayado,...)
### C. Iconos
- No utilizar etiquetas e iconos a la vez.
- Utilizar iconos identificables dependiendo de la acción a realizar.
- Los iconos utilizados puedes ser reconocibles dependiendo del contexto de utilización.
- Adaptar el estilo visual de los iconos de cada plataforma. Se suele utilizar iconos simples.

## 3.4 Mensajes al usuario
A veces se necesitan mostrar mensajes al usuario dependiendo del propósito, como puede ser mensajes de confirmación, error o advertencia y las notificaciones. Se recomienda lo siguiente:
- Avisar al usuario en acciones irreversibles.
- Evitar interrumpir con mensajes no importantes.
- Utilizar un lenguaje cercano al usuario evitando tecnicismos.
- La forma de mostrar los mensajes debe ser respetuoso con el usuario.
