package Ejercicio_3;

public class EditorCapas {
    Capa inicio;
    Capa activa;

    public void agregar(String n, boolean v, String t) {
        Capa nueva = new Capa(n, v, t);

        if (inicio == null) {
            inicio = nueva;
            inicio.siguiente = inicio;
            inicio.anterior = inicio;
            activa = inicio;
        } else {
            Capa ultimo = inicio.anterior;
            ultimo.siguiente = nueva;
            nueva.anterior = ultimo;
            nueva.siguiente = inicio;
            inicio.anterior = nueva;
        }
    }

    public void subirCapa() {
        if (activa != null) activa = activa.siguiente;
    }

    public void bajarCapa() {
        if (activa != null) activa = activa.anterior;
    }

    public void toggleVisibilidad() {
        if (activa != null) activa.visible = !activa.visible;
    }

    public void eliminarActiva() {
        if (activa == null) return;

        if (activa.siguiente == activa) {
            inicio = null;
            activa = null;
            return;
        }

        Capa ant = activa.anterior;
        Capa sig = activa.siguiente;

        ant.siguiente = sig;
        sig.anterior = ant;

        if (activa == inicio) inicio = sig;

        activa = sig; 
    }

    public void mostrarCapas() {
        if (inicio == null) return;

        Capa aux = inicio;
        System.out.println("\n CAPAS:");
        do {
            String marca = (aux == activa) ? "[✓] " : "[ ] ";
            String vis = aux.visible ? "Visible" : "Oculta";
            System.out.println(marca + aux.nombre + " (" + aux.tipo + ") - " + vis);
            aux = aux.siguiente;
        } while (aux != inicio);
    }
}