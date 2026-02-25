// ### Ejercicio 5 — Conversor de unidades
// Una aplicación de cocina necesita convertir unidades:

// - Declara una variable `tazas` (`double`) con la cantidad de tazas de un ingrediente.
// - Convierte a mililitros (1 taza = 236.588 ml) y guarda el resultado en otra variable.
// - Convierte también a litros.
// - Muestra las tres medidas por consola.

// ---
public class Ejercicio_5 {
    
    public static void main(String[] args) {

        double tazas;
        double mililitros;
        double litros;

        tazas = 2.5;

        mililitros = tazas * 236.588;
        litros = mililitros / 1000;

        System.out.println("=== Conversor de Unidades ===");
        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros + " ml");
        System.out.println("Litros: " + litros + " L");
    }
    
}
