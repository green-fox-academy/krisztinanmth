import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plants> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlants(Plants plant) {
    plants.add(plant);
  }

  public String logGarden() {
    String temp = "";
    for (Plants plant : plants) {
      temp += plant.statusOfPlant(plant) + "\n";
    }
    return temp;
  }

  public void waterMyGarden(int water) {
    List<Plants> listOfPlantsWhoNeedWater = listOfPlantsWhoNeedWater();
    double waterForOnePlant = (double) water / listOfPlantsWhoNeedWater.size();
    for (Plants plant : listOfPlantsWhoNeedWater) {
      plant.absorbWater(waterForOnePlant);
    }
  }

  public List<Plants> listOfPlantsWhoNeedWater() {
    List<Plants> listOfPlantsWhoNeedWater = new ArrayList<>();
    for (Plants plant : plants) {
      if (plant.needsWater()) {
        listOfPlantsWhoNeedWater.add(plant);
      }
    }
    return listOfPlantsWhoNeedWater;
  }
}
