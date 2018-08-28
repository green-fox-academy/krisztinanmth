public class DCHero extends Hero {

  public DCHero(String name) {
    super(name, 45);
  }

  public DCHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    double damage = getMotivation() / 1.5;
    if (getMotivationLevel() >= 1 && other instanceof MarvelHero) {
      other.bePunched(damage);
    }
  }
}
