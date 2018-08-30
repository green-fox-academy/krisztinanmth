import java.util.ArrayList;
import java.util.List;

public class PirateShip {
  List<Pirate> pirates;

  public PirateShip() {
    this.pirates = new ArrayList<>();
  }

  public void fillShip() {
    for (int i = 0; i < (Math.random() * 33 ); i++) {
      pirates.add(new Pirate());
    }
    pirates.get(0).drinkSomeRum();
  }

//  public String shipLog() {
//  }
}
