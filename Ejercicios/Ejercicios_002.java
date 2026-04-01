// ### Ejercicio 2 — Calculadora de una tienda
// Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

// - Precio unitario de un producto (`double`)
// - Cantidad comprada (`int`)
// - Descuento aplicado en porcentaje (`double`)
// - Total a pagar después del descuento

// Declara las variables, realiza el cálculo y muestra el resultado por consola.

// ---

public class Ejercicios_002 {
     public static void main(String[] args) {

    double Precio_Unitario;
    int Cantidad_Comprada;
    double Descuento_aplicado_porcentaje;
    
    double Total_Sin_Descuento;
    double Total_Con_Descuento;
    double Total_Pagar;
    
    Precio_Unitario = 5000;
    Cantidad_Comprada = 8;
    Descuento_aplicado_porcentaje = 10.0;

    Total_Sin_Descuento = Precio_Unitario * Cantidad_Comprada;
    Total_Con_Descuento = Total_Sin_Descuento * (Descuento_aplicado_porcentaje / 100);
    Total_Pagar = Total_Sin_Descuento - Total_Con_Descuento;

        System.out.println("Precio unitario: $" + Precio_Unitario);
        System.out.println("Cantidad comprada: " + Cantidad_Comprada);
        System.out.println("Descuento aplicado: " + Descuento_aplicado_porcentaje + "%");
        System.out.println("Total a pagar: $" + Total_Pagar);

    }
}
