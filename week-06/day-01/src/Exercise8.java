import java.util.*;
import java.util.stream.Collectors;

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
    System.out.println();
    System.out.println("frequency of numbers found with method: ");
    System.out.println(countFrequencyOfNumbers(numbers));
  }

  /**
   * nem az a lenyeg hogy mikor kezded, hanem hogy mikor hagyod abba :D :D :D
   */


  private static Map<Integer, Integer> countFrequencyOfNumbers(List numbers) {
    Map<Integer, Integer> countMap = new HashMap<>();
    for (int i = 0; i < numbers.size() ; i++) {
      int key = (int) numbers.get(i);
      if (countMap.containsKey(key)) {
        int count = countMap.get(key);
        count++;
        countMap.put(key, count);
      }
      else {
        countMap.put(key, 1);
      }
    }
    return countMap;
  }
}
