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

  public int getPersonas(){
    return this.personas;
  }
  public double getPrecio(){
    return this.precio;
  }
  public int getDisponibles(){
    return this.disponibles;
  }

  // setPersona y setPrecio no son necesarios para nuestro código.
  /*public void setPersonas(int personas){
    this.personas = personas;
  }
  public void setPrecio(double precio){
    this.precio = precio;
  }*/
  public void setDisponibles(int disponibles){
    this.disponibles = disponibles;
  }

  public boolean numPersonasValido(int numPersonas){
    System.out.println("Entramos en numPersonasValido()");
    return true;
  }
}
