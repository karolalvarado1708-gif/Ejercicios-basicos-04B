import java.util.Scanner;

public class Parcial {

    public static class Estudiante {
        int codigo;
        String nombre;
        double nota;

        public Estudiante(int codigo, String nombre, double nota) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.nota = nota;
        }
    }

    //Insertion Sort 
    public static void ordenar(Estudiante[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Estudiante key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].codigo > key.codigo) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Búsqueda binaria 
    public static Estudiante busquedaBinaria(Estudiante[] arr, int codigoBuscado) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (arr[medio].codigo == codigoBuscado) {
                return arr[medio];
            }

            if (arr[medio].codigo < codigoBuscado) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[6];
        int aprobados = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\nEstudiante " + (i + 1));

            System.out.print("Codigo: ");
            int codigo = sc.nextInt();
            sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Nota: ");
            double nota = sc.nextDouble();

            estudiantes[i] = new Estudiante(codigo, nombre, nota);

            if (nota >= 3.0) {
                aprobados++;
            }
        }

        ordenar(estudiantes);

        System.out.println("\n--- LISTADO ORIGINAL ---");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("cod: " + estudiantes[i].codigo +
                    " | nombre: " + estudiantes[i].nombre +
                    " | Nota: " + estudiantes[i].nota);
        }

        System.out.println("\n---Listado por ordenamiento ---");

        for (int i = 0; i < estudiantes.length; i++) {
            int notaEntera = (int)(estudiantes[i].nota * 100);

            System.out.print(estudiantes[i].codigo + ": " +
                    estudiantes[i].nombre +
                    " (" + notaEntera + ")");

            if (i < estudiantes.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println("\n\nAprobaron (>=3.0): " + aprobados);

        System.out.print("\nIngrese codigo a buscar: ");
        int codBuscar = sc.nextInt();

        Estudiante e = busquedaBinaria(estudiantes, codBuscar);

        if (e != null) {
            System.out.println(">> ENCONTRADO: " + e.nombre + " - Nota: " + e.nota);
        } else {
            System.out.println("No encontrado");
        }

        sc.close();
    }
}