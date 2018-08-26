public class Factorial {
  public static void main(String[] args) {
    // - Create a function called `factorio`
    //   that returns it's input's factorial
    System.out.println(factorio(11));
  }

  public static int factorio(int n) {
    int factorial = 1;
    for (int i = 1; i <= n ; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
