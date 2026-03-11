// 5. El Inspector de Eficiencia (Duelo de Métodos)
// Algoritmos obligatorios: Selección vs Inserción
// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para
// un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOS
// métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// i. En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// ii. En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos
// hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

package Algoritmos_Ordenamiento.src;
import java.util.Scanner;

public class Inspector_Eficiencia {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 6;

        int[] original = new int[n];
        int[] seleccion;
        int[] insercion;

        System.out.println("Ingrese 6 numeros enteros:");

        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }

        seleccion = original.clone();
        insercion = original.clone();

        int swaps = 0;
        int movimientos = 0;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (seleccion[j] < seleccion[min]) {
                    min = j;
                }
            }

            if (min != i) {

                int temp = seleccion[i];
                seleccion[i] = seleccion[min];
                seleccion[min] = temp;

                swaps++;
            }
        }

        for (int i = 1; i < n; i++) {

            int clave = insercion[i];
            int j = i - 1;

            while (j >= 0 && insercion[j] > clave) {

                insercion[j + 1] = insercion[j];
                j--;

                movimientos++;
            }

            insercion[j + 1] = clave;
        }

        System.out.println("\nResultados:");

        System.out.println("Intercambios en Selection Sort: " + swaps);
        System.out.println("Movimientos en Insertion Sort: " + movimientos);

        sc.close();
    }
}
