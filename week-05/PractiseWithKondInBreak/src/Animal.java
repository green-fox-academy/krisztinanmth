public class Animal {
  private String color;
  private int age;
  private double weight;

  public Animal() {

  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public Animal(String color, int age, double weight) {
    this.color = color;
    this.age = age;
    this.weight = weight;


  }
}
