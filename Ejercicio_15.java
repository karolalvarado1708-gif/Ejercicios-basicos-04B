// ### Ejercicio 15 — Registro de temperaturas semanales (lineal)
// Una estación meteorológica registra la temperatura máxima de cada día de la semana en un arreglo.

// - Llena el arreglo con 7 valores.
// - Calcula el promedio semanal.
// - Indica qué días estuvieron por encima del promedio.

// ---
public class Ejercicio_15 {

    public static void main(String[] args) {

        double[] temperaturas = {30.5, 32.0, 29.8, 31.2, 33.5, 28.9, 34.0};

        String[] dias = {
            "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"
        };

        double suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }

        double promedio = suma / temperaturas.length;

        System.out.println("Promedio semanal: " + promedio + "°C\n");

        System.out.println("Días con temperatura por encima del promedio:");

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > promedio) {
                System.out.println(dias[i] + " con " + temperaturas[i] + "°C");
            }
        }
    }
}

