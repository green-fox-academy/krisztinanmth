public class Doubling {
  public static void main(String[] args) {
    int baseNum = 123;
    int kicsi = 44;
    int nagy = 333;
    System.out.println(doublingFunction(baseNum));
    System.out.println(doublingFunction(kicsi));
    System.out.println(doublingFunction(nagy));
  }

  public static int doublingFunction(int baseNum) {
    int result = baseNum * 2;
    return result;
  }
}
