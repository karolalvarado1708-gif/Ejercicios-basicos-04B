import java.util.Scanner;
public class Parcial_1 {

    //selection sort
    public static void selectionSortDesc(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            double temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // Búsqueda lineal
    public static int busquedaLineal(double[] arr, double valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] precios = new double[5];
        double suma = 0;

        for (int i = 0; i < precios.length; i++) {
            System.out.print("Ingrese precio de boleta " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
            suma += precios[i];
        }

        // Promedio
        double promedio = suma / precios.length;

        selectionSortDesc(precios);

        System.out.println("\n--- PRECIOS ORDENADOS (Mayor a menor) ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

        // Mostrar promedio
        System.out.println("\nPromedio: " + promedio);

        // Búsqueda lineal
        System.out.print("\nIngrese precio a buscar: ");
        double buscar = sc.nextDouble();

        int pos = busquedaLineal(precios, buscar);

        if (pos != -1) {
            System.out.println("Precio encontrado en la posición: " + pos);
        } else {
            System.out.println("Precio no encontrado.");
        }

        sc.close();
    }
}
    

