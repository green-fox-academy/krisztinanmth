public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name, String color, int maxSpeed) {
    this.name = name;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

  @Override
  public String land() {
    return name + " lands with gears";
  }

  @Override
  public String fly() {
    return name + " flies at a " + maxSpeed + " km/h maximum speed";
  }

  @Override
  public String takeOff() {
    return name + " takes off vertically";
  }
}
