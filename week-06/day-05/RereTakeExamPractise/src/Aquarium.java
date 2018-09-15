import java.util.ArrayList;
import java.util.List;

public class Aquarium {

  private List<Fish> aquarium;

  public Aquarium() {
    aquarium = new ArrayList<>();
  }

  public void add(Fish fish) {
    aquarium.add(fish);
  }

  public String status() {
    String statusOfFish = "";
    for (Fish fish : aquarium) {
      statusOfFish += fish.status();
    }
    return statusOfFish;
  }

  public void feed() {
    for (Fish fish : aquarium) {
      fish.eat();
    }
  }

  public void removeOversizeFish() {
    for (int i = 0; i < aquarium.size() ; i++) {
      if (aquarium.get(i).getWeight() >= 11 ) {
        aquarium.remove(i);
      }
    }
  }
}
