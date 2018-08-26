import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Carrier {
  List<AirCraft> carrier;
  int healthPoints;
  int ammoStorage;

  public Carrier(int ammoStorage, int healthPoints) {
    carrier = new ArrayList<>();
    this.healthPoints = healthPoints;
    this.ammoStorage = ammoStorage;
  }
  public void addAirCraft(AirCraft airCraft) {
    this.carrier.add(airCraft);
  }
  public void fill(int ammoStorage) {
    if
  }
}
