package Ejercicio_5;
import java.util.Scanner;

public class Main {
    


    public static void main(String[] args) {

        Inventario arbol =
                new Inventario();

        Scanner scanner =
                new Scanner(System.in);

        // Datos de prueba
        arbol.insertar(500, "Filtro de Aceite", "Bosch", 15);
        arbol.insertar(300, "Pastillas de Freno", "Brembo", 8);
        arbol.insertar(700, "Bujia", "NGK", 30);
        arbol.insertar(200, "Correa de Distribucion", "Gates", 6);
        arbol.insertar(400, "Amortiguador", "Monroe", 12);
        arbol.insertar(600, "Radiador", "Valeo", 4);
        arbol.insertar(800, "Bateria", "ACDelco", 10);

        int opcion;

        do {

            System.out.println(
                    "\n--- INVENTARIO DE REPUESTOS (BST) ---");

            System.out.println(
                    "1. Registrar repuesto");

            System.out.println(
                    "2. Buscar repuesto");

            System.out.println(
                    "3. Backup PreOrden");

            System.out.println(
                    "4. Reporte de repuestos unicos");

            System.out.println(
                    "5. Salir");

            System.out.print(
                    "Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print(
                            "Codigo referencia: ");
                    int codigo =
                            scanner.nextInt();
                    scanner.nextLine();

                    System.out.print(
                            "Descripcion: ");
                    String descripcion =
                            scanner.nextLine();

                    System.out.print(
                            "Marca: ");
                    String marca =
                            scanner.nextLine();

                    System.out.print(
                            "Stock: ");
                    int stock =
                            scanner.nextInt();
                    scanner.nextLine();

                    arbol.insertar(
                            codigo,
                            descripcion,
                            marca,
                            stock);

                    System.out.println(
                            "Repuesto registrado.");
                    break;

                case 2:

                    System.out.print(
                            "Codigo a buscar: ");

                    int buscar =
                            scanner.nextInt();
                    scanner.nextLine();

                    Repuesto repuesto =
                            arbol.buscar(buscar);

                    if (repuesto != null)
                        System.out.println(
                                "\n" + repuesto);
                    else
                        System.out.println(
                                "Repuesto no encontrado.");

                    break;

                case 3:

                    arbol.backupPreOrden();
                    break;

                case 4:

                    arbol.reporteRepuestosUnicos();
                    break;

                case 5:

                    System.out.println(
                            "Saliendo...");
                    break;

                default:

                    System.out.println(
                            "Opcion invalida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
