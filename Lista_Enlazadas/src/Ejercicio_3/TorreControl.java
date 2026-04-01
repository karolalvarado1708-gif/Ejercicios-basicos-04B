package Ejercicio_3;

public class TorreControl {

    Vuelo cabeza;


    public void agregarVuelo(String numeroVuelo, String aerolinea, int combustible, int pasajeros) {
        Vuelo nuevo = new Vuelo(numeroVuelo, aerolinea, combustible, pasajeros);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vuelo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrarCola() {
        if (cabeza == null) {
            System.out.println("No hay vuelos en la cola.");
            return;
        }

        Vuelo actual = cabeza;
        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo +
                               " | Aerolínea: " + actual.aerolinea +
                               " | Combustible: " + actual.combustibleRestante +
                               " | Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }

    public void reportarEmergencia(String numeroVuelo) {

        if (cabeza == null) {
            System.out.println("No hay vuelos en la cola.");
            return;
        }

        if (cabeza.numeroVuelo.equals(numeroVuelo)) {
            System.out.println("El vuelo ya está en prioridad.");
            return;
        }

        Vuelo anterior = null;
        Vuelo actual = cabeza;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Vuelo no encontrado.");
            return;
        }

        if (actual.combustibleRestante >= 10) {
            System.out.println("El vuelo no está en emergencia.");
            return;
        }

        anterior.siguiente = actual.siguiente;

        actual.siguiente = cabeza;
        cabeza = actual;

        System.out.println(" Vuelo movido a prioridad de aterrizaje");
    }
}