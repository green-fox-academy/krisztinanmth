//toString built in method in java

public class toString {
  private int month;
  private int day;
  private int year;

  public toString(int m, int d, int y) {
    month = m;
    day = d;
    year = y;

    System.out.printf("The constructor for this is %s\n", this);
  }

  public String toSring() {
    return String.format("%d%d%d", month, day, year);
  }
}
