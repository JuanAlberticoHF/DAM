public class Disco {
    private String titulo;
    private int anyo;

    public Disco(String titulo, int anyo) {
        this.titulo = titulo;
        this.anyo = anyo;
    }

    public String getTitulo() { return titulo; }
    public int getAnyo() { return anyo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAnyo(int anyo) { this.anyo = anyo; }

    @Override
    public String toString() {
        return titulo + " [" + anyo + "]";
    }
}
