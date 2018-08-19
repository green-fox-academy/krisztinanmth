public class MultipleConstructors {
  //we can build multiple constructors and depending on how many arguments we have it
  //picks what constructor to use
  //so if you called an object with one argument it would have a constructor for that
  //and if you called that object with three arguments it would have a constructor with
  //three arguments
  private int hour;
  private int minute;
  private int second;

  //our first constructor - this one is with zero arguments
  public MultipleConstructors() {
    this(0, 0, 0);
  }
  //second constructor with one argument
  public MultipleConstructors(int h) {
    this(h, 0, 0);
  }
  //third constructor with two arguments
  public MultipleConstructors(int h, int m) {
    this(h, m, 0);
  }
  //fourth constructor with three arguments
  public MultipleConstructors(int h, int m, int s) {
    this(h, m, s);
  }

  public MultipleConstructors(int h, int m, int s) {
    setTime(h, m, s);
  }

  public void setTime(int h, int m, int s) {
    setHour(h);
    setMinute(m);
    setSecond(s);
  }

  public void setHour(int h) {
    hour = ((h >= 0 && h < 24) ? h : 0);
  }

  public void setMinute(int m) {
    minute = ((m >= 0 && m < 60) ? m : 0);
  }

  public void setSecond(int s) {
    second = ((s >= 0 && s < 60) ? s : 0);
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  public String toMilitary() {
    return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
  }
}











