package Colas.src.Ejercicio_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ColaPeaje cola = new ColaPeaje();
        Scanner scanner = new Scanner(System.in);

        cola.enqueue(new Vehiculo("ABC123","Carro",12000,false));

        cola.enqueue(new Vehiculo("XYZ789","Moto",8000,false));

        cola.enqueue(new Vehiculo("POL001","Policia",0,true));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE PEAJE ---");
            System.out.println("1. Ver vehículos en cola");
            System.out.println("2. Registrar vehículo");
            System.out.println("3. Cobrar vehículo");
            System.out.println("4. Cerrar turno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nVEHÍCULOS EN COLA:");
                    cola.imprimir();
                    break;

                case 2:

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Tipo de Vehículo: ");
                    String tipo = scanner.nextLine();

                    System.out.print("Tarifa: ");
                    double tarifa = scanner.nextDouble();

                    System.out.print("¿Es exento? (true/false): ");
                    boolean exento = scanner.nextBoolean();

                    cola.enqueue(
                            new Vehiculo(
                                    placa,
                                    tipo,
                                    tarifa,
                                    exento));

                    System.out.println("Vehículo registrado correctamente.");
                    break;

                case 3:

                    Vehiculo vehiculo = cola.dequeue();

                    if (vehiculo != null) {

                        System.out.println("\nCobrando vehículo:");
                        System.out.println(vehiculo);

                    } else {

                        System.out.println("No hay vehículos en cola.");
                    }

                    break;

                case 4:

                    cola.cerrarTurno();
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

