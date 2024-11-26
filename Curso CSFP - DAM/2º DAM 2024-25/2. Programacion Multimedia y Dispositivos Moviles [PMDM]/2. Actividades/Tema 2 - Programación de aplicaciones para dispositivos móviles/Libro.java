import java.time.LocalDate;

public class Libro {
    private String ISBN;
    private String titulo;
    private String [] autor;
    private String genero;
    private String anyoPublicacion;
    private String editorial;

    public Libro() {}
    public Libro(String ISBN, String titulo, String [] autor, String genero, String anyoPublicacion, String editorial) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anyoPublicacion = anyoPublicacion;
        this.editorial = editorial;
    }

    public String getISBN() { return ISBN; }
    public String getTitulo() { return titulo; }
    public String[] getAutor() { return autor; }
    public String getGenero() { return genero; }
    public String getAnyoPublicacion() { return anyoPublicacion; }
    public String getEditorial() { return editorial; }

    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String [] autor) { this.autor = autor; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setAnyoPublicacion(String anyoPublicacion) { this.anyoPublicacion = anyoPublicacion; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public LocalDate getFechaNacAutor () {
        String [] fecha = this.autor[1].split("/");
        return LocalDate.of(Integer.parseInt(fecha[2]),
                            Integer.parseInt(fecha[1]),
                            Integer.parseInt(fecha[0]));
    }

    @Override
    public String toString() {
        return "\nLibro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", anyoPublicacion='" + anyoPublicacion + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
