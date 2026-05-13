package Parcial_2Corte.Ejercicio_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Cartelera peliculaCartelera = new Cartelera();

        do {
            System.out.println("\n==============================================");
            System.out.println("   Cartelera De Cine - Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar Pelicula");
            System.out.println("2. Buscar Pelicula por ID");
            System.out.println("3. Ver Cartelera");
            System.out.println("0. Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.print("TITULO: ");
                    String titulo = sc.nextLine();
                    sc.nextLine();

                    System.out.print("genero: ");
                    String genero = sc.nextLine();

                    System.out.print("Duracion (Tiempo): ");
                    double duracion = sc.nextDouble();

                    Pelicula nuevo = new Pelicula(titulo, genero, duracion);
                    peliculaCartelera.agregarPelicula(nuevo);
                    break;

                case 2:
                    System.out.print("Ingrese titulo a buscar: ");
                    String buscar = sc.nextLine();

                    Pelicula encontrado = peliculaCartelera.buscarPelicula(buscar);

                    if (encontrado != null) {
                        System.out.println(": " + encontrado.genero);
                        System.out.println("Tiempo: " + encontrado.duracion);
                    } else {
                        System.out.println("Pelicula no encontrado");
                    }
                    break;

                case 3:
                    peliculaCartelera.mostrarEstado();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
