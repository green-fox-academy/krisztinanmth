public class Clownfish extends Fish {

  public Clownfish(String name, int weight, String color, boolean isFed) {
    super(name, weight, color, isFed, 1);
  }

  @Override
  public String status() {
    if (!isFed()) {
      return String.format("%s, weight: %d, color: %s \n", getName(), getWeight(), getColor());
    } else {
      return String.format("%s, weight: %d, color: %s, stripe-color: white \n", getName(), getWeight(), getColor());
    }
  }

  @Override
  public void eat() {
    this.setWeight(this.getWeightGainWhenEating());
    setIsFed(true);
  }
}
