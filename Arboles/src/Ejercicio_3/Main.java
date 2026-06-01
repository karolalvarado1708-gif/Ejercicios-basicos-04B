package Ejercicio_3;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {

        ArbolNomina arbol = new ArbolNomina();
        Scanner scanner = new Scanner(System.in);

        arbol.insertar(1001, "Carlos Perez", "Gerente", 5000000);
        arbol.insertar(1008, "Laura Diaz", "Analista", 2800000);
        arbol.insertar(995, "Andres Gomez", "Supervisor", 3200000);
        arbol.insertar(1015, "Martha Ruiz", "Contadora", 3500000);
        arbol.insertar(990, "Julian Torres", "Auxiliar", 1800000);
        arbol.insertar(1020, "Paula Rojas", "Coordinadora", 4000000);

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE NOMINA (BST) ---");
            System.out.println("1. Ver empleados ordenados por cedula");
            System.out.println("2. Registrar empleado");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Buscar empleado con menor cedula");
            System.out.println("5. Buscar empleado con mayor cedula");
            System.out.println("6. Reporte de eficiencia");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println();
                    arbol.inOrden();
                    break;

                case 2:

                    System.out.print("Cedula: ");
                    long cedula = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    arbol.insertar(cedula, nombre, cargo, salario);

                    System.out.println("Empleado registrado.");
                    break;

                case 3:

                    System.out.print("Cedula a buscar: ");
                    long buscar = scanner.nextLong();
                    scanner.nextLine();

                    Empleado empleado = arbol.buscar(buscar);

                    if (empleado != null)
                        System.out.println("\n" + empleado);
                    else
                        System.out.println("Empleado no encontrado.");

                    break;

                case 4:
                    arbol.buscarMinimo();
                    break;

                case 5:
                    arbol.buscarMaximo();
                    break;

                case 6:
                    arbol.reporteEficiencia();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}
