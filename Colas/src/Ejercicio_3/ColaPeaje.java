package Colas.src.Ejercicio_3;

public class ColaPeaje {

    private Vehiculo frente;
    private Vehiculo fin;

    public ColaPeaje() {

        frente = null;
        fin = null;
    }

    public void enqueue(Vehiculo vehiculo) {

        if (frente == null) {

            frente = vehiculo;
            fin = vehiculo;

        } else {

            fin.siguiente = vehiculo;
            fin = vehiculo;
        }
    }

    public Vehiculo dequeue() {

        if (frente == null) {

            return null;
        }

        Vehiculo eliminado = frente;
        frente = frente.siguiente;

        if (frente == null) {

            fin = null;
        }

        return eliminado;
    }

    public void imprimir() {

        if (frente == null) {

            System.out.println("No hay vehículos en cola.");
            return;
        }

        Vehiculo actual = frente;

        while (actual != null) {

            System.out.println("----------------------");
            System.out.println(actual);

            actual = actual.siguiente;
        }
    }

    public void cerrarTurno() {

        double totalRecaudado = 0;

        System.out.println("\n=== CERRANDO TURNO ===");

        while (frente != null) {

            Vehiculo vehiculo = dequeue();

            System.out.println("\nProcesando vehículo:");
            System.out.println(vehiculo);

            if (!vehiculo.esExento) {

                totalRecaudado += vehiculo.tarifa;
            }
        }

        System.out.println("\nTotal recaudado: $" + totalRecaudado);
    }
}
