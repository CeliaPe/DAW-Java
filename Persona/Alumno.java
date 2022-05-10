public class Alumno extends Persona{
  private   String grado;               // Acceso solo desde la clase.
            String gradoSinMod;         // Acceso desde el paquete.
  protected String gradoProt;           // Acceso desde los hijos y el paquete.
  public    String gradoPubl;           // Acceso global.

  enum Nota{
    SOBRESALIENTE, NOTABLE, BIEN, SUFICIENTE, INSUFICIENTE;
  }

  Nota nota;

  public Alumno(){
    super();
    this.grado = "DAW";
    this.nota = Nota.SUFICIENTE;

  }
  public Alumno(String nombre, String dni, String grado){
    super(nombre,dni);
    this.grado = grado;
    this.nota = Nota.SUFICIENTE;
  }
  public Alumno(Alumno alumno){
    super(alumno.nombre,alumno.dni);
    this.grado = alumno.grado;
    this.nota = alumno.nota;
  }

  // Gets y Sets

  public String toString(){
    return super.toString() + " Estoy en el grado de " + this.grado + ". Tengo de nota un " + this.nota + ".";
  }

}
