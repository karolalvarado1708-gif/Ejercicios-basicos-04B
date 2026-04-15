package Ejrcicio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Planificador planificador = new Planificador();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar Round Robin");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("PID: ");
                    int pid = sc.nextInt();

                    System.out.print("Prioridad (1-3): ");
                    int prioridad = sc.nextInt();

                    System.out.print("Tiempo restante: ");
                    int tiempo = sc.nextInt();

                    planificador.agregarProceso(nombre, pid, prioridad, tiempo);
                    break;

                case 2:
                    System.out.print("Quantum: ");
                    int quantum = sc.nextInt();

                    planificador.ejecutar(quantum);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);

        sc.close();
    }
}