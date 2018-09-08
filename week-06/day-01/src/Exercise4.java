import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

  public static void main(String[] args) {
    // write a stream expression to find which number squared
    // value is more then 20 from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    List<Integer> listOfSquaresBiggerThan20 =
      numbers.stream()
      .map(n -> n * n)
      .filter(n -> n > 20)
      .collect(Collectors.toList());
    System.out.println("list of squared numbers bigger than 20... with stream: ");
    System.out.println(listOfSquaresBiggerThan20);

    System.out.println();
    System.out.println("list of squared numbers bigger than 20... with method:");
    System.out.println(squareNumbersAndReturnBiggerThan20(numbers));
  }

  private static List<Integer> squareNumbersAndReturnBiggerThan20(List numbers) {
    List<Integer> listOf = new ArrayList<>();
    int temp;
    for (int i = 0; i < numbers.size() ; i++) {
      temp = (int) numbers.get(i) * (int) numbers.get(i);
      if (temp > 20) {
        listOf.add(temp);
      }
    }
    return listOf;
  }
}
