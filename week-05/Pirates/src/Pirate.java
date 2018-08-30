import java.util.Map;

public class Pirate {
  int rumLevel = 0;
  boolean isPassedOut = false;
  double luck = Math.random();

  public void drinkSomeRum() {
    rumLevel++;
  }

  public void howsItGoingMate() {
    if (isPassedOut) {
      System.out.println("he is dead");
    } else if (rumLevel <= 4) {
      System.out.println("pour me anudder!");
    } else {
      System.out.println("arghh, i'ma pirate. how d'ya d'ink its goin?");
    }
  }

  public void die() {
    isPassedOut = true;
  }

  public void brawl(Pirate other) {
    if (luck <= 0.333) {
      isPassedOut = true;
    }
    if (other.luck <= 0.333) {
      other.isPassedOut = true;
    }
  }
}
