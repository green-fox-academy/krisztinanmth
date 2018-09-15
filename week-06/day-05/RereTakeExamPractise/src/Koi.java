public class Koi extends Fish {

  public Koi(String name, int weight, String color) {
    super(name, weight, color, false, 2);
  }

  @Override
  public String status() {
    return String.format("%s, weight: %d, color: %s \n", getName(), getWeight(), getColor());
  }

  @Override
  public void eat() {
    this.setWeight(this.getWeightGainWhenEating());
    setIsFed(true);
  }
}
