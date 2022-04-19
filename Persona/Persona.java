public class Persona{
  private String nombre;
  private String dni;

  //Constructores
  public Persona(){
    this.nombre = "Celia";
    this.dni = "12345678H";
  }

  //ToString
  public String toString(){
    return "Me llamo " + this.nombre + " y mi dni es " + this.dni + ".";
  }
}
