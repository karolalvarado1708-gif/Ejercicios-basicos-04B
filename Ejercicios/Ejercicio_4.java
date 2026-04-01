// ### Ejercicio 4 — Placa de un vehículo
// El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

// - Placa (`String`)
// - Año de fabricación (`int`)
// - Cilindraje en cc (`int`)
// - Precio de compra (`double`)
// - Inicial del color (`char`)
// - Si tiene SOAT vigente (`boolean`)

// Muestra todos los datos en consola.

    public class Ejercicio_4 {
    public static void main(String[] args) {
        String placa;
        int Anio_Fabricacion;
        int Cilindraje;
        double Precio_Compra;
        char Inicial_Color;
        boolean SOAT;

        placa ="ABC123";
        Anio_Fabricacion = 2020;
        Cilindraje = 1600;
        Precio_Compra = 45000000;
        Inicial_Color = 'R';
        SOAT = true;

        System.out.println("placa: "+ placa);
        System.out.println("Año de fabricacion : "+ Anio_Fabricacion);
        System.out.println("cilindraje :  "+ Cilindraje);
        System.out.println("precio de compra : "+ Precio_Compra);
        System.out.println("Color : "+ Inicial_Color);
        System.out.println("SOAT:  "+ SOAT);
    }
    
}
