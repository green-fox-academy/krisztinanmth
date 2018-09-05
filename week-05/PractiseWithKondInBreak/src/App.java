import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
    Dog bloki = new Dog("Bloki", "black", 3);
    Dog bloki2 = new Dog("Bloki", "black", 3);
    Dog rex = new Dog("Rex", "wolfy", 4);
    Dog furkesz = new Dog();
    furkesz.setName("Furkesz");
    System.out.println(Dog.CLASSIFICATION);

    Bird bird = new Bird("colorful", 1, 0.2, true);

    List<Animal> animals = new ArrayList<>();
    animals.add(bloki);
    animals.add(rex);
    animals.add(bird);

    feedAnimals(animals);

    System.out.println(bloki.equals(bloki2));

    String string1 = "apple";
    String string2 = "app";
    string2 += "le";

    System.out.println(string1.equals(string2));


  }

  private static void feedAnimals(List<Animal> animals) {
    for (Animal animal : animals) {
      animal.eat();
    }
  }

}
