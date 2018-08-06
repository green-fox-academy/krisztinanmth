// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class FactorialFunc {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a whole number.");
    int Number = input.nextInt();
    System.out.println(factorio(Number));
  }

  public static int factorio(int Number) {
    int result = Number;
    for (int i = 1; i < Number; i++) {
      result *= i;
    }
    return result;
  }
}
