## Leer XML
Para leer un XML en Java necesitamos extraer la información del DOM y guardarlo en un objeto `Document`. Para ello utilizamos el siguiente método:
### Obtener DOM XML
```java
public static Document obtenerDOM (String rutaArchivo)
			throws IOException, SAXException, ParserConfigurationException 
{  
    File f = new File(rutaArchivo);
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();
    Document doc = db.parse(f);
    doc.getDocumentElement().normalize();
    return doc;
}
```
### Obtener Nodo Padre
Ya teniendo el DOM, obtenemos del nodo raíz la lista de nodos hijos (el 2 en la jerarquía) utilizando el siguiente método:
```java
public static NodeList obtenerListaNodos(Document doc, String nodoPadre)
{  
    return doc.getElementsByTagName(nodoPadre);  
}
```
### Leer cada elemento *(En caso de ser mas de 1)*
Ahora, para leer cada elemento utilizamos un bucle que recorra la longitud de la lista de nodos usando `listaNodos.item(i)` y guardando el nodo en un objeto `Node`. Después a través de un condicional comprobamos que el nodo tenga el tipo `Node.ELEMENT_NODE`, si cumple la condición casteamos el nodo a Elemento.
``` java
Document doc = obtenerDOM(rutaArchivo);  
NodeList listaNodos = obtenerListaNodos(doc, "nodosHijo");  
for (int i = 0; i < listaNodos.getLength(); i++) 
{
    Node nodo = listaNodos.item(i)
    if (nodo.getNodeType() == Node.ELEMENT_NODE)
    {  
        Element elemento = (Element) nodo;
        // Obtener el valor de una etiqueta
        var = elemento.getElementsByTagName("<elementName>").item(0).getTextContent();
		
        // En el caso de tener un elemento con mas elementos
        Element elementoConHijos = (Element) elemento.getElementsByTagName("<elementName>").item(0);
        var = elementoConHijos.getElementsByTagName("<subElementName>").item(0).getTextContent();
    }
}
```
## Escribir XML
Para escribir un fichero XML debemos crear el **DOM**, asignar el **DOM** a un **Document**, asignamos los datos al **Document** y por ultimo copiamos el **DOM** en un fichero XML.

### Creación DOM

```java
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
DocumentBuilder db = null;  
try {  
    db = dbf.newDocumentBuilder();  
} catch (Exception e) {  
    System.err.println("Error al crear el DocumentBuilder");  
}  
DOMImplementation di = db.getDOMImplementation();  
```

### Creación Document
Creamos el `Document` asignándole la estructura del DOM que advergara la estructura XML:
```java 
Document doc = di.createDocument(null, "<raiz>", null);  
doc.setXmlVersion("1.0");
```

### Construcción estructura de datos XML
A la hora de escribir un documento hay que tener en cuenta la jerarquía en la que va a estar constituida la estructura del XML.
```java
// Creacion un elemento que estara atado a a un padre
Element element = doc.createElement("<elemento>");
doc.getDocumentElement().appendChild(element); // En este caso al raiz

// Creacion un elemento con valor
Element elementInfo = doc.createElement("<elementoInfo>");
elementInfo.appendChild(doc.createTextNode("valor"));
element.appendChild(elementInfo);
```

### Escribir XML
Cuando hayamos construido la estructura y asignado los datos, escribimos en un fichero al archivo utilizando el método `copiarDomFichero` que tiene todo lo necesario para escribir el XML:
```java
public static void copiarDomFichero (String rutaFichero, Document doc)
{  
    File f = new File(rutaFichero);  
    try {  
        Transformer tr = TransformerFactory.newInstance().newTransformer();  
        StreamResult sr = new StreamResult(f);  
        DOMSource domSource = new DOMSource(doc);  
        tr.transform(domSource, sr);  
    } catch (TransformerConfigurationException ex) {  
        System.out.println("Error 4:"+ex.getMessage());  
    } catch (TransformerException ex) {  
        System.out.println("Error 5:"+ex.getMessage());  
    }
}
```

#### Ejemplo de XML
Los pasos para la escritura del XML son genéricos, por lo que para obtener un resultado coherente remplazamos las variables y nombres de elementos por los siguientes:
- `<raiz>` = **"personas"**
- `<elemento>` = **"persona"**
- `<elementoInfo>` = **"nombre"**
- `<valor>`  = **"Juan"**

```XML title="Resultado"
<personas>
	<persona>
		<nombre>Juan</nombre>
	</persona>
</personas>
```
