public class App {
  public static void main(String[] args) {

    Dog bloki = new Dog("bloki", "black", 3);
    Dog rex = new Dog("rex", "wolfy", 4);
    Dog furkesz = new Dog();
    furkesz.setName("furkesz");
    System.out.println(Dog.CLASSIFICATION);
    furkesz.bark();
  }
}
