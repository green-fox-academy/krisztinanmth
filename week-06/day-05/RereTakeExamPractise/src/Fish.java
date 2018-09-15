public abstract class Fish {

  private String name;
  private int weight;
  private String color;
  private boolean isFed;
  private int weightGainWhenEating;

  public Fish(String name, int weight, String color, boolean isFed, int weightGainWhenEating) {
    this.name = name;
    this.weight = weight;
    this.color = color;
    this.isFed = isFed;
    this.weightGainWhenEating = weightGainWhenEating;
  }

  public abstract String status();

  public abstract void eat();

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weightGainWhenEating) {
    this.weight += weightGainWhenEating;
  }

  public int getWeightGainWhenEating() {
    return weightGainWhenEating;
  }

  public boolean isFed() {
    return isFed;
  }

  public void setIsFed(boolean isFed) {
    this.isFed = isFed;
  }
}
