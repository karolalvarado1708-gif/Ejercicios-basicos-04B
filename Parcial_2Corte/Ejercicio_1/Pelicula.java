package Parcial_2Corte.Ejercicio_1;

public class Pelicula {

    String titulo;
    String genero;
    double duracion;
    Pelicula siguiente;

    public Pelicula(String titulo, String genero, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.siguiente = null;
    }
}

