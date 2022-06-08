import java.util.ArrayList;

class Estructuras{
  public static void pruebaArrayList(){
    // System.out.println("Todavia no hemos probado el ArrayList...");
    System.out.println(" -> Creamos ArrayList de colores.");
    ArrayList<String> colores = new ArrayList<String>();
    System.out.println(" -> Imprimimos colores antes de aniadirle datos.");
    System.out.println(colores);
    System.out.println(" -> Introduciomos datos en colores.");
    colores.add("azul");
    colores.add("amarillo");
    colores.add("rojo");
    System.out.println( " -> Volvemos a imprimir colores despues de aniadirle" +
                        " datos.");
    System.out.println(colores);
    System.out.println(" -> Imprimimos el valor que hay en la casilla dos.");
    System.out.println(colores.get(2));
    System.out.println(" -> Cambiamos el color rojo por magenta.");
    colores.set(2,"magenta");
    System.out.println(colores);
    System.out.println(" -> Aniadimos el color negro.");
    colores.add(0,"negro");
    System.out.println(colores);
    System.out.println(" -> El ArrayList tiene tamanio " + colores.size() + ".");
    System.out.println(" -> Elimnamos el color negro.");
    colores.remove(0);
    System.out.println( " -> El ArrayList tiene tamanio " + colores.size() +
                        " despues de borrar el color negro.");
    System.out.println("Recorrer la ArrayList elemento a elemento.");
    for (String c : colores){
      System.out.println(c);
    }

  }
  public static void pruebaLinkedList(){
    System.out.println("Todavia no hemos probado el LinkedList...");
  }
  public static void pruebaHashMap(){
    System.out.println("Todavia no hemos probado el HashMap...");
  }
  public static void main(String[] args) {
    pruebaArrayList();
    pruebaLinkedList();
    pruebaHashMap();
  }
}
