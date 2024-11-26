Un **RecyclerView** es un control de tipo lista o tabla. Crea listas deslizables formadas a partir de otras vistas y sustituye a **ListView** y **GridView**.

RecyclerView necesita los siguientes componentes complementarios:

- **RecyclerView.Adapter**
- **RecyclerView.ViewHolder**
- **LayoutManager**

---

### Construcción de un RecyclerView:

- [Layout RecyclerView](##Layout%20RecyclerView)
- [ViewHolder](##ViewHolder)
- [Adaptador](##Adaptador)
- [RecyclerView en MainActivity](##Declarar%20RecyclerView%20en%20MainActivity)

## Layout RecyclerView

Declaramos en el XML nuestro RecyclerView:

```xml
<androidx.recyclerview.widget.RecyclerView
    android:id="@+id/idRecyclerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

Definimos el layout que tendrá cada elemento del RecyclerView:

```xml
<androidx.constraintlayout.widget.ConstraintLayout  
    xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    android:layout_width="match_parent"  
    android:layout_height="wrap_content">  
    
    <TextView  
        android:id="@+id/ownText"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:text="Texto" />
        
</androidx.constraintlayout.widget.ConstraintLayout>
```
## ViewHolder

La clase **ViewHolder** se utiliza para asignar/actualizar los datos de cada listado de una vista. Una vista agrupa un elemento de una lista; para el resto de elementos, se reutiliza la vista y se sobreescriben los datos.

```kotlin
import android.view.View  
import android.widget.TextView  
import androidx.recyclerview.widget.RecyclerView  
  
class OwnViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {  
    val ownTextView: TextView = itemView.findViewById(R.id.ownText)  
}
```

- **Inflar**: convertir un archivo XML (_ownlayout.xml_) en un objeto de vista (_View_).
- **itemView**: vista inflada que contiene los elementos del layout.
## Adaptador

Declaramos la clase adaptador:

```kotlin
class OwnAdaptador(ownLista: MutableList<OwnType>) : RecyclerView.Adapter<OwnViewHolder>() {  
    private var lista: MutableList<OwnType> = ownLista  

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OwnViewHolder {  
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.ownlayout, parent, false)  
        return OwnViewHolder(view)  
    }

    override fun onBindViewHolder(holder: OwnViewHolder, position: Int) {  
        val item = lista[position]  
        holder.ownTextView.text = item.toString()  
    }

    override fun getItemCount(): Int {  
        return lista.size  
    }
}
```
## Declarar RecyclerView en MainActivity

```kotlin
class MainActivity : AppCompatActivity() {  
    private lateinit var ownRecyclerView: RecyclerView  
    
    override fun onCreate(savedInstanceState: Bundle?) {  
        super.onCreate(savedInstanceState)  
        setContentView(R.layout.activity_main)  
        
        ownRecyclerView = findViewById(R.id.idRecyclerView)  
        ownRecyclerView.layoutManager = LinearLayoutManager(this)  
        
        val ownLista = mutableListOf<OwnType>()  
        val adaptadorRecyclerView = OwnAdaptador(ownLista)  
        
        ownRecyclerView.adapter = adaptadorRecyclerView  
    }
}
```