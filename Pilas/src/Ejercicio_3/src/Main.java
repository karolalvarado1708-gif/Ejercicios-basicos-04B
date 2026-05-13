import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PilaCamiones callejon = new PilaCamiones();
        Scanner scanner = new Scanner(System.in);

        callejon.push(new Camion("ABC-123", "Carlos Pérez", 12.5));
        callejon.push(new Camion("DEF-456", "María Gómez", 8.3));
        callejon.push(new Camion("GHI-789", "Juan Torres", 15.0));
        callejon.push(new Camion("JKL-321", "Ana Ruiz", 10.7));

        int opcion;

        do {

            System.out.println("\n--- LOGÍSTICA DE DISTRIBUCIÓN (PILAS) ---");
            System.out.println("1. Ver camiones estacionados");
            System.out.println("2. Registrar nuevo camión (Push)");
            System.out.println("3. Retirar camión del tope (Pop)");
            System.out.println("4. Calcular carga total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    callejon.imprimir();
                    break;

                case 2:

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Conductor: ");
                    String conductor = scanner.nextLine();

                    System.out.print("Carga en toneladas: ");
                    double carga = scanner.nextDouble();

                    callejon.push(new Camion(placa, conductor, carga));

                    System.out.println("Camión agregado correctamente.");
                    break;

                case 3:

                    Camion retirado = callejon.pop();

                    if (retirado != null) {
                        System.out.println("Se retiró el camión: " + retirado);
                    } else {
                        System.out.println("El callejón está vacío.");
                    }

                    break;

                case 4:

                    double total = callejon.calcularCargaTotal();

                    System.out.println("Carga total en el callejón: "
                            + total + " toneladas");

                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
