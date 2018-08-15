public class AnimalMain {
  public static void main(String[] args) {
    Animal cat = new Animal();

    System.out.print(cat.thirst() + " \t ");
    System.out.print(cat.hunger() + " \t ");
    System.out.print(cat.drink()  + " \t ");
    System.out.print(cat.eat()    + " \t ");
    System.out.print(cat.play()   + " \t ");
  }
}
