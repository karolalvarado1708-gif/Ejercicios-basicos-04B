package Ejercicio_5;

public class Reproductor {

    Cancion cabeza;
    Cancion actual; 

    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Cancion temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
        }
    }

    public void agregarSiguiente(String titulo, String artista, int duracion, String genero) {
        if (actual == null) {
            System.out.println("No hay canción actual.");
            return;
        }

        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        nueva.siguiente = actual.siguiente;
        actual.siguiente = nueva;
    }

    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Cancion temp = cabeza;
        while (temp != null) {
            System.out.println("🎵 " + temp.titulo + " - " + temp.artista +
                               " (" + temp.duracionSegundos + "s)");
            temp = temp.siguiente;
        }
    }

    public void duracionTotal() {
        int total = 0;
        Cancion temp = cabeza;

        while (temp != null) {
            total += temp.duracionSegundos;
            temp = temp.siguiente;
        }

        int minutos = total / 60;
        int segundos = total % 60;

        System.out.println("\n Duración total: " +
                String.format("%02d:%02d", minutos, segundos));
    }
}
