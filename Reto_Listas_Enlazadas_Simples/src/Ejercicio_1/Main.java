package Ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Torre_Control torre = new Torre_Control();
        int opcion;

        do {
            System.out.println("\n======================================");
            System.out.println("   TORRE DE CONTROL - MENÚ");
            System.out.println("======================================");
            System.out.println("1. Contar nodos");
            System.out.println("2. Agregar vuelo");
            System.out.println("3. Mostrar cola de vuelos");
            System.out.println("4. Reportar emergencia");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1: 
                int numNodos = Torre_Control.contarNodos();
                System.out.println("El numero de nodos es: " + numNodos);

                case 2:
                    System.out.print("Número de vuelo: ");
                    String numero = sc.nextLine();

                    System.out.print("Aerolínea: ");
                    String aerolinea = sc.nextLine();

                    System.out.print("Combustible restante: ");
                    int combustible = sc.nextInt();

                    System.out.print("Cantidad de pasajeros: ");
                    int pasajeros = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    torre.agregarVuelo(numero, aerolinea, combustible, pasajeros);
                    System.out.println(" Vuelo agregado correctamente.");
                    break;

                case 3:
                    System.out.println("\n Cola de vuelos:");
                    torre.mostrarCola();
                    break;

                case 4:
                    System.out.print("Ingrese número de vuelo en emergencia: ");
                    String vueloEmergencia = sc.nextLine();

                    torre.reportarEmergencia(vueloEmergencia);
                    break;

                case 5:
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}