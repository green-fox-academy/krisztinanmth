package animals;

public abstract class Animal {
  String name;
  int age;

  public String getName() {
    return this.name;
  }

  public abstract String breed();
}
