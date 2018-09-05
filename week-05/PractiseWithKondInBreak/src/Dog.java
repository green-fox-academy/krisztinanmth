public class Dog extends Animal {

  public static final String CLASSIFICATION = "mammal";

  private String name;

  public Dog() {
    super(null, 0, 0.0);
  }

  public Dog(String dogName, String color, int age) {
    super(color, age, 0.0);
    name = dogName;
  }

  public void sleep() {
    System.out.println("snoring");
  }

  @Override
  public void eat() {
    System.out.println("The dog is eating.");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public void bark() {
    System.out.printf("wouff");
  }

  @Override
  public boolean equals(Object obj) {
    Dog otherDog = (Dog) obj;
    return otherDog.getColor().equals(this.getColor()) &&
      otherDog.getAge() == this.getAge() &&
      otherDog.getName() == this.getName() &&
      otherDog.getWeight() == this.getWeight();
  }
}