import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    String tipoHabitacion;
    Albergue habitacion;
    int numPersonas, numNoches;
    boolean numPersonasValido = false;

    while(!numPersonasValido){
      System.out.print("Indica el tipo de habitacion que desea: ");
      tipoHabitacion = sc.nextLine();
      habitacion = Albergue.valueOf(tipoHabitacion);
      System.out.print("Indica el numero de personas: ");
      numPersonas = sc.nextInt();
      sc.nextLine(); // Limpiamos el buffer.
      System.out.println(" -- Comprobar que el numero de personas es valido -- ");
      numPersonasValido = habitacion.numPersonasValido(numPersonas);
    }
    System.out.print("Indica el numero de noches: ");
    numNoches = sc.nextInt();
    System.out.println(" -- Cuanto vale la habitacion en total -- ");
    System.out.println(" -- Cuanto vale la habitacion en total por persona -- ");
  }
}
