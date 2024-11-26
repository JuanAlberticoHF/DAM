package org.JuanAlberticoHF;

public class Grupo {
    private String nombre;
    private int numDiscos;
    private String paginaWeb;
    private Disco [] discos;

    public Grupo(String nombre, int numDiscos, String paginaWeb) {
        this.nombre = nombre;
        this.numDiscos = numDiscos;
        this.paginaWeb = paginaWeb;
        this.discos = null;
    }
    public Grupo(String nombre, int numDiscos, String paginaWeb, Disco[] discos) {
        this.nombre = nombre;
        this.numDiscos = numDiscos;
        this.paginaWeb = paginaWeb;
        this.discos = discos;
    }

    public String getNombre() { return nombre; }
    public int getNumDiscos() { return numDiscos; }
    public String getPaginaWeb() { return paginaWeb; }
    public Disco[] getDiscos() { return discos; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNumDiscos(int numDiscos) { this.numDiscos = numDiscos; }
    public void setPaginaWeb(String paginaWeb) { this.paginaWeb = paginaWeb; }
    public void setDiscos(Disco[] discos) { this.discos = discos; }

    @Override
    public String toString() {
        String toString = "\nGrupo {"
                    + "\n\tNombre: "+this.getNombre()
                    + "\n\tNúmero de discos: "+this.getNumDiscos()
                    + "\n\tPágina web: "+this.getPaginaWeb();
        if (this.getDiscos() != null) {
            toString += "\n\tDiscos:";
            for (Disco disco : this.getDiscos()) {
                toString += "\n\t|\t"+disco.toString();
            }
        }
        toString = toString + "\n}";
        return toString;
    }
}
