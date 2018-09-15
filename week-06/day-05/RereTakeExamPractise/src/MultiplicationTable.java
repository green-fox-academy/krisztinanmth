/**
 *  Create a function that prints the multiplication table of a given base number.
 *  It should take the base number as a parameter and prints the output to the
 *  console.
 *
 *  The output should look like this for 5 as base:
 *   1 * 5 = 5
 *   2 * 5 = 10
 *   3 * 5 = 15
 *   4 * 5 = 20
 *   5 * 5 = 25
 *   6 * 5 = 30
 *   7 * 5 = 35
 *   8 * 5 = 40
 *   9 * 5 = 45
 *   10 * 5 = 50
 */

public class MultiplicationTable {
  public static void main(String[] args) {

    multiplyInputNumber(5);
    multiplyInputNumber(0);
    multiplyInputNumber(3);
    multiplyInputNumber(-8);
  }

  public static void multiplyInputNumber(int inputNumber) {
    int multipliedNumber = 0;
    for (int i = 1; i <= 10 ; i++) {
      multipliedNumber += i;
      System.out.println(String.format("%d * %d = %d",i, inputNumber, multipliedNumber));
    }
  }
}