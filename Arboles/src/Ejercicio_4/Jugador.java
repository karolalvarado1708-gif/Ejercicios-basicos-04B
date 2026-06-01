package Ejercicio_4;

public class Jugador {

    int elo;
    String nombreUsuario;
    String pais;
    int partidasJugadas;

    Jugador izquierda;
    Jugador derecha;

    public Jugador(int elo, String nombreUsuario,
                   String pais, int partidasJugadas) {

        this.elo = elo;
        this.nombreUsuario = nombreUsuario;
        this.pais = pais;
        this.partidasJugadas = partidasJugadas;

        izquierda = null;
        derecha = null;
    }
}