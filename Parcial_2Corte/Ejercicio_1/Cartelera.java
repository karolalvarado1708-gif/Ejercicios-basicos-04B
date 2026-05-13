package Parcial_2Corte.Ejercicio_1;

public class Cartelera {

    Pelicula cabeza;

    public Cartelera() {
        this.cabeza = null;
    }

    public void agregarPelicula(Pelicula nuevaPelicula) {

        if (nuevaPelicula.duracion < 0) {
            System.out.println("duracion inválido");
            return;
        }

         if (buscarPelicula(nuevaPelicula.titulo) != null) {
            System.out.println("Pelicula duplicado");
            return;
        }

        if (cabeza == null) {
            cabeza = nuevaPelicula;
        } else {
            Pelicula actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaPelicula;
        }

        System.out.println("Pelicula agregado correctamente"); 
    }

    public Pelicula buscarPelicula(String titulo) {
        Pelicula actual = cabeza;

        while (actual != null) {
            if (actual.titulo == titulo) {
                return actual;
            }
            actual = actual.siguiente;
        }

        return null;
    }
    public void mostrarEstado() {
        Pelicula actual = cabeza;
        double total = 0;
        Pelicula tiempo = null;

        System.out.println("\n--- ESTADO DEL TREN ---");

        while (actual != null) {
            System.out.print("[Titulo: " + actual.titulo + " | " + actual.genero + " | " + actual.duracion + "t] -> ");

            total += actual.duracion;

            if (tiempo == null || actual.duracion > tiempo.duracion) {
                tiempo = actual;
            }

            actual = actual.siguiente;
        }

        System.out.println("NULL");
        System.out.println("Peso total: " + total + " toneladas");

        if (tiempo != null) {
            System.out.println("Eltiempo de la pelicula es: ID " + tiempo.duracion);
        }
    }


}
