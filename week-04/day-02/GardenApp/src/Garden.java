import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  public void addPlants(Plant plant) {
    garden.add(plant);
  }

  public int whoNeedsWater() {
    int whoNeedsWater = 0;
    for (int i = 0; i < garden.size() ; i++) {
      whoNeedsWater++;
    } return whoNeedsWater;
  }

  public void waterEachPlant(int waterAmount) {
    System.out.println("watering with: " + waterAmount);
    int eachAmount = waterAmount / whoNeedsWater();
    for (Plant myPlant : garden) {
      myPlant.waterPlantPlease(eachAmount);
    }
  }

  public void gardenStatus() {
    for (Plant plant : garden) {
      plant.waterStatus();
    }
    System.out.println(" ");
  }
}

