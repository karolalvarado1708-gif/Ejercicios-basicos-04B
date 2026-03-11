import java.util.Arrays;
import java.util.Scanner;

public class Reto_2 {

    public static boolean busquedaBinaria(int[] lista, int valor) {
        int izquierda = 0;
        int derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (lista[medio] == valor) {
                return true;
            }

            if (lista[medio] < valor) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] listaNegra = {50, 120, 450, 800, 999}; 
        int[] intentos = new int[8];

        System.out.println("Ingrese 8 IDs de intentos de acceso:");

        for (int i = 0; i < intentos.length; i++) {
            System.out.print("ID " + (i + 1) + ": ");
            intentos[i] = sc.nextInt();
        }

        int maximo = intentos[0];

        for (int i = 1; i < intentos.length; i++) {
            if (intentos[i] > maximo) {
                maximo = intentos[i];
            }
        }

        System.out.println("\nID más alto detectado: " + maximo);

        if (busquedaBinaria(listaNegra, maximo)) {
            System.out.println(" El atacante ya está en la lista negra.");
        } else {
            System.out.println("Nuevo atacante detectado, procediendo a bloquear.");
        }

        sc.close();
    }
}

