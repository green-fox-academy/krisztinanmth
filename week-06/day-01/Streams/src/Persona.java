public class Persona {
  private final String name;
  private final Gender gender;
  private final int age;

  public Persona(String theName, Gender theGender, int theAge) {
    name = theName;
    gender = theGender;
    age = theAge;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return String.format("%s == %s == %d", name, gender, age);
  }
}
