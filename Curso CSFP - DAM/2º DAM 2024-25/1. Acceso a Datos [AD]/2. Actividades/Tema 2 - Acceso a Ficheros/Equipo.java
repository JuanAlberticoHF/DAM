import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public Equipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public String getNombreEquipo() { return nombreEquipo; }
    public ArrayList<Jugador> getJugadores() { return jugadores; }

    public void setJugadores(ArrayList<Jugador> jugadores) { this.jugadores = jugadores; }
    public void setNombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
        jugadores.sort(new CompararNombreJug());
    }
    public void removeJugador(Jugador jugador) { jugadores.remove(jugador); }
}
