import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

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

    //now we want to total the age of everybody
    System.out.println(
      personas.stream()
              .map(Persona :: getAge)
              .reduce(0, (carry, age) -> carry + age));
    //.reduce(0, Integer :: sum));
    //.sum()); ... for this first we need .mapToInt(Persona :: getAge)

    System.out.println();
    System.out.println("number of personas under 18");
    System.out.println(
      personas.stream()
              .filter(persona -> persona.getAge() < 18)
              .count()
    );

    //print out the names of adults in upperCase
    List<String> nameOfAdults =
      personas.stream()
              .filter(persona -> persona.getAge() > 17)
              .map(persona -> persona.getName().toUpperCase())
              .collect(Collectors.toList());
    //actually in the video his code after this collect was far more complicated ... i didn't
    //put it here as i didn't get it

    System.out.println();
    System.out.println("the names of the adults are: ");
    System.out.println(nameOfAdults);


    List<String> males =
      personas.stream()
              .filter(persona -> persona.getGender() == Gender.MALE)
              .map(Persona::getName)
              .collect(Collectors.toList());
              //or .collect(ToSet()); - this i think just returns the unique ones

    System.out.println();
    System.out.println("list of males: ");
    System.out.println(males);

    Map<String, Persona> map =
      personas.stream()
              .collect(toMap(persona -> persona.getName() + " : " + persona.getAge(), persona -> persona));

    System.out.println();
    System.out.println("map of names and ages: ");
    System.out.println(map);


    System.out.println();
    System.out.println("and this is map2, grouped by names: ");
    Map<String, List<Persona>> map2 =
      personas.stream()
              .collect(groupingBy(Persona::getName));
    map2.forEach((k, v) ->
      System.out.println(k + " - - " + v));

    //find the first person whose name is four letters but is older than 25
    System.out.println();
    System.out.println(
      personas.stream()
              //.filter(persona -> persona.getName().length() == 4)
              .filter(SamplePersona::is4Letters)
              .filter(persona -> persona.getAge() > 25)
              .findFirst());
  }

  public static boolean is4Letters(Persona persona) {
    System.out.println("called for " + persona);
    return persona.getName().length() == 4;
  }
}
