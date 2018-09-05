public class Bird extends Animal {

  private boolean canFly;

  public Bird(String color, int age, double weight, boolean canFly) {
    super(color, age , weight);
    this.canFly = canFly;
  }
}
