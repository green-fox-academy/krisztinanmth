// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyEarsWithRecursion(16));
  }

  public static int bunnyEarsWithRecursion(int n) {
    if(n == 0) {
      return 0;
    } else {
      return 2 + bunnyEarsWithRecursion(n - 1);
    }
  }
}