package Ejercicio_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metro metro = new Metro();
        int opcion;

        do {
            System.out.println("\n=================================");
            System.out.println("   METRO CIRCULAR");
            System.out.println("=================================");
            System.out.println("1. Agregar estación");
            System.out.println("2. Ver ruta (IDA)");
            System.out.println("3. Ver ruta (REGRESO)");
            System.out.println("4. Consultar estación");
            System.out.println("5. Eliminar estación");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    metro.agregarEstacion(sc.nextLine());
                    break;

                case 2:
                    metro.mostrarIda();
                    break;

                case 3:
                    metro.mostrarRegreso();
                    break;

                case 4:
                    System.out.print("Nombre: ");
                    metro.consultarEstacion(sc.nextLine());
                    break;

                case 5:
                    System.out.print("Eliminar: ");
                    metro.eliminarEstacion(sc.nextLine());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}