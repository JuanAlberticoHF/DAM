import java.util.Arrays;

public class Jugador{
    private String nombre;
    private String equipo;
    private String posicion;
    private int edad;
    private String nacionalidad;
    private Integer [] estadisticas = new Integer[4]; // Goles-Asistencias-PorteriasEncajadas-Paradas

    public Jugador() {
    }
    public Jugador(String nombre, String equipo, String posicion, int edad, String nacionalidad, Integer[] estadisticas) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.estadisticas = estadisticas;
    }

    public String getNombre() { return nombre; }
    public String getEquipo() { return equipo; }
    public String getPosicion() { return posicion; }
    public int getEdad() { return edad; }
    public String getNacionalidad() { return nacionalidad; }
    public Integer[] getEstadisticas() { return estadisticas; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEquipo(String equipo) { this.equipo = equipo; }
    public void setPosicion(String posicion) { this.posicion = posicion; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public void setEstadisticas(Integer[] estadisticas) { this.estadisticas = estadisticas; }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", posicion='" + posicion + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", estadisticas=" + Arrays.toString(estadisticas) +
                '}';
    }
}
