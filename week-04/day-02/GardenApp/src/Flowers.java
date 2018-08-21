public class Flowers extends Plant {

  public Flowers(String color) {
    super(color);
    setType("flower");
    setMinWaterL(5);
    setWaterPercentage(0.75);
  }
}
