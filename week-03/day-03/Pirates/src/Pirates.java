public class Pirates {
  int rumLevel = 0;

  public int drinkSomeRum() {
    rumLevel++;
    return rumLevel;
  }

  public String howsItGoingMate() {
    if (rumLevel < 4) {
      return "pour me anudder!";
    } else {
      return "arghhh...i'm a pirate. how d'ya d'ink its going?";
    }
  }
}
