public class Main{
  public static void main (String[] args){
    Alumno miPersona = new Alumno("P", "98798787k", "DAW");
    System.out.println(miPersona);
    System.out.println("El nombre es " + miPersona.getNombre() + ".");
    System.out.println("El dni es " + miPersona.getDNI() + ".");
    miPersona.setNombre("Celia");
    miPersona.setDNI("12312312o");
    System.out.println(miPersona);
  }
}
