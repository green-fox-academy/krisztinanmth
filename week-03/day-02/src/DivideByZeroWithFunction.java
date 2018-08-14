import java.util.Scanner;

public class DivideByZeroWithFunction {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter a divisor number: ");
    int divisor = scanner.nextInt();
    divider(divisor);
  }

  public static void divider(int divisor) {
    int result = 0;
    try {
      result = 10 / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("cannot divide by zero");
    }
  }
}
