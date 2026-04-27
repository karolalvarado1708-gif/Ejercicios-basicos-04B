public class Historial {
    Comando inicio;
    Comando cursor;

    public void agregar(String texto, boolean exitoso, String directorio) {
        Comando nuevo = new Comando(texto, exitoso, directorio);

        if (inicio == null) {
            inicio = nuevo;
            inicio.siguiente = inicio;
            inicio.anterior = inicio;
            cursor = inicio;
        } else {
            Comando ultimo = inicio.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
        }
    }

    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
    }

    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente;
        }
    }

    public void mostrarCursor() {
        if (cursor == null) {
            System.out.println(" No hay comandos.");
            return;
        }

        System.out.println("\n Cursor en:");
        System.out.println("Comando: " + cursor.texto);
        System.out.println("Estado: " + (cursor.exitoso ? " OK" : " ERROR"));
        System.out.println("Directorio: " + cursor.directorio);
    }


    public void eliminarActual() {
        if (cursor == null) return;

        
        if (cursor.siguiente == cursor) {
            inicio = null;
            cursor = null;
            return;
        }

        Comando anterior = cursor.anterior;
        Comando siguiente = cursor.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        if (cursor == inicio) {
            inicio = siguiente;
        }

        cursor = siguiente; 
    }

    public void mostrarHistorial() {
        if (inicio == null) return;

        Comando actual = inicio;

        System.out.println("\n HISTORIAL:");
        do {
            if (actual == cursor) {
                System.out.println(" " + actual.texto + " (CURSOR)");
            } else {
                System.out.println("   " + actual.texto);
            }
            actual = actual.siguiente;
        } while (actual != inicio);
    }
}