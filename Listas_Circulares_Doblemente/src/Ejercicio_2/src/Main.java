import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Historial h = new Historial();

        int opcion;

        do {
            System.out.println("\n===== HISTORIAL DE COMANDOS =====");
            System.out.println("1. Agregar comando");
            System.out.println("2. Mover arriba (↑)");
            System.out.println("3. Mover abajo (↓)");
            System.out.println("4. Mostrar comando actual");
            System.out.println("5. Eliminar comando actual");
            System.out.println("6. Mostrar historial completo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Comando: ");
                    String texto = sc.nextLine();

                    System.out.print("¿Fue exitoso? (true/false): ");
                    boolean exitoso = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Directorio: ");
                    String dir = sc.nextLine();

                    h.agregar(texto, exitoso, dir);
                    break;

                case 2:
                    h.arriba();
                    h.mostrarCursor();
                    break;

                case 3:
                    h.abajo();
                    h.mostrarCursor();
                    break;

                case 4:
                    h.mostrarCursor();
                    break;

                case 5:
                    h.eliminarActual();
                    System.out.println(" Comando eliminado.");
                    break;

                case 6:
                    h.mostrarHistorial();
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