package Ejrcicio_3;

class Proceso {
    String nombre;
    int pid;
    int prioridad;
    int tiempoRestante;
    Proceso siguiente;

    public Proceso(String nombre, int pid, int prioridad, int tiempoRestante) {
        this.nombre = nombre;
        this.pid = pid;
        this.prioridad = prioridad;
        this.tiempoRestante = tiempoRestante;
        this.siguiente = null;
    }
}