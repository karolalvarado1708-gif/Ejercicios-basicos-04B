// 1. El Podio de la Competencia
// Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)
// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes
// ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). Luego, debe
// pedir el tiempo en segundos (con decimales) de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al
// inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un
// mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).

package Algoritmos_Ordenamiento.src;

import java.util.Scanner;

public class Podio_Competencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de corredores (5 a 10): ");

        int n = sc.nextInt();

       double[] tiempos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el tiempo del corredor " + (i + 1) + ": ");
            tiempos[i] = sc.nextDouble();
        }

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (tiempos[j] < tiempos[min]) {
                    min = j;
                }
            }

            double temp = tiempos[i];
            tiempos[i] = tiempos[min];
            tiempos[min] = temp;
        }

        System.out.println("\nTiempos ordenados:");
        for (int i = 0; i < n; i++) {
            System.out.println("Posicion " + (i + 1) + ": " + tiempos[i] + " segundos");
        }

        System.out.println("\nPODIO:");
        System.out.println("Oro (1er lugar): " + tiempos[0] + " segundos");
        System.out.println("Plata (2do lugar): " + tiempos[1] + " segundos");
        System.out.println("Bronce (3er lugar): " + tiempos[2] + " segundos");

        sc.close();
    }

}