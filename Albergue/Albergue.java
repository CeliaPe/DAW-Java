public enum Albergue{
  SIMPLE(1,50),
  DOBLE(2,80),
  TRIPLE(3,100),
  MULTIPLE(6,150);

  private int personas;
  private double precio;

  Albergue(int personas, double precio){
    this.personas = personas;
    this.precio = precio;
  }
}
