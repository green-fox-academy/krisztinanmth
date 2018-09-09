public class Fox {
  private String name;
  private String type;
  private String color;

  public Fox(String name, String type, String color) {
    this.name = name;
    this.type = type;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public String getColor() {
    return this.color;
  }

  @Override
  public String  toString() {
    return String.format("%s-type of %s /color: %s", this.name, this.type, this.color);
  }
}
