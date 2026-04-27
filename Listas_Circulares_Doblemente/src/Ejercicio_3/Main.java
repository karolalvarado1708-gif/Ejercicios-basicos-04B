package Ejercicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EditorCapas e = new EditorCapas();

        int opcion;

        do {
            System.out.println("\n=====  EDITOR DE CAPAS =====");
            System.out.println("1. Agregar capa");
            System.out.println("2. Subir capa");
            System.out.println("3. Bajar capa");
            System.out.println("4. Alternar visibilidad");
            System.out.println("5. Eliminar capa activa");
            System.out.println("6. Mostrar capas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Visible (true/false): ");
                    boolean visible = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Tipo (fondo/objeto/texto): ");
                    String tipo = sc.nextLine();

                    e.agregar(nombre, visible, tipo);
                    break;

                case 2:
                    e.subirCapa();
                    break;

                case 3:
                    e.bajarCapa();
                    break;

                case 4:
                    e.toggleVisibilidad();
                    break;

                case 5:
                    e.eliminarActiva();
                    System.out.println(" Capa eliminada.");
                    break;

                case 6:
                    e.mostrarCapas();
                    break;

                case 0:
                    System.out.println(" Saliendo...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}