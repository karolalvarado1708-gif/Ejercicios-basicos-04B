package Ejercicio_2;

public class ColaTren {

    Vagon cabeza;

    public ColaTren() {
        this.cabeza = null;
    }

    public void agregarVagon(Vagon nuevoVagon) {

        if (nuevoVagon.pesoToneladas < 0) {
            System.out.println("Peso inválido");
            return;
        }

        if (buscarVagon(nuevoVagon.id) != null) {
            System.out.println("ID duplicado");
            return;
        }

        if (cabeza == null) {
            cabeza = nuevoVagon;
        } else {
            Vagon actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVagon;
        }

        System.out.println("Vagón agregado correctamente");
    }

    // Buscar por ID
    public Vagon buscarVagon(int id) {
        Vagon actual = cabeza;

        while (actual != null) {
            if (actual.id == id) {
                return actual;
            }
            actual = actual.siguiente;
        }

        return null;
    }

    // Mostrar estado
    public void mostrarEstado() {
        Vagon actual = cabeza;
        double total = 0;
        Vagon pesado = null;

        System.out.println("\n--- ESTADO DEL TREN ---");

        while (actual != null) {
            System.out.print("[ID: " + actual.id + " | " + actual.contenido + " | " + actual.pesoToneladas + "t] -> ");

            total += actual.pesoToneladas;

            if (pesado == null || actual.pesoToneladas > pesado.pesoToneladas) {
                pesado = actual;
            }

            actual = actual.siguiente;
        }

        System.out.println("NULL");
        System.out.println("Peso total: " + total + " toneladas");

        if (pesado != null) {
            System.out.println("Vagón más pesado: ID " + pesado.id);
        }
    }
}