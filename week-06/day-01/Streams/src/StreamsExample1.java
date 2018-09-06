import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
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


    long counter = people.stream()
      //inside the stream we have the lambda expression(s) as below
      .filter(p -> p.getFirstName().startsWith("c"))
      .count();
    System.out.println(counter);

    //or we can also do parallel streaming
    //        people.parallelStream()
    //look into it

    //generating streams ...
    //.stream() - returns a sequential stream considering collection as its source

    //.parallelStream() - returns a parallel stream considering collection as its source


//      stream has provided a new method ‘forEach’ to iterate each element of the stream.
//      the following code segment shows how to print 3 random numbers using forEach.

    Random random = new Random();
    System.out.println();
    System.out.println("forEach method: ");
    random.ints().limit(3).forEach(System.out::println);


//      the ‘map’ method is used to map each element to its corresponding result.
//      the following code segment prints unique squares of numbers using map.

    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    //get list of unique squares
    List<Integer> squaresList = numbers.stream().map( i -> i * i).distinct().collect(Collectors.toList());
    System.out.println();
    System.out.println("map method: ");
    System.out.println(squaresList);


  //    the ‘limit’ method is used to reduce the size of the stream.
  //    the following code segment shows how to print 2 random numbers using limit.

    Random random2 = new Random();
    System.out.println();
    System.out.println("limit method: ");
    random2.ints().limit(2).forEach(System.out::println);


//      the ‘sorted’ method is used to sort the stream.
//      the following code segment shows how to print 5 random numbers in a sorted order.

    Random random3 = new Random();
    System.out.println();
    System.out.println("sorted method: ");
    random3.ints().limit(5).sorted().forEach(System.out::println);


//    parallelStream is the alternative of stream for parallel processing.
//    take a look at the following code segment that prints a count of empty strings using parallelStream.

    List<String> emptyStrings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//get count of empty string
    int count = (int) emptyStrings.parallelStream().filter(string -> string.isEmpty()).count();
    System.out.println();
    System.out.println("parallel processing: ");
    System.out.println(count);


//      collectors are used to combine the result of processing on the elements of a stream.
//      collectors can be used to return a list or a string.

    List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    System.out.println();
    System.out.println("Filtered List: " + filtered);
    String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
    System.out.println("Merged String: " + mergedString);



//    with Java 8, statistics collectors are introduced to calculate all statistics when
//    stream processing is being done.

//    List integers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//    IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
//
//    System.out.println("Highest number in List : " + stats.getMax());
//    System.out.println("Lowest number in List : " + stats.getMin());
//    System.out.println("Sum of all numbers : " + stats.getSum());
//    System.out.println("Average of all numbers : " + stats.getAverage());
  }
}







