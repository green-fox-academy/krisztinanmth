public class Tang extends Fish {

  public Tang(String name, int weight, String color, boolean isFed) {
    super(name, weight, color, isFed, 1);
  }

  @Override
  public String status() {
    if (!isFed()) {
      return String.format("%s, weight: %d, color: %s, short-term memory loss: %b \n", getName(), getWeight(), getColor(), isShortTermMemoryLost());
    } else {
      return String.format("%s, weight: %d, color: %s, short-term memory loss: %b \n", getName(), getWeight(), getColor(), isShortTermMemoryLost() );
    }
  }

  @Override
  public void eat() {
    this.setWeight(this.getWeightGainWhenEating());
    setIsFed(true);
  }

  public boolean isShortTermMemoryLost() {
    return isFed();
  }
}
