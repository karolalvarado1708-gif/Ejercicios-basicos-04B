package Ejercicio_5;

public class Repuesto {

    int codigoRef;
    String descripcion;
    String marca;
    int stock;

    Repuesto izquierda;
    Repuesto derecha;

    public Repuesto(int codigoRef, String descripcion,
                    String marca, int stock) {

        this.codigoRef = codigoRef;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;

        izquierda = null;
        derecha = null;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigoRef +
               "\nDescripcion: " + descripcion +
               "\nMarca: " + marca +
               "\nStock: " + stock + " unidades";
    }
}
