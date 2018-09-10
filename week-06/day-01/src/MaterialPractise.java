import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaterialPractise {

  public static void main(String[] args) {
    int[] numberArray = new int[]{1, 2, 3, 4, 5, 6};
    List<Integer> numberList = Arrays.asList(12, 12, 23, 37, 64);

    double listAverage = numberList.stream()
      //first i need to turn it into int stream with map and then i can use the .average on it
      .mapToInt(n -> n)
      .average()
      .getAsDouble();
    System.out.println(listAverage);

    double arrayAverage = Arrays.stream(numberArray)
      //this already turned my List into an int stream
      .average()
      .getAsDouble();
    System.out.println(arrayAverage);

    System.out.println(getOddElementsAverage(numberList));

    int sum = sum(numberArray);
    System.out.println(sum);

    String text = "apple";
    String encodedText = ceasarEncode(text, 2);
    System.out.println(encodedText);
  }

  private static String ceasarEncode(String text, int offset) {
    return text.chars()
      .map(c -> c + offset)
      .mapToObj(c -> (char) c)
  }
  //predicates are those lambda expressions which return with a boolean

    private static double getOddElementsAverage(List<Integer> numberList) {
      return numberList.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average()
        .getAsDouble();
    }

    private static int sum(int[] numberArray) {
    return Arrays.stream(numberArray)
      .reduce((n1, n2) -> n1 + n2)
      .getAsInt();

    //so the reducer works like this 1, 2, 3, 4
      //(n1, n2) -> n1 + n2
      //3, 3, 4
      //6, 4
      //10
    }
}
