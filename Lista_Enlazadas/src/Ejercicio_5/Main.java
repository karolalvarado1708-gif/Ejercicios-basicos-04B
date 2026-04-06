package Ejercicio_5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cancion player = new Cancion();
        int opcion;

        do {
            System.out.println("\n========== REPRODUCTOR ==========");
            System.out.println("1. Agregar canción al final");
            System.out.println("2. Agregar canción después de la actual");
            System.out.println("3. Ver lista de reproducción");
            System.out.println("4. Ver duración total");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo1 = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista1 = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Género: ");
                    String genero1 = sc.nextLine();

                    player.agregarAlFinal(titulo1, artista1, duracion1, genero1);
                    System.out.println(" Canción agregada al final.");
                    break;

                case 2:
                    System.out.print("Título: ");
                    String titulo2 = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista2 = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Género: ");
                    String genero2 = sc.nextLine();

                    player.agregarSiguiente(titulo2, artista2, duracion2, genero2);
                    System.out.println(" Canción agregada después de la actual.");
                    break;

                case 3:
                    player.mostrarLista();
                    break;

                case 4:
                    System.out.println("Duración total: " + player.duracionTotal() + " segundos");
                    break;

                case 5:
                    System.out.println(" Cerrando reproductor...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}