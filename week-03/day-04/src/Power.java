// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
  public static void main(String[] args) {
    System.out.println(powerWithRecursion(2, 3));
  }
  public static int powerWithRecursion(int base, int n) {
    if(base < 1 || n < 1) {
      return 1;
    } else {
      return base * powerWithRecursion(base, n - 1);
    }
  }
}
