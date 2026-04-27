package Ejercicio_2;

class Carrusel {
    Anuncio cabeza;

    public void agregarAnuncio(String titulo, int duracion, String categoria) {
        Anuncio nuevo = new Anuncio(titulo, duracion, categoria);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza; 
        } else {
            Anuncio temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza; 
        }
    }

    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        Anuncio actual = cabeza;
        int tiempoTotal = 0;
        Anuncio masRepetido = cabeza;

        for (int i = 0; i < ciclos; i++) {
            do {
                System.out.println("Mostrando: " + actual.titulo);

                actual.vecesRepetido++;
                tiempoTotal += actual.duracionSegundos;

                if (actual.vecesRepetido > masRepetido.vecesRepetido) {
                    masRepetido = actual;
                }

                actual = actual.siguiente;

            } while (actual != cabeza);
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Tiempo total en pantalla: " + tiempoTotal + " segundos");
        System.out.println("Anuncio más repetido: " + masRepetido.titulo +
                " (" + masRepetido.vecesRepetido + " veces)");
    }
}