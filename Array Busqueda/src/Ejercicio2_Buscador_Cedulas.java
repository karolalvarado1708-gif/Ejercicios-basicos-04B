// Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.
// El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida
//  posible (en pocos pasos).
// Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo 
// la lista a la mitad en cada paso.
public class Ejercicio2_Buscador_Cedulas {
    public static void main(String[] args){

        int[] clientes = {1001, 1020, 1050, 1100, 1200, 1300, 1500, 1700, 2000};
        int idBuscar = 1300;

        int inicio = 0;
        int fin = clientes.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (clientes[medio] == idBuscar) {
                System.out.println("Cliente encontrado en la posición: " + medio);
                encontrado = true;
                break;
            } 
            else if (clientes[medio] < idBuscar) {
                inicio = medio + 1;
            } 
            else {
                fin = medio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }
    }
}
