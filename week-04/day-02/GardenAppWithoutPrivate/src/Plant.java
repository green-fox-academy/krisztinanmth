public class Plant {
  String type;
  String color;
  int waterLevel;
  int minWaterL;
  double waterPercentage;

  public Plant() {
    waterLevel = 0;
  }

  public boolean needsWater() {
    if(waterLevel < minWaterL) {
      return true;
    } else {
      return false;
    }
  }

  public void waterStatus() {
    if(needsWater()) {
      System.out.println("The " + color + " " + type + " needs water");
    } else {
      System.out.println("The " + color + " " + type + " doesn't need water");
    }
  }

  public void waterPlantPlease(int waterAmount) {
    if(needsWater()) {
      waterLevel += waterAmount * waterPercentage;
    }
  }
}
