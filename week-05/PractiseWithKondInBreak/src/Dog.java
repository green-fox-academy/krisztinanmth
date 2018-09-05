public class Dog extends Animal {

  public static final String CLASSIFICATION = "mammal";
  //static mivel minden egyes peldanyra igaz a classon belul - ezt magan a classon tudom meghivni - lasdd App -ben
  //mivel static nem tudom a kulon objektekre rahivni

  private String name;

  public Dog() {

  }

  public Dog(String dogName, String color, int age) {
    super(color, age, 0.0);
    name = dogName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public  void bark() {
    System.out.printf("woof");
  }
}
