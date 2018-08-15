public class Animal {
  private int hunger;
  private int thirst;

  public Animal(){
    hunger = 50;
    thirst = 50;
  }

  public int hunger() {
    return hunger;
  }

  public int thirst() {
    return thirst;
  }

  public int eat() {
    hunger = hunger -1;
    return hunger;
  }

  public int drink() {
    thirst = thirst - 1;
    return thirst;
  }
  public int play() {
    thirst = thirst + 1;
    hunger = hunger + 1;
    return thirst + hunger;
  }
}
