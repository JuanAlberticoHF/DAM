# Clases JSON

- ``JSONObject``
- ``JSONArray``

## Leer JSON
Primero debemos leer el JSON utilizando un lector y guardándolo en una variable String.
### Leer un JSONObject
Se utiliza un **JSONObject** para leer los valores de las claves que advergue el JSON
```java
// Lectura de claves
JSONObject jsonObj = new JSONObject(<String>);
```
Métodos principales:
- `get(<key>)`: Devuelve un objeto de una clave
- `get<tipo>(<key>)`: Devuelve un valor con un tipo especifico de una clave
- `opt(<key>)`: Devuelve el valor de una clave y si no existe 0
- `has(<key>)`: *Booleano* que devuelve si existe una clave.
### Leer un JSONArray
Se utiliza **JSONArray** para guardar un Array de JSON de valores de **JSONObject**.
```java
JSONArray jsonArr = new JSONArray(<String>); // Lectura de un array
// Recorremos el array para tratar cada JSONObject
for (int i = 0; i < jsonArr.length(); i++)
{
	JSONObject jsonObj = jsonArr.getJSONObject(i)
}
```

#### Ejemplo JSON
```JSON fold title="Ejemplo"
{
	"grupos": [
		{
			"nombre": "Soda Stereo",
			"numero_de_discos": 7,
			"pagina_web": "https://www.sodastereo.com",
			"discos": [
				{
					"titulo": "Nada Personal",
					"anyo": 1985
				},
				{
					"titulo": "Sueño Stereo",
					"anyo": 1995
				},
				{
					"titulo": "Me Verás Volver",
					"anyo": 2007
				}
			]
		},
		{
			"nombre": "Héroes del Silencio",
			"numero_de_discos": 5,
			"pagina_web": "https://www.heroesdelsilencio.es",
			"discos": [
				{
					"titulo": "El Mar No Cesa",
					"anyo": 1988
				},
				{
					"titulo": "Senderos de Traición",
					"anyo": 1990
				},
			]
		}
	]
}
```
## Escribir JSON
Para escribir un JSON hay que determinar que vamos a guardar en el JSON. Los objetos JSON utilizan el sistema clave-valor, por lo que a la hora de usarlos utilizamos los siguientes métodos:
- `put(String <clave>, <valor>)`
- `putOpt(String <clave>, <valor>)`

Los procedimientos a la hora de recorrer un Array de JSON y el como esta estructurado es el mismo de la lectura. Una vez ya formado el JSON utilizamos un FileWriter para escribir en un fichero los datos.

