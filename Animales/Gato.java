// Gato hereda de Animal:
/*public class Gato extends Animal{
  // Constructores

  // Métodos
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return "Zzz... RRRrrrRrrRrrRRrRRRr";
  }
  public String comiendo(){
    this.alimentacion = "raspas de pescado";
    return "Yo como " + this.alimentacion + ".";
  }
}*/
//Gato implementa la interfaz de Animales_Intfz
public class Gato implements Animales_Intfz{
  // Constructores

  // Métodos
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return "Zzz... RRRrrrRrrRrrRRrRRRr";
  }
  public String comiendo(){
    String alimentacion = "raspas de pescado";
    return "Yo como " + alimentacion + ".";
  }
}
