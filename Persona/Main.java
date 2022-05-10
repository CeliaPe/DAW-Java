enum Color{
  AZUL(10), AMARILLO(15), VERDE(20), ROJO(25);

  private int numLapices;
  Color (int num){
    this.numLapices = num;
  }
  public int getNumLapices(){
    return this.numLapices;
  }
  // setNumLapices(){}
}

public class Main{
  public static void main (String[] args){
    Alumno miPersona = new Alumno("P", "98798787k", "DAW");
    System.out.println(miPersona);
    System.out.println("El nombre es " + miPersona.getNombre() + ".");
    System.out.println("El dni es " + miPersona.getDNI() + ".");
    miPersona.setNombre("Celia");
    miPersona.setDNI("12312312o");
    System.out.println(miPersona);

    System.out.println("Lista de colores:");
    Color arrColor[] = Color.values();
    for (Color c : arrColor){
      System.out.println(c);
    }
    System.out.println("Ordinal de ROJO:");
    Color miColor = Color.valueOf("ROJO");
    System.out.println(miColor.ordinal());

    System.out.println("Mostramos cuantos lápices tenemos de cada color:");
    for (Color c : Color.values()){
      System.out.println("Del color " + c + " tenemos " +c.getNumLapices() + " lapices.");
    }

    System.out.println(Color.AZUL.getNumLapices());
  }
}
