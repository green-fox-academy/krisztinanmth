// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {
  public static void main(String[] args) {
    int n;
    System.out.println(numberAdderWithRecursion(5));
  }

  public static int numberAdderWithRecursion(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + numberAdderWithRecursion(n -1);
    }
  }
}
