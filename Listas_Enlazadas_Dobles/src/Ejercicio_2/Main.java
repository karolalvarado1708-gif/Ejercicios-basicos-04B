package Ejercicio_2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Galeria galeria = new Galeria();
        Fotografia fotoActual = null;

        do {
            System.out.println("\n==============================================");
            System.out.println("      Carrusel de Imágenes - Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Foto");
            System.out.println("  [2] Siguiente Foto");
            System.out.println("  [3] Foto Anterior");
            System.out.println("  [4] Reproducir Galería");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.println("\n--- Agregar Foto ---");

                    System.out.print("Ingrese el nombre del archivo: ");
                    String nombreArchivo = sc.nextLine();

                    System.out.print("Ingrese el tamaño en MB: ");
                    double tamanoMB = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Ingrese la resolución: ");
                    String resolucion = sc.nextLine();

                    Fotografia nuevaFoto = new Fotografia(nombreArchivo, tamanoMB, resolucion);
                    galeria.agregarFoto(nuevaFoto);

                    if (fotoActual == null) {
                        fotoActual = nuevaFoto;
                    }

                    System.out.println("Foto agregada correctamente.");
                    break;

                case 2:
                    System.out.println("\n--- Siguiente Foto ---");

                    if (fotoActual != null) {
                        System.out.println("Foto actual: " + fotoActual.nombreArchivo);
                        fotoActual = galeria.siguienteFoto(fotoActual);
                        System.out.println("Ahora estás en: " + fotoActual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos en la galería.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Foto Anterior ---");

                    if (fotoActual != null) {
                        System.out.println("Foto actual: " + fotoActual.nombreArchivo);
                        fotoActual = galeria.fotoAnterior(fotoActual);
                        System.out.println("Ahora estás en: " + fotoActual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos en la galería.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Reproducir Galería ---");

                    if (galeria.cabeza != null) {
                        galeria.reproducirGaleria();
                    } else {
                        System.out.println("La galería está vacía.");
                    }
                    break;

                case 0:
                    System.out.println("\n¡Saliendo..!");
                    break;

                default:
                    System.out.println("\nOpción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}