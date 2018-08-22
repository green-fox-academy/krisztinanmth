package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
    this.nameOfInstrument = "Electric Guitar";
  }

  @Override
  public String sound() {
    return "Twangg";
  }
}
