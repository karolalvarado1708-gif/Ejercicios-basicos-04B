package Ejercicio_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        ColaTren tren = new ColaTren();

        do {
            System.out.println("\n==============================================");
            System.out.println("   TREN DE CARGA - Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Nuevo vagón");
            System.out.println("2. Buscar vagón por ID");
            System.out.println("3. Estado del tren");
            System.out.println("0. Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Contenido: ");
                    String contenido = sc.nextLine();

                    System.out.print("Peso (toneladas): ");
                    double peso = sc.nextDouble();

                    Vagon nuevo = new Vagon(id, contenido, peso);
                    tren.agregarVagon(nuevo);
                    break;

                case 2:
                    System.out.print("Ingrese ID a buscar: ");
                    int buscar = sc.nextInt();

                    Vagon encontrado = tren.buscarVagon(buscar);

                    if (encontrado != null) {
                        System.out.println("Contenido: " + encontrado.contenido);
                        System.out.println("Peso: " + encontrado.pesoToneladas);
                    } else {
                        System.out.println("Vagón no encontrado");
                    }
                    break;

                case 3:
                    tren.mostrarEstado();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }
}