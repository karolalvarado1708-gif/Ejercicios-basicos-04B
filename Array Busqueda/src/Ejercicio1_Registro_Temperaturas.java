// Un sistema meteorológico guarda las temperaturas de los últimos 7 días.

// Declara un arreglo de double para 7 días.
// Asigna valores manualmente.
// Imprime cada temperatura con su respectivo día (Día 1, Día 2, etc.).

public class Ejercicio1_Registro_Temperaturas {
    public static void main(String[] args){
        
        int[] productos = {456789, 123456, 770123, 998877, 445566};
        int codigo = 770123;
        boolean encontrado = false;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == codigo) {
                System.out.println("Producto encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
