import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample1 {

  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
      new Person("charles", "dickens", 60),
      new Person("lewis", "caroll", 42),
      new Person("matthew", "arnold", 39),
      new Person("thomas", "carlyle", 51),
      new Person("charlotte", "bronte", 45)
    );

    //if we want to get a sublist...instead of iterating many times....
    //we can use an 'assembly-line'...
    //from Java-8 every collections comes with a built-in stream method ... sweet :)

    people.stream()
      //if we want to have multiple actions with one list we can do it
      //in a stream without looping through many times
      .filter(p -> p.getFirstName().startsWith("c"))
      // filter with the 'predicate'is like quality control :)
      //so with filter first we filter the collection and we will just print
      //out the famNames of those, whose firstName starts with a c letter
      .forEach(p -> System.out.println(p.getFamName()));

    //or we can introduce a local stream variable
//    Stream<Person> stream = people.stream();


    long count = people.stream()
      //inside the stream we have the lambda expression(s) as below
      .filter(p -> p.getFirstName().startsWith("c"))
      .count();
    System.out.println(count );

    //or we can also do parallel streaming
    //        people.parallelStream()
    //look into it
  }
}







