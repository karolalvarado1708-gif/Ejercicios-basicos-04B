package Pilas.src.Ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PilaMedicamentos dispensador = new PilaMedicamentos();
        Scanner scanner = new Scanner(System.in);

        dispensador.push(new Medicamento("Acetaminofén", "LOT-001", 45));
        dispensador.push(new Medicamento("Ibuprofeno", "LOT-002", 30));
        dispensador.push(new Medicamento("Amoxicilina", "LOT-003", 8));
        dispensador.push(new Medicamento("Loratadina", "LOT-004", 5));
        dispensador.push(new Medicamento("Omeprazol", "LOT-005", 20));

        int opcion;

        do {
            System.out.println("\n--- FARMACIA AUTOMATIZADA (PILAS) ---");
            System.out.println("1. Ver medicamentos en el dispensador");
            System.out.println("2. Registrar nuevo medicamento (Push)");
            System.out.println("3. Despachar medicamento seguro");
            System.out.println("4. Validar medicamento del tope");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    dispensador.imprimir();
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Lote: ");
                    String lote = scanner.nextLine();

                    System.out.print("Días para vencer: ");
                    int dias = scanner.nextInt();

                    dispensador.push(new Medicamento(nombre, lote, dias));

                    System.out.println("Medicamento agregado correctamente.");
                    break;

                case 3:
                    Medicamento seguro = dispensador.validarDespacho();

                    if (seguro != null) {
                        System.out.println("Medicamento despachado: " + seguro);
                    } else {
                        System.out.println("No hay medicamentos seguros para despachar.");
                    }
                    break;

                case 4:
                    Medicamento disponible = dispensador.validarDespachoSinRetirarSeguro();

                    if (disponible != null) {
                        System.out.println("Medicamento seguro en el tope: " + disponible);
                    } else {
                        System.out.println("La pila quedó vacía o no hay medicamento seguro.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
