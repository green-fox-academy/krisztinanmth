import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise8 {

  public static void main(String[] args) {
    /**
     * write a stream expression to find the frequency of numbers in the following array:
     */
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Long> numbersToCount =
      numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    System.out.println("frequency of numbers found with stream expression: ");
    System.out.println(numbersToCount);
  }
}
