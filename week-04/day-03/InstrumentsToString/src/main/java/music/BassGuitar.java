package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
    this.nameOfInstrument = "Bass Guitar";
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
