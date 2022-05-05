/*
------------------------
|   JugadorPro         |
|----------------------|
| - vehiculo           |
|----------------------|
| + JugadorPro()       |
| + Set...             |
| + Get...             |
| + conducir()         |
| + toString()         |
|----------------------|
*/

public class JugadorPro extends Jugador{
  protected Vehiculo coche;

  public JugadorPro(String nombre){
    super(nombre);
    this.coche = new Vehiculo();
  }

  //Constructor parámetros.
  //Constructor copia.
  //Get
  //Set

  public String toString(){
    return super.toString() + " " + coche.toString();
  }
}
