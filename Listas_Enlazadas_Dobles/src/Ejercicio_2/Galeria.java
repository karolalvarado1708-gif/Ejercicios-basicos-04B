package Ejercicio_2;

public class Galeria {

    Fotografia cabeza;
    Fotografia cola;

    public void agregarFoto(Fotografia nueva) {

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public Fotografia siguienteFoto(Fotografia actual) {

        if (actual.siguiente != null) {
            return actual.siguiente;
        } else {
            System.out.println("Ya estás en la última foto.");
            return actual;
        }
    }

    public Fotografia fotoAnterior(Fotografia actual) {

        if (actual.anterior != null) {
            return actual.anterior;
        } else {
            System.out.println("Ya estás en la primera foto.");
            return actual;
        }
    }

    public void reproducirGaleria() {

        Fotografia temp = cabeza;

        System.out.println("=== Recorrido hacia adelante ===");

        while (temp != null) {
            System.out.println("Foto: " + temp.nombreArchivo +
                    " | Tamaño: " + temp.tamanoMB +
                    "MB | Resolución: " + temp.resolucion);

            if (temp.siguiente == null) break;
            temp = temp.siguiente;
        }

        System.out.println("\n=== Recorrido hacia atrás ===");

        while (temp != null) {
            System.out.println("Foto: " + temp.nombreArchivo +
                    " | Tamaño: " + temp.tamanoMB +
                    "MB | Resolución: " + temp.resolucion);

            temp = temp.anterior;
        }
    }
}