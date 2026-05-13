package Ejercicio_1;

public class Estacion {

    String nombre;
    Estacion siguiente;
    Estacion anterior;

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
    }
}