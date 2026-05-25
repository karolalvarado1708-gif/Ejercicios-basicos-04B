package Colas.src.Ejercicio_1;

public class Paciente {

  String Cedula;
  String nombreCompleto;
  int edad;
  String sintomaPrincipal;

  Paciente siguiente;

  public Paciente(String Cedula, String nombreCompleto, int edad, String sintomaPrincipal) {
    this.Cedula = Cedula;
    this.nombreCompleto = nombreCompleto;
    this.edad = edad;
    this.sintomaPrincipal = sintomaPrincipal;
    this.siguiente = null;
  }

}
