package Ejercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CatalogoBST catalogo = new CatalogoBST();
        Scanner scanner = new Scanner(System.in);

        catalogo.insertar(9781234567890L, "Estructuras de Datos", "Juan Perez", 2020);
        catalogo.insertar(9789876543210L, "Programacion Java", "Ana Gomez", 2022);
        catalogo.insertar(9781111111111L, "Bases de Datos", "Carlos Ruiz", 2019);
        catalogo.insertar(9785555555555L, "Redes de Computadores", "Laura Diaz", 2021);
        catalogo.insertar(9783333333333L, "Ingenieria de Software", "Mario Torres", 2023);

        int opcion;

        do {
            System.out.println("\n--- CATALOGO DIGITAL BIBLIOTECA (BST) ---");
            System.out.println("1. Ver catalogo ordenado por ISBN (InOrden)");
            System.out.println("2. Registrar nuevo libro");
            System.out.println("3. Verificar si un ISBN existe");
            System.out.println("4. Buscar libro por ISBN");
            System.out.println("5. Propiedades del arbol");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- CATALOGO ORDENADO ---");
                    catalogo.imprimirCatalogo();
                    break;

                case 2:
                    System.out.print("ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine();

                    if (catalogo.existeISBN(isbn)) {
                        System.out.println("El ISBN ya se encuentra registrado.");
                    } else {

                        System.out.print("Titulo: ");
                        String titulo = scanner.nextLine();

                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();

                        System.out.print("Anio de publicacion: ");
                        int anio = scanner.nextInt();
                        scanner.nextLine();

                        catalogo.insertar(isbn, titulo, autor, anio);

                        System.out.println("Libro registrado correctamente.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ISBN a verificar: ");
                    long isbnBuscar = scanner.nextLong();
                    scanner.nextLine();

                    if (catalogo.existeISBN(isbnBuscar))
                        System.out.println("El ISBN SI existe en el catalogo.");
                    else
                        System.out.println("El ISBN NO existe en el catalogo.");
                    break;

                case 4:
                    System.out.print("Ingrese el ISBN a buscar: ");
                    long isbnBusqueda = scanner.nextLong();
                    scanner.nextLine();

                    Libro libro = catalogo.buscar(isbnBusqueda);

                    if (libro != null)
                        System.out.println("Libro encontrado:\n" + libro);
                    else
                        System.out.println("No se encontro ningun libro con ese ISBN.");
                    break;

                case 5:
                    System.out.println("Altura del arbol: " + catalogo.altura());
                    System.out.println("Cantidad de hojas: " + catalogo.contarHojas());
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        scanner.close();
    }

}
