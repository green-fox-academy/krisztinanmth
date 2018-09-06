import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

  public static void main(String[] args) {
//    write a stream expression to get the average value of the odd numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
//    numbers.stream()
//      .filter(n -> n % 2 != 0)
    System.out.println(averageOfOddNumbers(numbers));
  }

  public static int averageOfOddNumbers(List numbers) {
    int average = 0;
    List<Integer> oddNumbers = new ArrayList<>();
    for (int i = 0; i < numbers.size() ; i++) {
      if ((int) numbers.get(i) % 2 != 0) {
        oddNumbers.add((int) numbers.get(i));
        average += (int) numbers.get(i);
      }
      average = average / oddNumbers.size();
    }
    return average;
  }
}
