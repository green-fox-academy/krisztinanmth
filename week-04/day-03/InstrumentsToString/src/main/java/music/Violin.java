package main.java.music;

public class Violin extends StringedInstrument{

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    this.nameOfInstrument = "Violin";
  }

  @Override
  public String sound() {
    return "Screech";
  }
}
