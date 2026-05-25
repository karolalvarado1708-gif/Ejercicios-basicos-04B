package Colas.src.Ejercicio_4;

public class ColaPedidos {

    private Pedido frente;
    private Pedido fin;

    public ColaPedidos() {

        frente = null;
        fin = null;
    }

    public void enqueue(Pedido pedido) {

        if (frente == null) {

            frente = pedido;
            fin = pedido;

        } else {

            fin.siguiente = pedido;
            fin = pedido;
        }
    }

    public Pedido dequeue() {

        if (frente == null) {

            return null;
        }

        Pedido eliminado = frente;
        frente = frente.siguiente;

        if (frente == null) {

            fin = null;
        }

        return eliminado;
    }

    public void imprimir() {

        if (frente == null) {

            System.out.println("No hay pedidos en cola.");
            return;
        }

        Pedido actual = frente;

        while (actual != null) {

            System.out.println("----------------------");
            System.out.println(actual);

            actual = actual.siguiente;
        }
    }

    public void procesarPedidos() {

        int totalDespachados = 0;
        int totalCancelados = 0;

        System.out.println("\n=== PROCESANDO PEDIDOS ===");

        while (frente != null) {

            Pedido pedido = dequeue();

            if (pedido.cancelado) {

                System.out.println("\nPedido cancelado descartado:");
                System.out.println(pedido.numeroPedido);

                totalCancelados++;

            } else {

                System.out.println("\nDespachando pedido:");
                System.out.println(pedido);

                totalDespachados++;
            }
        }

        System.out.println("\nTotal despachados: " + totalDespachados);
        System.out.println("Total cancelados: " + totalCancelados);
    }
}
