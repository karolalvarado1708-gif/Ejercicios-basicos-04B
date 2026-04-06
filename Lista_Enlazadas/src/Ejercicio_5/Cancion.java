package Ejercicio_5;

import java.util.ArrayList;

public class Cancion {

    private ArrayList<String> titulos = new ArrayList<>();
    private ArrayList<String> artistas = new ArrayList<>();
    private ArrayList<Integer> duraciones = new ArrayList<>();
    private ArrayList<String> generos = new ArrayList<>();

    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {
        titulos.add(titulo);
        artistas.add(artista);
        duraciones.add(duracion);
        generos.add(genero);
    }

    public void agregarSiguiente(String titulo, String artista, int duracion, String genero) {
        agregarAlFinal(titulo, artista, duracion, genero);
    }

    // Mostrar lista
    public void mostrarLista() {
        if (titulos.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        for (int i = 0; i < titulos.size(); i++) {
            System.out.println((i + 1) + ". " + titulos.get(i) +
                    " - " + artistas.get(i) +
                    " | " + duraciones.get(i) + "s | " +
                    generos.get(i));
        }
    }

    public int duracionTotal() {
        int total = 0;

        for (int d : duraciones) {
            total += d;
        }

        return total;
    }
}
