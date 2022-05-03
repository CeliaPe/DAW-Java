public class Main{
  public static void main(String[] args) {
    // No se pueden instanciar objetos de clases abstract
    // Animal miAnimal = new Animal();
    // System.out.println(miAnimal.durmiendo());

    Gato rafa = new Gato();
    System.out.println(rafa.durmiendo());
    System.out.println(rafa.onomatopeya());
    System.out.println(rafa.comiendo());
  }
}
