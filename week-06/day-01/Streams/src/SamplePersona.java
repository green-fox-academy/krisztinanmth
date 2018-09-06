import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamplePersona {
  public static List<Persona> createPeople() {
    return Arrays.asList(
    new Persona("sara", Gender.FEMALE, 20),
    new Persona("sara", Gender.FEMALE, 22),
    new Persona("bob", Gender.MALE, 20),
    new Persona("paula", Gender.FEMALE, 32),
    new Persona("paul", Gender.MALE, 32),
    new Persona("jack", Gender.MALE, 2),
    new Persona("jack", Gender.MALE, 72),
    new Persona("jill", Gender.FEMALE, 12)
    );
  }

  public static void main(String[] args) {
    List<Persona> personas = createPeople();

    //first let's get in uppercase all the name of the females, who are older than 18

    //with method
    List<String> namesOfFemalesOlderThan18 = new ArrayList<>();
    for (Persona persona : personas) {
      if (persona.getAge() > 18 && persona.getGender() == Gender.FEMALE) {
        namesOfFemalesOlderThan18.add(persona.getName().toUpperCase());
      }
    }
    System.out.println(namesOfFemalesOlderThan18);

    
  }
}
