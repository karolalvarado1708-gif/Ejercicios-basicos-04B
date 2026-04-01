// ### Ejercicio 1 — Ficha de un estudiante
// Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código (número entero), 
// semestre actual, promedio acumulado y si está matriculado o no.

// - Declara las variables con los tipos de datos apropiados.
// - Asigna valores de ejemplo.
// - Imprime un reporte por consola con el siguiente formato:
//   ```
//   === Ficha del Estudiante ===
//   Nombre: Ana Torres
//   Código: 20241001
//   Semestre: 3
//   Promedio: 3.85
//   Matriculado: true
//   ```

public class Ejercicios_001 {
    
    public static void main(String[] args) {

        String nombreCompleto;
        int codigo;
        int semestreActual;
        double promedioAcumulado;
        boolean matriculado;

        nombreCompleto = "Ana Torres";
        codigo = 20241001;
        semestreActual = 3;
        promedioAcumulado = 3.85;
        matriculado = true;

        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestreActual);
        System.out.println("Promedio: " + promedioAcumulado);
        System.out.println("Matriculado: " + matriculado);
    }
}
