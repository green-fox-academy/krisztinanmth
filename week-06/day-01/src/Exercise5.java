import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

  public static void main(String[] args) {
//    write a stream expression to find the uppercase characters in a string!
    String upperCase = "let me DO the BEST of it".chars()
      .filter(Character::isUpperCase)
      .mapToObj(c -> Character.toString((char)c))
      .collect(Collectors.joining());
    System.out.println("upperCases found with stream: ");
    System.out.println(upperCase);
  }
}
