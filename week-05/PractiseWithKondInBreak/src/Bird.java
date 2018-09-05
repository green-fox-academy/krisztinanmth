public class Bird extends Animal {

  private boolean canFly;

  public Bird(String color, int age, double weight, boolean canFly) {
    super(color, age, weight);
    this.canFly = canFly;
  }

  public boolean canFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  @Override
  void sleep() {
    System.out.printf("whistling");
  }
}