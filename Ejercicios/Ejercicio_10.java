public class Ejercicio_10 {

    public static void main(String[] args) {

        int[] configuracion = {1920, 1080, 60};

        int[] copiaConfiguracion = new int[configuracion.length];

        for (int i = 0; i < configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i];
        }

        System.out.println("Configuración original antes del cambio:");
        mostrarConfiguracion(configuracion);

        copiaConfiguracion[2] = 144; 

        System.out.println("\nConfiguración después de modificar la copia:");
        System.out.println("Original:");
        mostrarConfiguracion(configuracion);

        System.out.println("Copia:");
        mostrarConfiguracion(copiaConfiguracion);

    }

    public static void mostrarConfiguracion(int[] config) {
        System.out.println("Resolución: " + config[0] + "x" + config[1]);
        System.out.println("FPS: " + config[2]);
    }
}
        //  Explicación:
        //  Aquí creamos un nuevo arreglo en memoria con:
        //      new int[configuracion.length];
         
        //  Luego copiamos cada elemento manualmente.
        //  Esto crea una COPIA REAL (nuevo espacio en memoria).
         
        //  Si hubiéramos hecho:
        //      int[] copiaConfiguracion = configuracion;
         
        //  Solo se copiaría la referencia, y ambos apuntarían
        //  al mismo arreglo (como en los ejercicios anteriores).
         
        //  Como ahora son arreglos distintos en memoria,
        //  modificar la copia NO afecta al original.

