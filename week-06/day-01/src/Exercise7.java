public class Exercise7 {

  public static void main(String[] args) {
    /**
     * write a stream expression to find the frequency of characters in a given string!
     */
    String example = "peetweet";
    long count =
      example.chars()
      .filter(ch -> ch == 'e')
      .count();
    long count2 =
      example.chars()
        .filter(ch -> ch == 't')
        .count();
    System.out.println("frequency of 'e' with stream: ");
    System.out.println(count);
    System.out.println("frequency of 't' with stream: ");
    System.out.println(count2);

    System.out.println("frequency of 'e' with method: ");
    System.out.println(countOccurrence(example, 'e'));
    System.out.println("frequency of 't' with method: ");
    System.out.println(countOccurrence(example, 't'));
  }

  private static int countOccurrence(String example, char searchedChar) {
    int counter = 0;
    for (int i = 0; i < example.length() ; i++) {
      if (example.charAt(i) == searchedChar) {
        counter++;
      }
    }
    return counter;
  }
}
