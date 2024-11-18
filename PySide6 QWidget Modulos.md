# Índice

## 1. Widgets Básicos
- [QApplication](###QApplication)
- [QWidget](#qwidget)
- [QMainWindow](#qmainwindow)
- [QDialog](#qdialog)
- [QPushButton](#qpushbutton)
- [QLabel](#qlabel)
- [QLineEdit](#qlineedit)
- [QTextEdit](#qtextedit)

## 2. Selección y Entrada de Datos
- [QComboBox](#qcombobox)
- [QCheckBox](#qcheckbox)
- [QRadioButton](#qradiobutton)
- [QSlider](#qslider)
- [QSpinBox](#qspinbox)

## 3. Visualización de Datos
- [QTableWidget](#qtablewidget)
- [QTreeWidget](#qtreewidget)
- [QListWidget](#qlistwidget)
- [QGraphicsView](#qgraphicsview)

## 4. Organización y Diseño
- [QGridLayout](#qgridlayout)
- [QVBoxLayout](#qvboxlayout)
- [QHBoxLayout](#qhboxlayout)
- [QFormLayout](#qformlayout)
- [QSplitter](#qsplitter)
- [QStackedWidget](#qstackedwidget)
- [QGroupBox](#qgroupbox)

## 5. Barras y Menús
- [QToolBar](#qtoolbar)
- [QStatusBar](#qstatusbar)
- [QMenu](#qmenu)
- [QMenuBar](#qmenubar)

## 6. Otros Widgets
- [QFrame](#qframe)
- [QProgressBar](#qprogressbar)
- [QScrollBar](#qscrollbar)
- [QToolButton](#qtoolbutton)

---

### QApplication
- **Función:** Es el núcleo de toda aplicación GUI. Maneja la configuración inicial, el ciclo de eventos y el cierre.
- **Uso:** Se debe crear una única instancia antes de usar cualquier otro widget.
```python
from PySide6.QtWidgets import QApplication

app = QApplication([])  # Inicializa la aplicación
app.exec()  # Inicia el ciclo de eventos
```

---

### **QWidget**
- **Función:** Es la clase base para todos los widgets en PySide6. Proporciona la funcionalidad básica de una ventana o contenedor.
- **Uso:** Es la base para construir cualquier componente de la interfaz.
```python
from PySide6.QtWidgets import QWidget

window = QWidget()
window.setWindowTitle("Mi Ventana")
window.show()
```

---

### **QMainWindow**
- **Función:** Una ventana principal diseñada para albergar elementos como menús, barras de herramientas y barras de estado.
- **Uso:** Ideal para aplicaciones completas que necesitan una estructura robusta.
```python
from PySide6.QtWidgets import QMainWindow

main_window = QMainWindow()
main_window.setWindowTitle("Ventana Principal")
main_window.show()
```

---

### **QDialog**
- **Función:** Se usa para mostrar cuadros de diálogo (por ejemplo, cuadros de confirmación, formularios, etc.). Puede ser modal (bloquea la interacción con otras ventanas) o no modal.
- **Uso:** Ideal para capturar datos de entrada o mostrar mensajes.
```python
from PySide6.QtWidgets import QDialog

dialog = QDialog()
dialog.setWindowTitle("Diálogo")
dialog.exec()  # Muestra el diálogo de forma modal
```

---

### **QPushButton**
- **Función:** Representa un botón que se puede presionar para ejecutar una acción.
- **Uso:** Utilizado para disparar eventos específicos.
```python
from PySide6.QtWidgets import QPushButton

button = QPushButton("Haz clic")
button.clicked.connect(lambda: print("Botón presionado"))
button.show()
```

---

### **QLabel**
- **Función:** Muestra texto o imágenes estáticas, sin posibilidad de ser editadas.
- **Uso:** Perfecto para etiquetas, encabezados o mostrar imágenes.
```python
from PySide6.QtWidgets import QLabel

label = QLabel("Hola, mundo!")
label.show()
```

---

### **QLineEdit**
- **Función:** Proporciona un campo de entrada de texto de una sola línea.
- **Uso:** Ideal para capturar datos cortos como nombres o correos electrónicos.
```python
from PySide6.QtWidgets import QLineEdit

line_edit = QLineEdit()
line_edit.setPlaceholderText("Escribe aquí")
line_edit.show()
```

---

### **QTextEdit**
- **Función:** Permite la edición y visualización de texto multilínea con soporte para formato.
- **Uso:** Ideal para escribir notas o capturar textos largos.
```python
from PySide6.QtWidgets import QTextEdit

text_edit = QTextEdit()
text_edit.setPlaceholderText("Escribe texto aquí...")
text_edit.show()
```

---

### **QComboBox**
- **Función:** Un menú desplegable que permite seleccionar entre múltiples opciones.
- **Uso:** Útil para formularios o configuraciones.
```python
from PySide6.QtWidgets import QComboBox

combo = QComboBox()
combo.addItems(["Opción 1", "Opción 2", "Opción 3"])
combo.show()
```

---

### **QCheckBox**
- **Función:** Representa una casilla de verificación para opciones de selección múltiple.
- **Uso:** Se usa en formularios o para configurar múltiples opciones.
```python
from PySide6.QtWidgets import QCheckBox

checkbox = QCheckBox("Acepto los términos")
checkbox.show()
```

---

### **QRadioButton**
- **Función:** Permite la selección de una opción entre varias dentro de un grupo.
- **Uso:** Útil para elecciones exclusivas como género o tipo de plan.
```python
from PySide6.QtWidgets import QRadioButton

radio = QRadioButton("Opción única")
radio.show()
```

---

### **QSlider**
- **Función:** Representa un control deslizante para seleccionar valores dentro de un rango.
- **Uso:** Perfecto para configuraciones como volumen o brillo.
```python
from PySide6.QtWidgets import QSlider

slider = QSlider()
slider.setRange(0, 100)
slider.show()
```

---

### **QSpinBox**
- **Función:** Permite seleccionar valores numéricos mediante flechas hacia arriba y hacia abajo.
- **Uso:** Útil para seleccionar cantidades.
```python
from PySide6.QtWidgets import QSpinBox

spin_box = QSpinBox()
spin_box.setRange(0, 10)
spin_box.show()
```

---

### **QTableWidget**
- **Función:** Muestra datos en formato tabular con soporte para celdas editables.
- **Uso:** Ideal para mostrar datos estructurados.
```python
from PySide6.QtWidgets import QTableWidget

table = QTableWidget(3, 3)  # 3 filas, 3 columnas
table.show()
```

---

### **QTreeWidget**
- **Función:** Proporciona una representación jerárquica (en árbol) de datos.
- **Uso:** Útil para mostrar directorios o estructuras anidadas.
```python
from PySide6.QtWidgets import QTreeWidget

tree = QTreeWidget()
tree.setHeaderLabels(["Columna 1", "Columna 2"])
tree.show()
```

---

### **QListWidget**
- **Función:** Muestra una lista de elementos seleccionables.
- **Uso:** Perfecto para listas simples.
```python
from PySide6.QtWidgets import QListWidget

list_widget = QListWidget()
list_widget.addItems(["Elemento 1", "Elemento 2", "Elemento 3"])
list_widget.show()
```

---

### **QTabWidget**
- **Función:** Organiza widgets en pestañas.
- **Uso:** Ideal para aplicaciones con múltiples secciones.
```python
from PySide6.QtWidgets import QTabWidget, QWidget

tabs = QTabWidget()
tabs.addTab(QWidget(), "Pestaña 1")
tabs.addTab(QWidget(), "Pestaña 2")
tabs.show()
```

---

### **QToolBar**
- **Función:** Representa una barra de herramientas donde puedes añadir botones, acciones o widgets personalizados.
- **Uso:** Se utiliza en combinación con `QMainWindow` para proporcionar accesos rápidos a funciones comunes.
```python
from PySide6.QtWidgets import QMainWindow, QToolBar

main_window = QMainWindow()
toolbar = QToolBar("Mi Barra de Herramientas")
main_window.addToolBar(toolbar)
toolbar.addAction("Abrir")
toolbar.addAction("Guardar")
main_window.show()
```

---

### **QStatusBar**
- **Función:** Es una barra de estado ubicada en la parte inferior de una ventana principal (`QMainWindow`), utilizada para mostrar mensajes breves o indicadores de estado.
- **Uso:** Ideal para proporcionar información contextual al usuario.
```python
from PySide6.QtWidgets import QMainWindow, QStatusBar

main_window = QMainWindow()
status_bar = QStatusBar()
main_window.setStatusBar(status_bar)
status_bar.showMessage("Listo para empezar")
main_window.show()
```

---

### **QMenu**
- **Función:** Representa un menú desplegable que se utiliza dentro de una barra de menús (`QMenuBar`) o como un menú contextual.
- **Uso:** Útil para agrupar acciones relacionadas.
```python
from PySide6.QtWidgets import QMenu, QMainWindow

main_window = QMainWindow()
menu = QMenu("Archivo")
menu.addAction("Abrir")
menu.addAction("Guardar")
main_window.menuBar().addMenu(menu)
main_window.show()
```

---

### **QMenuBar**
- **Función:** Una barra de menús que contiene múltiples menús desplegables (`QMenu`).
- **Uso:** Proporciona una estructura organizada para las acciones de la aplicación.
```python
from PySide6.QtWidgets import QMainWindow

main_window = QMainWindow()
menu_bar = main_window.menuBar()
archivo_menu = menu_bar.addMenu("Archivo")
archivo_menu.addAction("Nuevo")
archivo_menu.addAction("Abrir")
main_window.show()
```

---

### **QGraphicsView**
- **Función:** Es un widget para mostrar escenas gráficas (gráficos vectoriales, texto, imágenes) renderizadas en 2D utilizando el motor gráfico de Qt.
- **Uso:** Ideal para representaciones gráficas complejas como diagramas o simulaciones.
```python
from PySide6.QtWidgets import QGraphicsView, QGraphicsScene

scene = QGraphicsScene()
scene.addText("Hola, gráficos 2D!")

view = QGraphicsView(scene)
view.show()
```

---

### **QFrame**
- **Función:** Un contenedor visual que incluye soporte para bordes, estilos y puede actuar como una separación entre widgets.
- **Uso:** Útil para organizar interfaces visualmente.
```python
from PySide6.QtWidgets import QFrame

frame = QFrame()
frame.setFrameShape(QFrame.Box)
frame.setFrameShadow(QFrame.Sunken)
frame.show()
```

---

### **QGridLayout**
- **Función:** Administra widgets en una cuadrícula, donde puedes especificar filas y columnas.
- **Uso:** Ideal para formularios y diseños alineados.
```python
from PySide6.QtWidgets import QWidget, QGridLayout, QLabel, QLineEdit

window = QWidget()
layout = QGridLayout()

layout.addWidget(QLabel("Nombre:"), 0, 0)
layout.addWidget(QLineEdit(), 0, 1)
layout.addWidget(QLabel("Correo:"), 1, 0)
layout.addWidget(QLineEdit(), 1, 1)

window.setLayout(layout)
window.show()
```

---

### **QVBoxLayout**
- **Función:** Organiza widgets en una pila vertical.
- **Uso:** Simple y útil para diseños apilados.
```python
from PySide6.QtWidgets import QWidget, QVBoxLayout, QPushButton

window = QWidget()
layout = QVBoxLayout()

layout.addWidget(QPushButton("Botón 1"))
layout.addWidget(QPushButton("Botón 2"))

window.setLayout(layout)
window.show()
```

---

### **QHBoxLayout**
- **Función:** Organiza widgets horizontalmente.
- **Uso:** Ideal para elementos colocados en línea.
```python
from PySide6.QtWidgets import QWidget, QHBoxLayout, QPushButton

window = QWidget()
layout = QHBoxLayout()

layout.addWidget(QPushButton("Izquierda"))
layout.addWidget(QPushButton("Derecha"))

window.setLayout(layout)
window.show()
```

---

### **QFormLayout**
- **Función:** Organiza widgets en un formato de formulario (etiqueta-campo).
- **Uso:** Ideal para crear formularios con campos de entrada alineados.
```python
from PySide6.QtWidgets import QWidget, QFormLayout, QLabel, QLineEdit

window = QWidget()
layout = QFormLayout()

layout.addRow("Nombre:", QLineEdit())
layout.addRow("Edad:", QLineEdit())

window.setLayout(layout)
window.show()
```

---

### **QSplitter**
- **Función:** Divide un área en varias secciones ajustables con barras deslizables.
- **Uso:** Ideal para aplicaciones con interfaces de paneles divididos.
```python
from PySide6.QtWidgets import QSplitter, QTextEdit

splitter = QSplitter()
splitter.addWidget(QTextEdit("Panel 1"))
splitter.addWidget(QTextEdit("Panel 2"))
splitter.show()
```

---

### **QGroupBox**
- **Función:** Un contenedor visual que agrupa widgets relacionados bajo un título.
- **Uso:** Útil para categorizar secciones en una interfaz.
```python
from PySide6.QtWidgets import QGroupBox, QVBoxLayout, QCheckBox, QWidget

group_box = QGroupBox("Opciones")
layout = QVBoxLayout()
layout.addWidget(QCheckBox("Opción 1"))
layout.addWidget(QCheckBox("Opción 2"))
group_box.setLayout(layout)

group_box.show()
```

---

### **QProgressBar**
- **Función:** Muestra el progreso de una operación en curso.
- **Uso:** Ideal para operaciones largas como descargas.
```python
from PySide6.QtWidgets import QProgressBar

progress_bar = QProgressBar()
progress_bar.setValue(50)  # Progreso al 50%
progress_bar.show()
```

---

### **QScrollBar**
- **Función:** Proporciona barras de desplazamiento para moverse vertical u horizontalmente por contenido grande.
- **Uso:** Complemento de interfaces que necesitan navegación.
```python
from PySide6.QtWidgets import QScrollBar

scroll_bar = QScrollBar()
scroll_bar.setMaximum(100)
scroll_bar.setValue(30)
scroll_bar.show()
```

---

### **QStackedWidget**
- **Función:** Administra múltiples widgets como si fueran capas apiladas, mostrando solo una a la vez.
- **Uso:** Ideal para implementar vistas como asistentes o navegaciones por pestañas.
```python
from PySide6.QtWidgets import QStackedWidget, QLabel

stack = QStackedWidget()
stack.addWidget(QLabel("Página 1"))
stack.addWidget(QLabel("Página 2"))
stack.setCurrentIndex(1)  # Muestra "Página 2"
stack.show()
```

---

### **QToolButton**
- **Función:** Representa un botón compacto, personalizable y diseñado para barras de herramientas.
- **Uso:** Perfecto para accesos rápidos en interfaces.
```python
from PySide6.QtWidgets import QToolButton

tool_button = QToolButton()
tool_button.setText("Herramienta")
tool_button.show()
```

---
