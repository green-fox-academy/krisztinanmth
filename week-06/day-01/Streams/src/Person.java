public class Person {
  private String firstName;
  private String famName;
  private int age;

  public Person(String firstName, String famName, int age) {
    this.firstName = firstName;
    this.famName = famName;
    this.age = age;
  }

  public String getFamName() {
    return famName;
  }

  public String getFirstName() {
    return firstName;
  }
}
