import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    List<String> namesOfOlderThan18 = new ArrayList<>();
    for (Persona persona : personas) {
      if (persona.getAge() > 18) {
        namesOfOlderThan18.add(persona.getName().toUpperCase());
      }
    }
    System.out.println(namesOfOlderThan18);


    List<String> names2 =
      personas.stream()
        //stream is a very high level of abstraction ... it is not a data structure
        //it is non mutating - which means it is not modifying the original list
        //stream is a view of how data is transformed
        //pipeline !!! ..it's a transformation as things flow down
        //1 step - you go from the concrete (the collection) to abstraction (the stream)
        //2 step - ride the stream - compose operations
        //3 step - land back on a concrete type
      .filter(persona -> persona.getAge() > 18)
      .map(Persona::getName)
      .map(String::toUpperCase)
      .collect(Collectors.toList());
    System.out.println(names2);

    //stream to print all names of males in uppercase ... i think the uppercase line is that complex because we are
    //recreating the person...not to modify the original list .. ???
    personas.stream()
      .filter(persona -> persona.getGender() == Gender.MALE)
      .map(persona -> new Persona(persona.getName().toUpperCase(), persona.getGender(), persona.getAge()))
      .forEach(System.out::println);
  }
}
