import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<AirCraft> carrier;
  int ammoLevel;
  int ammoStorage;
  int healthPoints;

  public Carrier(int ammoStorage, int healthPoints) {
    carrier = new ArrayList<>();
    this.healthPoints = healthPoints;
  }


  public void addAirCraft(AirCraft airCraft) {
    carrier.add(airCraft);
  }

  public int ammoNecessary(int ammoMax) {
    int ammoNedded;
    ammoNedded = (ammoMax - ammoLevel) * carrier.size();
    return ammoNedded;
  }

//  public int allAmmo(int ammoLevel) {
//    int allAmmo;
//    allAmmo = ammoLevel * carrier.size();
//    return allAmmo;
//  }

//  public void fill() {
//    if (ammoStorage < ammoNecessary() &&) {
//      for (AirCraft airCraft : carrier) {
//        airCraft.refill(ammoStorage);
//      }
//    }
//  }
}
