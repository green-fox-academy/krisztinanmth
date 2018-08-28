public class Hero extends BaseHero implements Punchable{
  double motivation;
  String characterName;

  public Hero(String characterName) {
    super(characterName);
  }

  @Override
  public void punch(Punchable other) {

  }

  public int getMotivationLevel() {
    if (motivation < 25) {
      return 0;
    } else if (motivation >= 25 && motivation <= 40) {
      return 1;
    } else {
      return 2;
    }
  }

  public void punch(String characterName) {
    double damage;
    double divider = 1.5;
    if (getMotivationLevel() >= 1) {
      damage = motivation / divider;
    }
  }

  public void bePunched(double damage) {
    motivation = motivation - (damage / motivation);
  }

  public String toString(String characterName) {
    if (getMotivationLevel() == 0) {
      return characterName + "is not motivated anymore";
    } else if (getMotivationLevel() == 1) {
      return characterName + "is motivated";
    } else {
      return characterName + "is well motivated";
    }
  }
}
