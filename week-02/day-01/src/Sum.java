// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a whole number.");
    int Number = input.nextInt();

    System.out.println(SumItUp(Number));
  }

  public static int SumItUp(int Number) {
    int result = Number;
    for (int i = 0; i < Number; i++) {
      result += i;
    }
    return result;
  }
}
