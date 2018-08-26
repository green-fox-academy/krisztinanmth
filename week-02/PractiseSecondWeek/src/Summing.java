public class Summing {
  public static void main(String[] args) {
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
    int number = 10;
    System.out.println(sum(number));
  }
  public static int sum(int n) {
    int sum = 0;
    for (int i = 0; i < n ; i++) {
      sum += i;
    }
    return sum;
  }
}
