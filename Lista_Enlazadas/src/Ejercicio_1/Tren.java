package Ejercicio_1;

public class Tren {
    
    Vagon inicio; 

    public Tren(){

        this.inicio = null;
    }
    public void agregarVagon(Vagon nuevoVagon) {

        if (inicio == null) {
            inicio = nuevoVagon;
    } else {
        Vagon actual = inicio;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
      }
        actual.siguiente = nuevoVagon;
    }
  }

    public double calcularPesoTotal() {
        double pesoTotal = 0.0;
        Vagon actual = inicio;

    while (actual != null) {
        pesoTotal += actual.pesoToneladas;
        actual = actual.siguiente;
    }

    return pesoTotal;
  }

}
