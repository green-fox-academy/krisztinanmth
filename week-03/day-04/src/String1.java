// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
  public static void main(String[] args) {
    String myString = "xXx XXx xxX XXX xxx xXx";
    System.out.println(changeXtoYWithRecursion(myString));
  }
  private static String changeXtoYWithRecursion(String myString) {
    if (myString.length() == 0) {
      return myString;
    } else if (myString.charAt(0) == 'x'){
      return 'y' + changeXtoYWithRecursion(myString.substring(1));
    }
    else {
      return myString.charAt(0) + changeXtoYWithRecursion(myString.substring(1));
    }
  }
}
