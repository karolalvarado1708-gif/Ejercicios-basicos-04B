package Colas.src.Ejercicio_1;

public class ColaPaciente {

    private Paciente frente;
    private Paciente fin;

    public ColaPaciente() {

        frente = null;
        fin = null;
    }

    public void enqueue(Paciente paciente) {

        if (frente == null) {

            frente = paciente;
            fin = paciente;

        } else {

            fin.siguiente = paciente;
            fin = paciente;
        }
    }

    public Paciente dequeue() {

        if (frente == null) {

            return null;
        }

        Paciente atendido = frente;
        frente = frente.siguiente;

        if (frente == null) {

            fin = null;
        }

        return atendido;
    }

    public void imprimir() {

        if (frente == null) {

            System.out.println("No hay pacientes en espera.");
            return;
        }

        Paciente actual = frente;

        while (actual != null) {

            System.out.println("----------------------");
            System.out.println(actual);

            actual = actual.siguiente;
        }
    }

    // Método solicitado
    public void atenderTodos() {

        int totalPacientes = 0;

        System.out.println("\n=== ATENDIENDO PACIENTES ===");

        while (frente != null) {

            Paciente paciente = dequeue();

            System.out.println("\nPaciente atendido:");
            System.out.println(paciente);

            totalPacientes++;
        }

        System.out.println("\nTotal de pacientes atendidos: " + totalPacientes);
    }
}