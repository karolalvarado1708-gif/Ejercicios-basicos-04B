// ### Ejercicio 8 — Historial de mensajes
// Un chat guarda el último mensaje enviado. Se usan dos variables `String`:

// - `ultimoMensaje = "Hola"`
// - `copiaTexto = ultimoMensaje`
// - Luego `copiaTexto` se cambia a `"¿Cómo estás?"`

// Muestra ambas variables y explica en un comentario por qué `ultimoMensaje` **no cambió** (inmutabilidad de `String`).

// ---

public class ejercicio_8 {
    public class Ejercicio8 {

    public static void main(String[] args) {

        String ultimoMensaje = "Hola";

        String copiaTexto = ultimoMensaje;

        System.out.println("Antes del cambio:");
        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia texto: " + copiaTexto);

        copiaTexto = "¿Cómo estás?";

        System.out.println("\nDespués del cambio:");
        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia texto: " + copiaTexto);
    }
}
}
  //  Explicación:
        //  String en Java es un tipo de referencia,
        //  pero es INMUTABLE.
         
        //  Cuando hacemos:
        //      copiaTexto = "¿Cómo estás?";
         
        //  No se modifica el texto original "Hola".
        //  En realidad, se crea un nuevo objeto String
        //  en memoria y copiaTexto ahora apunta a ese nuevo objeto.
         
        //  ultimoMensaje sigue apuntando al texto "Hola",
        //  por eso no cambia.
