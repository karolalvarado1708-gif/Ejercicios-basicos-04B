package Ejercicio_2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Inventario inventario = new Inventario();

        do {
            System.out.println("\n==============================================");
            System.out.println("   INVENTARIO DE LÁCTEOS - Menú");
            System.out.println("==============================================");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos próximos a vencer (<5 días)");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("0. Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Ingrese días para vencer: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    Producto nuevo = new Producto(nombre, cantidad, dias);
                    inventario.agregarProducto(nuevo);

                    System.out.println("Producto agregado correctamente.");
                    break;

                case 2:
                    System.out.println("Productos próximos a vencer:");
                    inventario.mostrarProximosAVencer();
                    break;

                case 3:
                    System.out.println("Lista completa:");
                    inventario.mostrarTodos();
                    break;

                case 0:
                    System.out.println("¡Saliendo del sistema!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
} 
