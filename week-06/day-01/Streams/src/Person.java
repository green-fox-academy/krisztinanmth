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

  public void setFamName(String famName) {
    this.famName = famName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
