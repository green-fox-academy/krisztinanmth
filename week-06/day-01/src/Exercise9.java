import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {

  public static void main(String[] args) {
    /**
     *  write a stream expression to convert a char array to a string!
     */
    String str = "this is a very good day, enjoy";
    char[] strChars = str.toCharArray();

    //built in method for printing elements of char[] ...below
    System.out.println(Arrays.toString(strChars));
    //built in method for displaying char[] as a String ... below
    System.out.println(String.valueOf(strChars));
    System.out.println();

    String stringFromCharArray = Stream.of(strChars)
      .map(String::valueOf)
      .collect(Collectors.joining());
    System.out.println("\nstring with stream from char array");
    System.out.println(stringFromCharArray);
    System.out.println();

    List<Character> chars = Arrays.asList('g', 'i', 't', 'H', 'u', 'b');
    System.out.println(chars);
    String joinedCharsStr =
      chars.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
    System.out.println("turning char array into string with stream expression: ");
    System.out.println(joinedCharsStr);
    System.out.println();
    System.out.println("turning char array into string with method: ");
    System.out.println(turnMyCharArray(strChars));
  }

  private static String turnMyCharArray(char[] example) {
    String temp = "";
    for (char c : example) {
      temp += c;
    }
    return temp;
  }

//  private static String joinCharArray(char[] strChars) {
//    return (String) Arrays.asList(strChars)
//      .stream()
//      .collect(Collectors.joining());
//  }
}
