// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`


public class SumAllElements {
  public static void main(String[] args) {

    int[] ai = {3, 4, 5, 6, 7};
    int sum = 0;

    //enhanced for loop sums the array
    for (int i : ai) {
      sum += i;
    }

    System.out.println(sum);
  }
}
