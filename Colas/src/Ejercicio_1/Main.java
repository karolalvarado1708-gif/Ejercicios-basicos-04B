package Colas.src.Ejercicio_1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ColaPaciente colaPacientes = new ColaPaciente();
        Scanner scanner = new Scanner(System.in);

        colaPacientes.enqueue(new Paciente("1010", "Carlos Ramirez",45, "Dolor de pecho"));

        colaPacientes.enqueue(new Paciente("2020", "Ana Torres", 30, "Fiebre alta"));

        colaPacientes.enqueue(new Paciente("3030", "Luis Gomez", 19,"Fractura en brazo"));

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE URGENCIAS HOSPITALARIAS ---");
            System.out.println("1. Ver pacientes en espera");
            System.out.println("2. Registrar paciente");
            System.out.println("3. Atender paciente");
            System.out.println("4. Atender todos los pacientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nPACIENTES EN ESPERA:");
                    colaPacientes.imprimir();
                    break;

                case 2:

                    System.out.print("Cédula: ");
                    String cedula = scanner.nextLine();

                    System.out.print("Nombre Completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Síntoma Principal: ");
                    String sintoma = scanner.nextLine();

                    colaPacientes.enqueue(
                            new Paciente(
                                    cedula,
                                    nombre,
                                    edad,
                                    sintoma));

                    System.out.println("Paciente registrado correctamente.");
                    break;

                case 3:

                    Paciente atendido = colaPacientes.dequeue();

                    if (atendido != null) {

                        System.out.println("\nPaciente atendido:");
                        System.out.println(atendido);

                    } else {

                        System.out.println("No hay pacientes en espera.");
                    }

                    break;

                case 4:

                    colaPacientes.atenderTodos();
                    break;

                case 5:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
