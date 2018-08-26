public class SumElements {
  public static void main(String[] args) {
    // - Create an array variable named `r`
    //   with the following content: `[54, 23, 66, 12]`
    // - Print the sum of the second and the third element
    int[] r = {54, 23, 66, 12};
    int sum = r[1] + r[2];
    System.out.println("the sum of the second and the third element is: " + sum);
    int sum2 = r[0] + r[3];
    System.out.println("the sum of the first and last element is: " + sum2);
  }
}
