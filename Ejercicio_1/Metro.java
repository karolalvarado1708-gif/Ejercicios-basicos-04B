package Ejercicio_1;

public class Metro {

    Estacion cabeza;
    Estacion cola;

    public Metro() {
        cabeza = null;
        cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarEstacion(String nombre) {

        Estacion nueva = new Estacion(nombre);

        if (estaVacia()) {
            cabeza = nueva;
            cola = nueva;

            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;

        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;

            cola = nueva;
        }

        System.out.println("Estación agregada.");
    }

    public void mostrarIda() {
        if (estaVacia()) {
            System.out.println("No hay estaciones.");
            return;
        }

        Estacion actual = cabeza;

        System.out.println("\n--- RUTA IDA ---");

        do {
            System.out.print(actual.nombre + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("(vuelve al inicio)");
    }

    public void mostrarRegreso() {
        if (estaVacia()) {
            System.out.println("No hay estaciones.");
            return;
        }

        Estacion actual = cola;

        System.out.println("\n--- RUTA REGRESO ---");

        do {
            System.out.print(actual.nombre + " -> ");
            actual = actual.anterior;
        } while (actual != cola);

        System.out.println("(vuelve al inicio)");
    }

    public void consultarEstacion(String nombre) {
        if (estaVacia()) {
            System.out.println("No hay estaciones.");
            return;
        }

        Estacion actual = cabeza;

        do {
            if (actual.nombre.equalsIgnoreCase(nombre)) {
                System.out.println("\nEstación actual: " + actual.nombre);
                System.out.println("Anterior: " + actual.anterior.nombre);
                System.out.println("Siguiente: " + actual.siguiente.nombre);
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("Estación no encontrada.");
    }

    public void eliminarEstacion(String nombre) {
        if (estaVacia()) {
            System.out.println("No hay estaciones.");
            return;
        }

        Estacion actual = cabeza;

        do {
            if (actual.nombre.equalsIgnoreCase(nombre)) {

                if (cabeza == cola) {
                    cabeza = null;
                    cola = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;

                    if (actual == cabeza) {
                        cabeza = actual.siguiente;
                    }

                    if (actual == cola) {
                        cola = actual.anterior;
                    }
                }

                System.out.println("Estación eliminada.");
                return;
            }

            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("Estación no encontrada.");
    }
}