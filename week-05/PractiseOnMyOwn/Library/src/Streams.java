import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

  public static int increaseAndPrint(int number) {
    return ++number;
  }

  public static void main(String[] args) {

    int[] numberArray = new int[]{ 1, 2, 3, 4, 5, 6 };
    List<Integer> numberList = Arrays.asList(10, 12, 23, 64, 37);

    double listAverage = numberList.stream()
      .mapToInt(n -> n)
      .average()
      .getAsDouble();
    System.out.println(listAverage);

    double arrayAverage = Arrays.stream(numberArray)
      .average()
      .getAsDouble();
    System.out.println(arrayAverage);


    double oddNumbers = getOddElements(numberList);
    System.out.println(oddNumbers);

    int sum = sum(numberArray);
    System.out.println(sum);

    String text = "apple";
    String encodedText = ceasarEncode(text, 200);
    System.out.println(encodedText);

    printAll(numberArray);

    User user1 = new User(1);
    User user2 = new User(13);
    List<User> users = Arrays.asList(user1, user2);

    incrementUserIds(users);
    System.out.println(users);

  }

  private static void incrementUserIds(List<User> users) {
    users.stream().forEach(user -> user.incerementId());
  }

  private static void printAll(int[] numberArray) {
    int[] incrementedNumbers = Arrays.stream(numberArray)
      .map(Streams::increaseAndPrint)
      .toArray();
    System.out.println(Arrays.toString(incrementedNumbers));
  }

  private static String ceasarEncode(String text, int offset) {
    return text.chars()
      .map(c -> ((c + offset - 97) % 24) + 97)
      .mapToObj(c -> Character.toString((char) c))
      .collect(Collectors.joining());
  }

  private static int sum(int[] numberArray) {
    return Arrays.stream(numberArray)
      .reduce((n1, n2) -> n1 + n2)
      .getAsInt();
  }

  private static double getOddElements(List<Integer> numberList) {
    return numberList.stream().parallel()
      .filter(n -> n % 2 != 0)
      .mapToInt(n -> n)
      .average()
      .getAsDouble();
  }

}