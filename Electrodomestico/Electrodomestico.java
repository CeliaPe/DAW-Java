/*
------------------------
|   Electrodomestico   |
|----------------------|
| - precioBase         |
| - color              |
| - consumoEnergetico  |
| - peso               |
|----------------------|
| + precioFinal()      |
|----------------------|
*/

public class Electrodomestico{
  private double precioBase;
  private String color;                 //Blanco, Negro, Rojo, Azul, Metalizado.
  private String consumoEnergetico;
  private double peso;

  // NUEVO -> final static == const
  private final static double PRECIO = 100;
  private final static String COLOR = "blanco"; // Para escribir COLOR cada vez que queramo poner el color por defecto.
  private final static String CONSUMO = "F";
  private final static double PESO = 20;

  //Constructores
  public Electrodomestico(){
    /*this.precioBase = 100;
    this.color = "Blanco";
    this.consumoEnergetico = "F";
    this.peso = 20;*/
    this(PRECIO,COLOR,CONSUMO,PESO);            //Llama al constructor con parámetros.
  }
  public Electrodomestico(double precioBase, String consumoEnergetico){
    /*this.precioBase = precioBase;
    this.color = "Blanco";
    this.consumoEnergetico = consumoEnergetico;
    this.peso = 20;*/
    this(precioBase,COLOR,consumoEnergetico,PESO);
  }
  public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso){
    this.precioBase = precioBase;
    //this.color = color;
    this.setColor(color);
    this.consumoEnergetico = consumoEnergetico;
    this.peso = peso;
  }
  public Electrodomestico(Electrodomestico electrodomestico){
    /*this.precioBase = electrodomestico.precioBase;
    this.color = electrodomestico.color;
    this.consumoEnergetico = electrodomestico.consumoEnergetico;
    this.peso = electrodomestico.peso;*/
    this(electrodomestico.precioBase,electrodomestico.color,electrodomestico.consumoEnergetico,electrodomestico.peso);
  }

  // Set y Get
  public void setPrecioBase(double precioBase){
    this.precioBase = precioBase;
  }
  public void setColor(String color){
    //this.color = color;
    comprobarColor(color);
  }
  public void setConsumoEnergetico(String consumoEnergetico){
    this.consumoEnergetico = consumoEnergetico;
  }
  public void setPeso(double peso){
    this.peso = peso;
  }
  public double getPrecioBase(){
    return this.precioBase;
  }
  public String getColor(){
    return this.color;
  }
  public String getConsumoEnergetico(){
    return this.consumoEnergetico;
  }
  public double getPeso(){
    return this.peso;
  }

  private void comprobarColor(String color){
    String colores[] = {"blanco","negro","rojo","azul","metalizado"};
    boolean encontrado = false;

    this.color = COLOR;              //Por defecto.
    color = color.toLowerCase();
    for (int i = 0 ; i < colores.length && !encontrado ; i++){
      if (colores[i].equals(color)){
        encontrado = true;
        this.color = color;
      }
    }
  }

  public String toString(){
    return "El precio base es  " + this.precioBase + ", el color es " + this.color + ", el consumo es " + this.consumoEnergetico + ", el peso es "+ this.peso + ".";
  }
}
