package main.java.music;
import main.java.music.Instrument;

public abstract class StringedInstrument  extends Instrument {
  int numberOfStrings;

  public StringedInstrument(int numberOfStrings) {
    super(numberOfStrings);
    this.numberOfStrings = numberOfStrings;
  }

  public void play() {
    System.out.println(nameOfInstrument + " a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }

  public abstract String sound();
}
