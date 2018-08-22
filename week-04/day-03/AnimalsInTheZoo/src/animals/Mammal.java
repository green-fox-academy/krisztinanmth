package animals;

public class Mammal extends Animal {

  public void breed() {
    System.out.println("A " + name + " is breeding by pushing miniature versions out.");
  }

  public String getName() {
    this.name = "Koala";
    return this.name;
  }
}
