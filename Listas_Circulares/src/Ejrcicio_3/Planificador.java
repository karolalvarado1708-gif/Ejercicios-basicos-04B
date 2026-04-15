package Ejrcicio_3;

class Planificador {
    Proceso cabeza;

    public void agregarProceso(String nombre, int pid, int prioridad, int tiempo) {
        Proceso nuevo = new Proceso(nombre, pid, prioridad, tiempo);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Proceso temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    private void eliminarProceso(Proceso anterior, Proceso actual) {
        if (actual == cabeza && actual.siguiente == cabeza) {
            cabeza = null; 
        } else {
            if (actual == cabeza) {
                cabeza = cabeza.siguiente;
            }
            anterior.siguiente = actual.siguiente;
        }
    }

    public void ejecutar(int quantum) {
        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }

        Proceso actual = cabeza;
        Proceso anterior = null;

        String ordenFinal = "";

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.nombre + " (PID: " + actual.pid + ")");

            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante > 0) {
                System.out.println("Tiempo restante: " + actual.tiempoRestante);

                anterior = actual;
                actual = actual.siguiente;

            } else {
                System.out.println("Proceso terminado: " + actual.nombre);

                ordenFinal += actual.nombre + " -> ";

                if (anterior == null) {
                    anterior = actual;
                    while (anterior.siguiente != actual) {
                        anterior = anterior.siguiente;
                    }
                }

                eliminarProceso(anterior, actual);
                actual = anterior.siguiente;
            }
        }

        System.out.println("\n--- ORDEN DE FINALIZACIÓN ---");
        System.out.println(ordenFinal + "FIN");
    }
}