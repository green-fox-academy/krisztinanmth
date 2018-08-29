public class MarvelHero extends Hero {

  public MarvelHero(String characterName) {
    super(characterName, 40);
  }

  public MarvelHero(String name, int motivation) {
    super(name, motivation);
  }

  @Override
  public void punch(Punchable other) {
    if (other instanceof DCHero) {
      super.punch(other);
    }
  }
}
