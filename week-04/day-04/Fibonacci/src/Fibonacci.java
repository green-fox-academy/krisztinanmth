public class Fibonacci {
  public static void main(String[] args) {
    int number;
    number = 12;
    System.out.println(fibonacci(number));
  }

  public static int fibonacci(int n) {
    if(n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
