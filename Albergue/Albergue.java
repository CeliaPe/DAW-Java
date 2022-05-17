public enum Albergue{
  SIMPLE(1,50,4),
  DOBLE(2,80,4),
  TRIPLE(3,100,4),
  MULTIPLE(6,150,4);

  private int personas;
  private double precio;
  private int disponibles;

  Albergue(int personas, double precio, int disponibles){
    this.personas = personas;
    this.precio = precio;
    this.disponibles = disponibles;
  }
}
