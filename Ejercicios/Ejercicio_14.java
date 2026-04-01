
// ### Ejercicio 14 — Árbol de empleados (no lineal)
// Una empresa tiene la siguiente jerarquía:

// ```
//          Gerente
//         /       \
//    Supervisor1  Supervisor2
//     /      \
//  Analista1 Analista2
// ```

// - Modela la jerarquía con nodos que tengan el campo `cargo`.
// - Imprime el árbol recorriéndolo nivel por nivel.

// ---
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio_14 {

    static class NodoEmpleado {
        String cargo;
        NodoEmpleado izquierdo;
        NodoEmpleado derecho;

        public NodoEmpleado(String cargo) {
            this.cargo = cargo;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public static void main(String[] args) {

        NodoEmpleado gerente = new NodoEmpleado("Gerente");

        gerente.izquierdo = new NodoEmpleado("Supervisor1");
        gerente.derecho = new NodoEmpleado("Supervisor2");

        gerente.izquierdo.izquierdo = new NodoEmpleado("Analista1");
        gerente.izquierdo.derecho = new NodoEmpleado("Analista2");

        recorrerPorNiveles(gerente);
    }

    public static void recorrerPorNiveles(NodoEmpleado raiz) {

        if (raiz == null) {
            return;
        }

        Queue<NodoEmpleado> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {

            NodoEmpleado actual = cola.poll();
            System.out.println(actual.cargo);

            if (actual.izquierdo != null) {
                cola.add(actual.izquierdo);
            }

            if (actual.derecho != null) {
                cola.add(actual.derecho);
            }
        }
    }
}

