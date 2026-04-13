package Ejercicio_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Monitoreo sistema = new Monitoreo();
        int opcion;

        do {
            System.out.println("\n======================================");
            System.out.println("   MONITOREO INDUSTRIAL");
            System.out.println("======================================");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar lecturas");
            System.out.println("3. Mostrar temperatura máxima");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("ID Sensor: ");
                    int id = sc.nextInt();

                    System.out.print("Temperatura: ");
                    double temp = sc.nextDouble();

                    System.out.print("Presión: ");
                    double presion = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    sistema.agregarLectura(id, temp, presion, hora);
                    System.out.println(" Lectura agregada.");
                    break;

                case 2:
                    sistema.mostrarLecturas();
                    break;

                case 3:
                    sistema.temperaturaMaxima();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
