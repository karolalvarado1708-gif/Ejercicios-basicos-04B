package Ejercicio_2;

public class Vagon {

    int id;
    String contenido;
    double pesoToneladas;

    Vagon siguiente;

    public Vagon(int id, String contenido, double pesoToneladas) {
        this.id = id;
        this.contenido = contenido;
        this.pesoToneladas = pesoToneladas;
        this.siguiente = null;
    }
}
