public class GardenApp {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Flowers yellow = new Flowers("yellow");
    Flowers blue = new Flowers("blue");
    Trees purple = new Trees("purple");
    Trees orange = new Trees("orange");
    garden.addPlants(yellow);
    garden.addPlants(blue);
    garden.addPlants(purple);
    garden.addPlants(orange);

    garden.gardenStatus();
    for (int i = 0; i < 2 ; i++) {
      if(i == 0) {
        garden.waterEachPlant(40);
      } else {
        garden.waterEachPlant(70);
      }
      garden.gardenStatus();
    }
  }
}
