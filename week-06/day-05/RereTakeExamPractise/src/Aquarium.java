import java.util.List;

public class Aquarium {

  private List<Fish> aquarium;

  public Aquarium(List<Fish> aquarium) {
    this.aquarium = aquarium;
  }

  public void add(Fish fish) {
    aquarium.add(fish);
  }
}
