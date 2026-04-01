package Ejercicio_2;

public class Inventario {

    Producto inicio;

    public Inventario() {
        this.inicio = null;
    }

    public void agregarProducto(Producto nuevo) {

        if (nuevo.diasParaVencer < 3) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        } else {

            if (inicio == null) {
                inicio = nuevo;
            } else {
                Producto actual = inicio;

                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    public void mostrarProximosAVencer() {
        Producto actual = inicio;

        if (actual == null) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("Nombre: " + actual.nombre +
                        ", Cantidad: " + actual.cantidad +
                        ", Días para vencer: " + actual.diasParaVencer);
            }
            actual = actual.siguiente;
        }
    }

    public void mostrarTodos() {
        Producto actual = inicio;

        if (actual == null) {
            System.out.println("Inventario vacío.");
            return;
        }

        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre +
                    ", Cantidad: " + actual.cantidad +
                    ", Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }
} 