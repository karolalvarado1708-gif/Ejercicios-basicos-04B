package Ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Galeria galeria = new Galeria();

        int opcion;

        do {
            System.out.println("\n===== GALERÍA =====");
            System.out.println("1. Agregar foto");
            System.out.println("2. Siguiente");
            System.out.println("3. Anterior");
            System.out.println("4. Marcar/Desmarcar favorita");
            System.out.println("5. Eliminar foto actual");
            System.out.println("6. Mostrar galería");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();

                    galeria.agregar(titulo, fecha);
                    break;

                case 2:
                    galeria.siguiente();
                    break;

                case 3:
                    galeria.anterior();
                    break;

                case 4:
                    galeria.toggleFavorita();
                    break;

                case 5:
                    galeria.eliminarActual();
                    System.out.println(" Foto eliminada.");
                    break;

                case 6:
                    galeria.mostrarGaleria();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}