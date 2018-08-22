package animals;

public abstract class Animal {
  String name;
  int age;

  public String getname(String name) {
    return name;
  }

  public void breed() {
    System.out.println("A " + name + " is breeding by laying eggs.");
  }
}
