package Ejercicio_4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArbolRanking arbol = new ArbolRanking();
        Scanner scanner = new Scanner(System.in);

        arbol.insertar(1750, "CarlosGM", "Colombia", 350);
        arbol.insertar(2100, "ChessKing", "Argentina", 500);
        arbol.insertar(1900, "MateRapido", "Peru", 275);
        arbol.insertar(2300, "MasterMove", "España", 620);
        arbol.insertar(1600, "PeonLoco", "Chile", 180);
        arbol.insertar(2000, "TorreNegra", "Mexico", 410);
        arbol.insertar(2200, "ReinaBlanca", "Brasil", 530);

        int opcion;

        do {

            System.out.println("\n--- TORNEO DE AJEDREZ (BST) ---");
            System.out.println("1. Ver ranking completo");
            System.out.println("2. Registrar jugador");
            System.out.println("3. Buscar jugador por ELO");
            System.out.println("4. Listar jugadores en rango ELO");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nRANKING COMPLETO\n");
                    arbol.inOrden();
                    break;

                case 2:

                    System.out.print("ELO: ");
                    int elo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre de usuario: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Pais: ");
                    String pais = scanner.nextLine();

                    System.out.print("Partidas jugadas: ");
                    int partidas = scanner.nextInt();
                    scanner.nextLine();

                    arbol.insertar(
                            elo,
                            usuario,
                            pais,
                            partidas);

                    System.out.println("Jugador registrado.");
                    break;

                case 3:

                    System.out.print("Ingrese ELO a buscar: ");
                    int buscar = scanner.nextInt();
                    scanner.nextLine();

                    Jugador jugador = arbol.buscar(buscar);

                    if (jugador != null)
                        System.out.println("\n" + jugador);
                    else
                        System.out.println("Jugador no encontrado.");

                    break;

                case 4:

                    System.out.print("ELO minimo: ");
                    int minimo = scanner.nextInt();

                    System.out.print("ELO maximo: ");
                    int maximo = scanner.nextInt();
                    scanner.nextLine();

                    arbol.listarEnRango(minimo, maximo);
                    break;

                case 5:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
