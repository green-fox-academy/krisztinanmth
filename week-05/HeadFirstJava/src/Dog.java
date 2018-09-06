public class Dog {
  private String name;

//
//  public Dog(String name) {
//    this.name = name;
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void bark() {
    System.out.println(name + " says RUFF!");
  }

  public static void breed() {
    System.out.println("we are mammals, we breed with growing tiny creatures inside us");
  }

//  public void eat() {
//
//  }
//  public void chaseCat() {
//
//  }
}
