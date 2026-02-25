// ### Ejercicio 9 — Notas de un curso
// Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una 
// referencia al mismo arreglo para revisarlas.

// - El coordinador corrige la nota del estudiante 2 (índice 1) de `2.5` a `3.0`.
// - Muestra que el arreglo del profesor **también refleja el cambio**.
// - Añade comentarios explicando el concepto de referencia en memoria.

// ---

public class Ejercicio_9 {

    public static void main(String[] args) {

        double[] notasProfesor = {4.5, 2.5, 3.8, 4.0};

        double[] notasCoordinador = notasProfesor;

        System.out.println("Notas antes de la corrección:");
        mostrarNotas(notasProfesor);

        notasCoordinador[1] = 3.0;

        System.out.println("\nNotas después de la corrección:");
        mostrarNotas(notasProfesor);
    }

    public static void mostrarNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
        }
    }
}
  //  Explicación:
        //  Los arreglos en Java son tipos de referencia.
         
        //  Cuando hacemos:
        //      double[] notasCoordinador = notasProfesor;
         
        //  No se crea un nuevo arreglo.
        //  Ambas variables apuntan al mismo espacio en memoria.
         
        //  Por eso, al modificar notasCoordinador[1],
        //  también se modifica notasProfesor[1],
        //  ya que es el mismo arreglo compartido.

