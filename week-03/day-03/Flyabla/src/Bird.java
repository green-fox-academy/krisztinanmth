public class Bird extends Animal implements Flyable {

  public Bird(String name, String color, int maxSpeed) {
    this.name = name;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

  @Override
  public String breed() {
    return name + " lays eggs";
  }

  @Override
  public String land() {
    return name + " lands with its legs";
  }

  @Override
  public String fly() {
    return name +" flies at a " + maxSpeed + " km/h maximum speed";
  }

  @Override
  public String takeOff() {
    return name + " takes off diagonally";
  }
}
