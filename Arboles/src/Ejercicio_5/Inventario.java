package Ejercicio_5;

public class Inventario {
    private Repuesto raiz;

    public void insertar(int codigoRef,
                         String descripcion,
                         String marca,
                         int stock) {

        raiz = insertarRec(
                raiz,
                codigoRef,
                descripcion,
                marca,
                stock);
    }

    private Repuesto insertarRec(Repuesto nodo,
                                 int codigoRef,
                                 String descripcion,
                                 String marca,
                                 int stock) {

        if (nodo == null) {
            return new Repuesto(
                    codigoRef,
                    descripcion,
                    marca,
                    stock);
        }

        if (codigoRef < nodo.codigoRef) {

            nodo.izquierda = insertarRec(
                    nodo.izquierda,
                    codigoRef,
                    descripcion,
                    marca,
                    stock);

        } else if (codigoRef > nodo.codigoRef) {

            nodo.derecha = insertarRec(
                    nodo.derecha,
                    codigoRef,
                    descripcion,
                    marca,
                    stock);
        }

        return nodo;
    }

    public Repuesto buscar(int codigoRef) {
        return buscarRec(raiz, codigoRef);
    }

    private Repuesto buscarRec(Repuesto nodo,
                               int codigoRef) {

        if (nodo == null ||
            nodo.codigoRef == codigoRef) {

            return nodo;
        }

        if (codigoRef < nodo.codigoRef) {
            return buscarRec(
                    nodo.izquierda,
                    codigoRef);
        }

        return buscarRec(
                nodo.derecha,
                codigoRef);
    }

    public void backupPreOrden() {

        System.out.println(
                "\n--- RESPALDO DEL INVENTARIO ---\n");

        preOrdenRec(raiz);
    }

    private void preOrdenRec(Repuesto nodo) {

        if (nodo != null) {

            System.out.println(
                    "[" + nodo.codigoRef + "] " +
                    nodo.descripcion + " - " +
                    nodo.marca +
                    " (" + nodo.stock +
                    " uds)");

            preOrdenRec(nodo.izquierda);
            preOrdenRec(nodo.derecha);
        }
    }

    public int contarHojas() {
        return contarHojasRec(raiz);
    }

    private int contarHojasRec(Repuesto nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierda == null &&
            nodo.derecha == null) {

            return 1;
        }

        return contarHojasRec(nodo.izquierda)
                + contarHojasRec(nodo.derecha);
    }
    
    public void reporteRepuestosUnicos() {

        int hojas = contarHojas();

        System.out.println(
                "\nCantidad de repuestos sin variantes relacionadas: "
                + hojas);
    }
}
