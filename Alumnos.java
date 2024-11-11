import java.io.Serializable;
import java.time.LocalDate;

public class AlumnoS implements Serializable {
    private final int nre;
    private String nombre;
    private String apellidos;
    private int telefeno;
    private LocalDate fechaNacimiento;
    private boolean beca;
    /**
     * Constructores
     */
    public AlumnoS(int nre, String nombre, String apellidos, int telefeno, LocalDate fechaNacimiento, boolean beca) {
        this.nre = nre;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefeno = telefeno;
        this.fechaNacimiento = fechaNacimiento;
        this.beca = beca;
    }
    public AlumnoS(String alumnoString) {
        String [] datosAlumnos = alumnoString.split(",");
        if (datosAlumnos.length == 6) {
            this.nre = Integer.parseInt(datosAlumnos[0]);
            this.nombre = datosAlumnos[1];
            this.apellidos = datosAlumnos[2];
            this.telefeno = Integer.parseInt(datosAlumnos[3]);
            this.fechaNacimiento = LocalDate.parse(datosAlumnos[4]);
            this.beca = Boolean.parseBoolean(datosAlumnos[5]);
        } else {
            throw new RuntimeException("Error en la sintaxis del alumno");
        }
    }
    public AlumnoS(int nre) {
        this.nre = nre;
    }
    /**
     * Getters y Setters
     */
    public int getNre() { return nre; }
    public String getNombre() { return nombre; }
    public String getApellidos() {return apellidos;}
    public int getTelefeno() {return telefeno;}
    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public boolean isBeca() {return beca;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setTelefeno(int telefeno) {this.telefeno = telefeno;}
    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public void setBeca(boolean beca) {this.beca = beca;}
    /**
     * ToString
     */
    @Override
    public String toString() {
        return "AlumnoS{" +
                "nre=" + nre +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefeno=" + telefeno +
                ", fechaNacimiento=" + fechaNacimiento +
                ", beca=" + beca +
                '}';
    }
    /**
     * Equals y HashCode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlumnoS alumnoS = (AlumnoS) o;
        return nre == alumnoS.nre;
    }
    @Override
    public int hashCode() {
        return nre;
    }
    /**
     * Metodo para obtener los datos del alumno en formato String
     */
    public String datosFormateados () {
        return nre + "," + nombre + "," + apellidos + "," + telefeno + "," + fechaNacimiento + "," + beca;
    }
}
