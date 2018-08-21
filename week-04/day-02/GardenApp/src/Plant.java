
public class Plant {
  private String type;
  private String color;
  private int waterLevel;
  private int minWaterL;
  private double waterPercentage;

  public Plant(String color) {
    this.color = color;
    waterLevel = 0;
  }

  public boolean needsWater() {
    if(waterLevel < minWaterL) {
      return true;
    } else {
      return false;
    }
  }

  public void waterPlantPlease(int waterAmount) {
    if (needsWater())
    waterLevel += waterAmount * waterPercentage;
  }

  public void waterStatus() {
    if (needsWater()) {
      System.out.println("The " + color + " " + type + " needs water");
    } else {
      System.out.println("The " + color + " " + type + " doesn't need water");
    }
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setMinWaterL(int minWaterL) {
    this.minWaterL = minWaterL;
  }

  public void setWaterPercentage(double waterPercentage) {
    this.waterPercentage = waterPercentage;
  }
}


