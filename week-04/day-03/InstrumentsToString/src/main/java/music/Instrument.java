package main.java.music;

public abstract class Instrument {
  protected String nameOfInstrument;
  int numberOfStrings;

  public Instrument(int numberOfStrings) {
    this.nameOfInstrument = nameOfInstrument;
    this.numberOfStrings = numberOfStrings;
  }

  public abstract void play();
}
