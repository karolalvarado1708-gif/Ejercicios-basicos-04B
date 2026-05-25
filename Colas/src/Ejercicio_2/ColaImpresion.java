package Colas.src.Ejercicio_2;

public class ColaImpresion {

    private Documento frente;
    private Documento fin;

    public ColaImpresion() {

        frente = null;
        fin = null;
    }

    public void enqueue(Documento documento) {

        if (frente == null) {

            frente = documento;
            fin = documento;

        } else {

            fin.siguiente = documento;
            fin = documento;
        }
    }

    public Documento dequeue() {

        if (frente == null) {

            return null;
        }

        Documento eliminado = frente;
        frente = frente.siguiente;

        if (frente == null) {

            fin = null;
        }

        return eliminado;
    }

    public void imprimir() {

        if (frente == null) {

            System.out.println("No hay documentos en cola.");
            return;
        }

        Documento actual = frente;

        while (actual != null) {

            System.out.println("----------------------");
            System.out.println(actual);

            actual = actual.siguiente;
        }
    }

    public int calcularPaginasTotales() {

        int totalPaginas = 0;

        Documento actual = frente;

        while (actual != null) {

            totalPaginas += actual.numeroPaginas;

            actual = actual.siguiente;
        }

        return totalPaginas;
    }
}