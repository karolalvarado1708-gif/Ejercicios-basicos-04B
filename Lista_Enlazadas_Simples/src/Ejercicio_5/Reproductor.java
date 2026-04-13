package Ejercicio_5;

public class Reproductor {

    private Cancion cabeza;
    private Cancion actual;

    public Reproductor() {
        cabeza = null;
        actual = null;
    }

    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Cancion aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nueva;
        }
    }

    public void agregarSiguiente(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (actual == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            nueva.siguiente = actual.siguiente;
            actual.siguiente = nueva;
        }
    }

    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Cancion aux = cabeza;
        int i = 1;

        while (aux != null) {
            System.out.println(i + "." + aux.titulo + " - " + aux.artista +
                    " | " + aux.duracionSegundos + "s | " + aux.genero);
            aux = aux.siguiente;
            i++;
        }
    }

    public String duracionTotal() {
        int totalSegundos = 0;
        Cancion aux = cabeza;

        while (aux != null) {
            totalSegundos += aux.duracionSegundos;
            aux = aux.siguiente;
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }
}
