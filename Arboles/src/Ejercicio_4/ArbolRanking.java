package Ejercicio_4;

public class ArbolRanking {

    private Jugador raiz;

    public void insertar(int elo, String nombreUsuario,
                         String pais, int partidasJugadas) {

        raiz = insertarRec(raiz, elo, nombreUsuario,
                pais, partidasJugadas);
    }

    private Jugador insertarRec(Jugador nodo, int elo,
                                String nombreUsuario,
                                String pais,
                                int partidasJugadas) {

        if (nodo == null) {
            return new Jugador(elo, nombreUsuario,
                    pais, partidasJugadas);
        }

        if (elo < nodo.elo) {

            nodo.izquierda = insertarRec(
                    nodo.izquierda,
                    elo,
                    nombreUsuario,
                    pais,
                    partidasJugadas);

        } else if (elo > nodo.elo) {

            nodo.derecha = insertarRec(
                    nodo.derecha,
                    elo,
                    nombreUsuario,
                    pais,
                    partidasJugadas);
        }

        return nodo;
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(Jugador nodo) {

        if (nodo != null) {

            inOrdenRec(nodo.izquierda);

            System.out.println(
                    nodo.elo + " - " +
                    nodo.nombreUsuario + " - " +
                    nodo.pais);

            inOrdenRec(nodo.derecha);
        }
    }

    public Jugador buscar(int elo) {
        return buscarRec(raiz, elo);
    }

    private Jugador buscarRec(Jugador nodo, int elo) {

        if (nodo == null || nodo.elo == elo) {
            return nodo;
        }

        if (elo < nodo.elo) {
            return buscarRec(nodo.izquierda, elo);
        }

        return buscarRec(nodo.derecha, elo);
    }

    public void listarEnRango(int eloMin, int eloMax) {

        System.out.println(
                "\nJUGADORES ENTRE "
                + eloMin + " Y "
                + eloMax + " ELO\n");

        listarEnRangoRec(raiz, eloMin, eloMax);
    }

    private void listarEnRangoRec(
            Jugador nodo,
            int eloMin,
            int eloMax) {

        if (nodo == null) {
            return;
        }

        if (nodo.elo > eloMin) {
            listarEnRangoRec(
                    nodo.izquierda,
                    eloMin,
                    eloMax);
        }

        if (nodo.elo >= eloMin &&
            nodo.elo <= eloMax) {

            System.out.println(
                    nodo.elo + " - " +
                    nodo.nombreUsuario + " - " +
                    nodo.pais);
        }

        if (nodo.elo < eloMax) {
            listarEnRangoRec(
                    nodo.derecha,
                    eloMin,
                    eloMax);
        }
    }
}