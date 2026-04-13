package Ejercicio_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        Navegador navegador = new Navegador();

        do {
            System.out.println("\n=================================");
            System.out.println("        NAVEGADOR - MENÚ");
            System.out.println("=================================");
            System.out.println("[1] Abrir pestaña");
            System.out.println("[2] Mostrar pestañas");
            System.out.println("[3] Cerrar pestaña por URL");
            System.out.println("[0] Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("URL: ");
                    String url = sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    Pestana nueva = new Pestana(titulo, url, hora);
                    navegador.abrirPestana(nueva);

                    System.out.println("Pestaña abierta.");
                    break;

                case 2:
                    navegador.mostrarPestanas();
                    break;

                case 3:
                    System.out.print("Ingrese URL a cerrar: ");
                    String urlCerrar = sc.nextLine();

                    navegador.cerrarPestanaActual(urlCerrar);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}