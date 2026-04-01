package Ejercicio_5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reproductor player = new Reproductor();
        int opcion;

        do {
            System.out.println("\n======================================");
            System.out.println("   SPOTIFY LITE 🎧");
            System.out.println("======================================");
            System.out.println("1. Agregar canción al final");
            System.out.println("2. Agregar canción a continuación");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Duración total");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                case 2:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Género: ");
                    String genero = sc.nextLine();

                    if (opcion == 1) {
                        player.agregarAlFinal(titulo, artista, duracion, genero);
                    } else {
                        player.agregarSiguiente(titulo, artista, duracion, genero);
                    }

                    System.out.println(" Canción agregada.");
                    break;

                case 3:
                    player.mostrarLista();
                    break;

                case 4:
                    player.duracionTotal();
                    break;

                case 5:
                    System.out.println(" Cerrando reproductor...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
