public class Ejercicio_11 {

    public static void main(String[] args) {

        String[] pasajeros = new String[6];

        pasajeros[0] = "Ana";
        pasajeros[1] = "Carlos";
        pasajeros[2] = "María";
        pasajeros[3] = "Luis";
        pasajeros[4] = "Sofía";
        pasajeros[5] = "Jorge";

        int asientosOcupados = 0;

        System.out.println("Lista de pasajeros del vuelo:\n");

        for (int i = 0; i < pasajeros.length; i++) {

            System.out.println("Asiento " + (i + 1) + ": " + pasajeros[i]);

            if (pasajeros[i] != null) {
                asientosOcupados++;
            }
        }

        System.out.println("\nTotal de asientos ocupados: " + asientosOcupados);
    }
}

