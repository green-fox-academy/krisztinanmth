public class Plant {
  String color;
  int waterLevel;
  int minWaterL;
  double waterPercentage;
  boolean needsWater;

  Plant(String color, int waterLevel, int minWaterL, boolean needsWater) {
    this.color = color;
    this.waterLevel = waterLevel;
    this.minWaterL = minWaterL;
    this.needsWater = needsWater;
  }

  public void needsWater() {
    if(waterLevel < minWaterL) {
      System.out.println("The " + color + " needs water");
    }
    else {
      System.out.println("The " + color + " doesn't need water");
    }
  }

  public void plantWatered(int waterAmount) {
    double succesfulWatering;
    succesfulWatering = waterAmount * waterPercentage / 100;
  }
}

