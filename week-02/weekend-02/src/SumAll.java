import java.util.stream.IntStream;

public class SumAll {
  public static void main(String[] args) {
    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Print the sum of the elements in `ai`

    //creating array
    int[] ai = {3, 4, 5, 6, 7};
    //using IntStream method for summing elements of the array
    int sum = IntStream.of(ai).sum();
    System.out.println("The sum of ai array is: " + sum);
  }
}
