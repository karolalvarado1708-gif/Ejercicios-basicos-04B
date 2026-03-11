// 3. El Salto de Shell (Optimización de Datos)
// Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)
// Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma más
// eficiente que el método de burbuja o inserción simple.
// Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 para
// notar el efecto).
// Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de $N/2$. El estudiante debe explicar en
// comentarios por qué este método es generalmente más rápido que la inserción simple al trabajar con elementos
// que están muy lejos de su posición final.
// Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas las fases de
// reducción de saltos.

package Algoritmos_Ordenamiento.src;
import java.util.Scanner;

public class Salto_Sell {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de paquetes: ");
        int n = sc.nextInt();

        double[] pesos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso del paquete " + (i + 1) + ": ");
            pesos[i] = sc.nextDouble();
        }

        System.out.println("\nArreglo original:");
        mostrarArreglo(pesos);

        int gap = n / 2;

        while (gap > 0) {

            for (int i = gap; i < n; i++) {

                double temp = pesos[i];
                int j = i;

                while (j >= gap && pesos[j - gap] > temp) {
                    pesos[j] = pesos[j - gap];
                    j = j - gap;
                }

                pesos[j] = temp;
            }

            gap = gap / 2;
        }

        System.out.println("\nArreglo ordenado:");
        mostrarArreglo(pesos);

        sc.close();
    }

    public static void mostrarArreglo(double[] arr) {

        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }
}
