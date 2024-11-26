Un RecyclerView es un control de tipo lista o tabla. Crea listas deslizables formadas a partir de otras vistas. Sustituye a ListView y GridView.

RecyclerView necesita de los siguientes componentes complementarios:
- RecyclerView.Adapter
- RecyclerView.ViewHolder
- LayoutManager

### Contruccion de un RecyclerView:
- [Layout RecyclerView](##Layout-RecyclerView)
- [ViewHolder](##ViewHolder)
- [Adaptador](##Adaptador)
- [RecyclerView MainActivity](##Declarar-RecyclerView-MainActivity)

## Layout RecyclerView
Declaramos en el XML nuestro RecyclerView:
```XML title="activity_main.xml"
<androidx.recyclerview.widget.RecyclerView
   android:id="@+id/idRecyclerView"
   android:layout_width="match_parent"
   android:layout_height="match_parent"/>
```
Definimos el layout que tendra cada elemento del RecyclerView
```XML title="ownlayout.xml"
<androidx.constraintlayout.widget.ConstraintLayout  
    xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    android:layout_width="match_parent"  
    android:layout_height="wrap_content">  
    
    <TextView  
        android:id="@+id/ownText"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Texto"/>
        
</androidx.constraintlayout.widget.ConstraintLayout>
```
## ViewHolder

La clase **ViewHolder** se utiliza para asignar/actualizar los datos de cada listado de una vista. Una vista agrupa un elemento de una lista, para el resto de elementos se reutiliza la vista y se sobreescriben los datos.

```Kotlin
import android.view.View  
import android.widget.TextView  
import androidx.recyclerview.widget.RecyclerView  
  
class OwnViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ownTextView: TextView = itemView.findViewById(R.id.ownText)
    // var ownEditText....
}
```
- `Inflar`: convertir un archivo XML (*ownlayout.xml*) en un objeto de vista (*View*)
- `itemView`: vista inflada que contiene los elementos del layout
## Adaptador
Declaramos la clase adaptador
```Kotlin
class OwnAdaptador(ownLista: MutableList<ownType>) : RecyclerView.Adapter<OwnViewHolder>() {  
    private var lista: MutableList<variable> = ownLista  
    // onCreateViewHolder ( )
    //
    // onBindViewHolder ( )
    //
    // getItemCount( )
}
```
### onCreateViewHolder( )
Se encarga de <u>crear y configurar</u> la vista que se va a utilizar en el **RecyclerView** para cada elemento. Devuelve un **ViewHolder** ya construido.
```Kotlin
override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OwnViewHolder {  
    // Inflar la vista de la fila  
    val view: View = LayoutInflater.from(parent.context).inflate(R.layout.ownlayout, parent, false)  
    // Crear el viewholder a partir de esta vista.  
    return OwnViewHolder(view)  
}
```
- `Inflar`: convertir un archivo XML (*ownlayout.xml*) en un objeto de vista (*View*)
### onBindViewHolder( )
```Kotlin
override fun onBindViewHolder(holder: OwnViewHolder, position: Int) {
	val ownLista = lista[position]
    holder.ownTextView.text = "data"
}
```

### getItemCount( )
Determina el tamaño de la lista
```Kotlin
override fun getItemCount(): Int {  
    return this.lista.size
}
```

#### Resultado Adaptador
```Kotlin
import android.view.LayoutInflater  
import android.view.View  
import android.view.ViewGroup  
import androidx.recyclerview.widget.RecyclerView

class OwnAdaptador(ownLista: MutableList<ownType>) : RecyclerView.Adapter<OwnViewHolder>() {  
	private var lista: MutableList<variable> = ownLista  

	// onCreateViewHolder
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OwnViewHolder {  
	    val view: View = LayoutInflater.from(parent.context).inflate(R.layout.ownlayout, parent, false)    
	    return OwnViewHolder(view)  
	}
    // onBindViewHolder
    override fun onBindViewHolder(holder: OwnViewHolder, position: Int) {
		val ownLista = lista[position]
	    holder.ownTextView.text = "data"
	}
    // getItemCount
    override fun getItemCount(): Int {  
	    return this.lista.size
	}
}
```
## Declarar RecyclerView MainActivity

```Kotlin
class MainActivity : AppCompatActivity() {  
    private lateinit var ownRecyclerViewww: RecyclerView  

    override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContentView(R.layout.activity_main)  

        ownRecyclerViewww = findViewById(R.id.idRecyclerView)  
        ownRecyclerViewww.layoutManager = LinearLayoutManager(this)

        val ownlista = ArrayList<variable>()
        val adaptadorRecyclerView = OwnAdaptador(ownlista)  

        ownRecyclerViewww.setAdapter(adaptadorRecyclerView)  
    }
}
```