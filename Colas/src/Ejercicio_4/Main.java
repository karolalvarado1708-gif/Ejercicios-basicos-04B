package Colas.src.Ejercicio_4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ColaPedidos cola = new ColaPedidos();
        Scanner scanner = new Scanner(System.in);

        cola.enqueue(new Pedido("P001","Carlos",150000,false));

        cola.enqueue(new Pedido("P002","Ana",85000,true));

        cola.enqueue(new Pedido("P003","Luis",230000,false));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE PEDIDOS ---");
            System.out.println("1. Ver pedidos");
            System.out.println("2. Registrar pedido");
            System.out.println("3. Procesar un pedido");
            System.out.println("4. Procesar todos los pedidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nPEDIDOS EN COLA:");
                    cola.imprimir();
                    break;

                case 2:

                    System.out.print("Número del Pedido: ");
                    String numero = scanner.nextLine();

                    System.out.print("Cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Total a Pagar: ");
                    double total = scanner.nextDouble();

                    System.out.print("¿Está cancelado? (true/false): ");
                    boolean cancelado = scanner.nextBoolean();

                    cola.enqueue(
                            new Pedido(
                                    numero,
                                    cliente,
                                    total,
                                    cancelado));

                    System.out.println("Pedido registrado correctamente.");
                    break;

                case 3:

                    Pedido pedido = cola.dequeue();

                    if (pedido != null) {

                        System.out.println("\nProcesando pedido:");
                        System.out.println(pedido);

                    } else {

                        System.out.println("No hay pedidos en cola.");
                    }

                    break;

                case 4:

                    cola.procesarPedidos();
                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
