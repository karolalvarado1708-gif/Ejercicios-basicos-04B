// ### Ejercicio 6 — Turno en un banco
// Un cajero de banco trabaja con el número del turno actual. Se crea una variable `turnoActual`
//  y se asigna a `turnoEnPantalla`.

// - Demuestra con código que cambiar `turnoEnPantalla` **no** afecta a `turnoActual` 
// (comportamiento por valor).
// - Explica en un comentario por qué ocurre esto.

// ---
public class Ejercicio_6 {

    public static void main(String[] args) {

        int turnoActual = 25;

        int turnoEnPantalla = turnoActual;

        System.out.println("Antes del cambio:");
        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

        turnoEnPantalla = 30;

        System.out.println("\nDespués del cambio:");
        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

    }
}
//  Explicación:
//          Las variables de tipo int en Java son tipos primitivos (tipo de valor).
//          Cuando asignamos turnoActual a turnoEnPantalla,
//          se copia el valor (25), no la variable original.
//          Por eso, al cambiar turnoEnPantalla a 30,
//          turnoActual sigue valiendo 25.