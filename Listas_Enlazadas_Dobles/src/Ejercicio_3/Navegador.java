package Ejercicio_3;

public class Navegador {

    Pestana cabeza;
    Pestana cola;

    public void abrirPestana(Pestana nueva) {

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void mostrarPestanas() {
        Pestana temp = cabeza;

        while (temp != null) {
            System.out.println("Título: " + temp.tituloPagina +
                    " | URL: " + temp.url +
                    " | Hora: " + temp.horaApertura);
            temp = temp.siguiente;
        }
    }

    public void cerrarPestanaActual(String url) {

        Pestana temp = cabeza;

        while (temp != null) {

            if (temp.url.equals(url)) {

                if (temp == cabeza && temp == cola) {
                    cabeza = null;
                    cola = null;
                }

                else if (temp == cabeza) {
                    cabeza = cabeza.siguiente;
                    cabeza.anterior = null;
                }

                else if (temp == cola) {
                    cola = cola.anterior;
                    cola.siguiente = null;
                }

                else {
                    temp.anterior.siguiente = temp.siguiente;
                    temp.siguiente.anterior = temp.anterior;
                }

                System.out.println("Pestaña cerrada: " + temp.tituloPagina);
                return;
            }

            temp = temp.siguiente;
        }

        System.out.println("No se encontró la pestaña.");
    }
}