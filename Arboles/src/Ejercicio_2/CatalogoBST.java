package Ejercicio_2;

public class CatalogoBST {

    private Libro raiz;

    public CatalogoBST() {
        raiz = null;
    }

    public void insertar(long isbn, String titulo, String autor, int anioPublicacion) {
        raiz = insertarRec(raiz, isbn, titulo, autor, anioPublicacion);
    }

    private Libro insertarRec(Libro nodo, long isbn, String titulo, String autor, int anioPublicacion) {

        if (nodo == null) {
            return new Libro(isbn, titulo, autor, anioPublicacion);
        }

        if (isbn < nodo.isbn) {
            nodo.izquierda = insertarRec(nodo.izquierda, isbn, titulo, autor, anioPublicacion);
        } else if (isbn > nodo.isbn) {
            nodo.derecha = insertarRec(nodo.derecha, isbn, titulo, autor, anioPublicacion);
        }

        return nodo;
    }

    public boolean existeISBN(long isbn) {
        return existeISBNRec(raiz, isbn);
    }

    private boolean existeISBNRec(Libro nodo, long isbn) {

        if (nodo == null) {
            return false;
        }

        if (nodo.isbn == isbn) {
            return true;
        }

        if (isbn < nodo.isbn) {
            return existeISBNRec(nodo.izquierda, isbn);
        } else {
            return existeISBNRec(nodo.derecha, isbn);
        }
    }

    public Libro buscar(long isbn) {
        return buscarRec(raiz, isbn);
    }

    private Libro buscarRec(Libro nodo, long isbn) {

        if (nodo == null || nodo.isbn == isbn) {
            return nodo;
        }

        if (isbn < nodo.isbn) {
            return buscarRec(nodo.izquierda, isbn);
        } else {
            return buscarRec(nodo.derecha, isbn);
        }
    }

    public void imprimirCatalogo() {
        if (raiz == null) {
            System.out.println("El catalogo esta vacio.");
            return;
        }

        imprimirInOrden(raiz);
    }

    private void imprimirInOrden(Libro nodo) {

        if (nodo != null) {

            imprimirInOrden(nodo.izquierda);

            System.out.println(
                    nodo.isbn + " - " +
                    nodo.titulo + " - " +
                    nodo.autor);

            imprimirInOrden(nodo.derecha);
        }
    }

    public void preOrden() {
        preOrdenRec(raiz);
    }

    private void preOrdenRec(Libro nodo) {

        if (nodo != null) {

            System.out.println(
                    nodo.isbn + " - " +
                    nodo.titulo + " - " +
                    nodo.autor);

            preOrdenRec(nodo.izquierda);
            preOrdenRec(nodo.derecha);
        }
    }

    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Libro nodo) {

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

    private int contarHojasRec(Libro nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierda == null && nodo.derecha == null) {
            return 1;
        }

        return contarHojasRec(nodo.izquierda) +
               contarHojasRec(nodo.derecha);
    }
}