package Ejercicio_4;

public class Galeria {
    Foto inicio;
    Foto fotoActual;

    public void agregar(String titulo, String fecha) {
        Foto nuevaFoto = new Foto(titulo, fecha);

        if (inicio == null) {
            inicio = nuevaFoto;
            inicio.siguiente = inicio;
            inicio.anterior = inicio;
            fotoActual = inicio;
        } else {
            Foto ultimaFoto = inicio.anterior;

            ultimaFoto.siguiente = nuevaFoto;
            nuevaFoto.anterior = ultimaFoto;

            nuevaFoto.siguiente = inicio;
            inicio.anterior = nuevaFoto;
        }
    }

    public void siguiente() {
        if (fotoActual != null) {
            fotoActual = fotoActual.siguiente;
        }
    }

    public void anterior() {
        if (fotoActual != null) {
            fotoActual = fotoActual.anterior;
        }
    }

    public void toggleFavorita() {
        if (fotoActual != null) {
            fotoActual.esFavorita = !fotoActual.esFavorita;
        }
    }

    public void eliminarActual() {
        if (fotoActual == null) return;

        if (fotoActual.siguiente == fotoActual) {
            inicio = null;
            fotoActual = null;
            return;
        }

        Foto fotoAnterior = fotoActual.anterior;
        Foto fotoSiguiente = fotoActual.siguiente;

        fotoAnterior.siguiente = fotoSiguiente;
        fotoSiguiente.anterior = fotoAnterior;

        if (fotoActual == inicio) {
            inicio = fotoSiguiente;
        }

        fotoActual = fotoSiguiente;
    }

    public void mostrarGaleria() {
        if (inicio == null) return;

        Foto fotoRecorrido = inicio;

        System.out.println("\n GALERÍA:");
        do {
            String indicadorActual = (fotoRecorrido == fotoActual) ? "" : "    ";
            String indicadorFavorita = fotoRecorrido.esFavorita ? " " : "";

            System.out.println(indicadorActual + indicadorFavorita 
                + fotoRecorrido.titulo + " - " + fotoRecorrido.fecha);

            fotoRecorrido = fotoRecorrido.siguiente;

        } while (fotoRecorrido != inicio);
    }
}