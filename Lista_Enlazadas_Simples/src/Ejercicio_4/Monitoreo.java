package Ejercicio_4;

public class Monitoreo {

    Lectura cabeza;

    public void agregarLectura(int idSensor, double temperatura, double presion, String hora) {
        Lectura nueva = new Lectura(idSensor, temperatura, presion, hora);

        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    public void mostrarLecturas() {
        if (cabeza == null) {
            System.out.println("No hay lecturas registradas.");
            return;
        }

        Lectura actual = cabeza;
        while (actual != null) {
            System.out.println("Sensor: " + actual.idSensor +
                               " | Temp: " + actual.temperatura +
                               " | Presión: " + actual.presion +
                               " | Hora: " + actual.hora);
            actual = actual.siguiente;
        }
    }

    public void temperaturaMaxima() {
        if (cabeza == null) {
            System.out.println("No hay lecturas.");
            return;
        }

        Lectura actual = cabeza;
        Lectura max = cabeza;

        while (actual != null) {
            if (actual.temperatura > max.temperatura) {
                max = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("\n Temperatura más alta registrada:");
        System.out.println("Sensor: " + max.idSensor +
                           " | Temp: " + max.temperatura +
                           " | Presión: " + max.presion +
                           " | Hora: " + max.hora);
    }
}

