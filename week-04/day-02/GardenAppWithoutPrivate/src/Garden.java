import java.util.ArrayList;
import java.util.List;

public class Garden {
  //Garden 'has-a' relationship with Plant - so I need ArrayList
  List<Plant> plants;

  public Garden() {
    //Adam said I need to create new inside constructor, so every time I use as
    //instance of it it creates a new ArrayList .... though this is the part
    //I don't really get
    plants = new ArrayList<>();
  }


  public int whoNeedsWater() {
    int whoNeedsWater = 0;
    for (int i = 0; i < plants.size() ; i++) {
      whoNeedsWater ++;
    } return whoNeedsWater;
  }

  public void waterEachPlant(int waterAmount) {
    System.out.println("watering with: " + waterAmount);
    int eachAmount = waterAmount / whoNeedsWater();
    for (Plant myPlant : plants) {
      myPlant.waterPlantPlease(eachAmount);
    }
  }

  public void addPlants(Plant myPlant) {
    plants.add(myPlant);
  }

  public void gardenStatus() {
    for (Plant plant : plants) {
      plant.waterStatus();
    }
    System.out.println(" ");
  }
}






