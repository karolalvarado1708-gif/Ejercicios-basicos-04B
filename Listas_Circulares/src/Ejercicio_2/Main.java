package Ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carrusel carrusel = new Carrusel();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Reproducir carrusel");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Ingrese duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese categoría: ");
                    String categoria = sc.nextLine();

                    carrusel.agregarAnuncio(titulo, duracion, categoria);
                    break;

                case 2:
                    System.out.print("Ingrese cantidad de ciclos: ");
                    int ciclos = sc.nextInt();

                    carrusel.reproducir(ciclos);
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}
