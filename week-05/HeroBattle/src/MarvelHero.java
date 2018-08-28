public class MarvelHero extends Hero {

  public MarvelHero(String characterName) {
    super(characterName, 40);
  }

  public MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    double damage = getMotivation() / 1.5;
    if (getMotivationLevel() >= 1 && other instanceof DCHero) {
      other.bePunched(damage);
    }
  }
}
