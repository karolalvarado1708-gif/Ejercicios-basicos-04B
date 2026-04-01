// ### Ejercicio 7 — Inventario compartido
// Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de reportes **apuntan al mismo arreglo**.

// - Crea el arreglo `stockAlmacen` con valores iniciales.
// - Asigna `stockReportes = stockAlmacen`.
// - Simula una venta reduciendo el stock de un producto desde `stockReportes`.
// - Muestra que `stockAlmacen` **también cambió** y explica en comentarios por qué.

// ---
public class Ejercicio_7 {

    public static void main(String[] args) {

        int[] stockAlmacen = {50, 30, 20, 15, 10};

        int[] stockReportes = stockAlmacen;

        System.out.println("Stock antes de la venta:");
        mostrarStock(stockAlmacen);

        stockReportes[0] = stockReportes[0] - 5;

        System.out.println("\nStock después de la venta:");
        mostrarStock(stockAlmacen);

    }

    public static void mostrarStock(int[] stock) {
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stock[i]);
        }
    }
}
        //  Explicación:
        //  Los arreglos en Java son tipos de referencia.
        //  Cuando hacemos:
        //      int[] stockReportes = stockAlmacen;
        //  NO se copia el arreglo.
        //  Ambas variables apuntan al mismo espacio en memoria.
         
        //  Por eso, al modificar stockReportes,
        //  también cambia stockAlmacen

