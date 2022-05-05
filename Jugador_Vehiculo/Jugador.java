/*
------------------------
|   Jugador            |
|----------------------|
| # Nombre             |
| # Vidas              |
| # Coordenadas        |
|----------------------|
| + Jugador()          |
| + Set...             |
| + Get...             |
| + andar()            |
| + toString()         |
|----------------------|
*/

public class Jugador{
  protected String nombre;
  protected int vidas;
  protected int[] coordenadas;

  private final int VIDAS = 3;
  private final int[] COOR = {0,0};

  public Jugador(String nombre){
    this.nombre = nombre;
    this.vidas = VIDAS;
    this.coordenadas = COOR;
  }

  //Constructor parámetros.
  //Constructor copia.

  //Get
  //Set

  private String imprCoor(){
    return ("(" + coordenadas[0] + ","+ coordenadas[1]+")");
  }

  public String toString(){
    return "A " + this.nombre + " le quedan " + this.vidas + " vidas y esta en las coordenadas " + this.imprCoor() + ".";
  }
}
