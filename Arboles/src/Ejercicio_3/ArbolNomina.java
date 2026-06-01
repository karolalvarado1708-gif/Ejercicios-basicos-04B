package Ejercicio_3;

public class ArbolNomina {
   
    private Empleado raiz;

    public void insertar(long cedula, String nombreCompleto,
                         String cargo, double salario) {

        raiz = insertarRec(raiz, cedula, nombreCompleto, cargo, salario);
    }

    private Empleado insertarRec(Empleado nodo, long cedula,
                                 String nombreCompleto,
                                 String cargo, double salario) {

        if (nodo == null) {
            return new Empleado(cedula, nombreCompleto, cargo, salario);
        }

        if (cedula < nodo.cedula) {
            nodo.izquierda = insertarRec(nodo.izquierda, cedula,
                    nombreCompleto, cargo, salario);
        } else if (cedula > nodo.cedula) {
            nodo.derecha = insertarRec(nodo.derecha, cedula,
                    nombreCompleto, cargo, salario);
        }

        return nodo;
    }

    public Empleado buscar(long cedula) {
        return buscarRec(raiz, cedula);
    }

    private Empleado buscarRec(Empleado nodo, long cedula) {

        if (nodo == null || nodo.cedula == cedula) {
            return nodo;
        }

        if (cedula < nodo.cedula) {
            return buscarRec(nodo.izquierda, cedula);
        }

        return buscarRec(nodo.derecha, cedula);
    }

    public void inOrden() {
        inOrdenRec(raiz);
    }

    private void inOrdenRec(Empleado nodo) {

        if (nodo != null) {

            inOrdenRec(nodo.izquierda);

            System.out.println(
                    nodo.cedula + " - " +
                    nodo.nombreCompleto + " - " +
                    nodo.cargo);

            inOrdenRec(nodo.derecha);
        }
    }

    public void buscarMinimo() {

        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        Empleado actual = raiz;

        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        System.out.println("\nEMPLEADO CON MENOR CEDULA");
        System.out.println(actual);
    }

    public void buscarMaximo() {

        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        Empleado actual = raiz;

        while (actual.derecha != null) {
            actual = actual.derecha;
        }

        System.out.println("\nEMPLEADO CON MAYOR CEDULA");
        System.out.println(actual);
    }

    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Empleado nodo) {

        if (nodo == null) {
            return 0;
        }

        int izquierda = alturaRec(nodo.izquierda);
        int derecha = alturaRec(nodo.derecha);

        return Math.max(izquierda, derecha) + 1;
    }

    public int contarHojas() {
        return contarHojasRec(raiz);
    }

    private int contarHojasRec(Empleado nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierda == null && nodo.derecha == null) {
            return 1;
        }

        return contarHojasRec(nodo.izquierda)
                + contarHojasRec(nodo.derecha);
    }

    public void reporteEficiencia() {

        System.out.println("\n--- REPORTE DE EFICIENCIA ---");
        System.out.println("Altura del arbol: " + altura());
        System.out.println("Numero de hojas: " + contarHojas());
    }
}
