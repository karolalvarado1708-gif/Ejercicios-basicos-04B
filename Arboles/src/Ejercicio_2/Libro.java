package Ejercicio_2;

public class Libro {
    long isbn;
    String titulo;
    String autor;
    int anioPublicacion;

    Libro izquierda, derecha;

    public Libro(long isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        izquierda = derecha = null;
    }
}

