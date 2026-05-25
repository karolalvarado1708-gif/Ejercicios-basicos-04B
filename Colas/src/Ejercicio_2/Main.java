package Colas.src.Ejercicio_2;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {

        ColaImpresion cola = new ColaImpresion();
        Scanner scanner = new Scanner(System.in);

        cola.enqueue(new Documento("PlanoCasa.pdf", "Carlos",15,true));

        cola.enqueue(new Documento("DiseñoPuente.pdf","Ana",30,false));

        cola.enqueue(new Documento("Render3D.pdf","Luis",20,true));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE IMPRESIÓN ---");
            System.out.println("1. Ver cola de impresión");
            System.out.println("2. Agregar documento");
            System.out.println("3. Imprimir documento");
            System.out.println("4. Calcular páginas totales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nDOCUMENTOS EN COLA:");
                    cola.imprimir();
                    break;

                case 2:

                    System.out.print("Nombre del archivo: ");
                    String archivo = scanner.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();

                    System.out.print("¿Es a color? (true/false): ");
                    boolean color = scanner.nextBoolean();

                    cola.enqueue(
                            new Documento(archivo, usuario, paginas, color));

                    System.out.println("Documento agregado correctamente.");
                    break;

                case 3:

                    Documento impreso = cola.dequeue();

                    if (impreso != null) {

                        System.out.println("\nImprimiendo documento:");
                        System.out.println(impreso);

                    } else {

                        System.out.println("No hay documentos en cola.");
                    }

                    break;

                case 4:

                    int total = cola.calcularPaginasTotales();

                    System.out.println(
                            "\nTotal de páginas pendientes: "
                            + total);

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