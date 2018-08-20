public class Plant {
  String type;
  String color;
  int waterLevel;
  int minWaterL;
  double waterPercentage;
  boolean needsWater;

  public Plant(String type, String color, int waterLevel, int minWaterL, boolean needsWater) {
    this.type = type;
    this.color = color;
    this.waterLevel = waterLevel;
    this.minWaterL = minWaterL;
    this.needsWater = needsWater;
  }

  public void needsWater() {
    if(waterLevel <= minWaterL) {
      System.out.println("The " + color + type + " needs water");
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

