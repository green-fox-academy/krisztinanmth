import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

  public static void main(String[] args) {
/*
 write a stream expression to get the squared value of the positive numbers from the following array:
*/
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    //solution with stream expression
    List<Integer> listOFSquaredPosNumbers =
      numbers.stream()
        .filter(n -> n > 0)
        .map(n -> n * n)
        .collect(Collectors.toList());
    System.out.println("squared positives with stream: ");
    System.out.println(listOFSquaredPosNumbers);

    System.out.println();
    System.out.println("squared positive numbers with method: ");
    System.out.println(squarePositiveNumbers(numbers));
  }

  //solution with method
  public static List<Integer> squarePositiveNumbers(List numbers) {
    List<Integer> squaredNumbers = new ArrayList<>();
    int temp;
    for (int i = 0; i < numbers.size(); i++) {
      if ((int) numbers.get(i) > 0) {
        temp = (int) numbers.get(i) * (int) numbers.get(i);
        squaredNumbers.add(temp);
      }
    }
    return squaredNumbers;
  }
}
