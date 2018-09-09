import java.util.stream.Collectors;

public class Exercise5 {

  public static void main(String[] args) {
    /**
     * write a stream expression to find the uppercase characters in a string!
     */
    String upperCase = "let me DO the BEST of it".chars().filter(Character::isUpperCase)
      .mapToObj(c -> Character.toString((char)c)).collect(Collectors.joining());
    System.out.println("upperCases found with stream: ");
    System.out.println(upperCase);

    String example = "let me DO the BEST of it";
    System.out.println();
    System.out.println("upperCases found with method: ");
    findUpperCaseChars(example);
  }

  private static void findUpperCaseChars(String example) {
    for (char c : example.toCharArray()) {
      if (Character.isUpperCase(c)) {
        System.out.print(c);
      }
    }
  }
}
