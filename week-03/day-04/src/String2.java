// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {
  public static void main(String[] args) {
    String myString = "xXXX xxx XxX xXx XXxxx";
    removeXWithRecursion(myString);
  }
  private static String removeXWithRecursion(String myString) {
    if(myString.length() == 0) {
      return myString;
    } else if(myString.charAt(0) == 'x') {
      return ' ' + removeXWithRecursion(myString.substring(1));
    } else {
      return myString.charAt(0) + removeXWithRecursion(myString.substring(1));
    }
  }
}
