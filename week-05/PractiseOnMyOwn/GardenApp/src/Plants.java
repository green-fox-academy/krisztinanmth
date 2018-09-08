public class Plants {
  private String color;
  private String type;
  private int waterLevel;
  private double waterAbsorption;
  private int maxWaterLev;

  public Plants(String color, String type, double waterAbsorption, int maxWaterLev) {
    this.color = color;
    this.type = type;
    this.waterAbsorption = waterAbsorption;
    this.maxWaterLev = maxWaterLev;
    waterLevel = 0;
  }

  public String getColor() {
    return this.color;
  }

  public String getType() {
    return this.type;
  }


  public boolean needsWater() {
    return (waterLevel < maxWaterLev);
  }

  public String statusOfPlant(Plants plant) {
    if (plant.needsWater()) {
      return "the " + plant.getColor()+ " " + plant.getType() + " needs water";
    }
    return "the " + plant.getColor() + " " + plant.getType() + " doesn't need water";
  }

  public void absorbWater(double waterForOnePlant) {
    double absorbWater = waterForOnePlant * waterAbsorption;
    waterLevel += absorbWater;
  }
}
