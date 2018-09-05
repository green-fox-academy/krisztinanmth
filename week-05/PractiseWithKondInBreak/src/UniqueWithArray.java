import java.util.Arrays;

public class UniqueWithArray {

  public static void main(String[] args) {

    int[] numbers = new int[] { 1, 2, 1, 3, 4, 2, 5, 5 };

    int[] uniques = filterUniques(numbers);
    System.out.println(Arrays.toString(uniques));
  }

  private static int[] filterUniques(int[] numbers) {
    int[] uniqueCollector = new int[numbers.length];
    int numberOfUniques = collectUniques(numbers, uniqueCollector);
    int[] uniques = copyNElements(uniqueCollector, numberOfUniques);
    return uniques;
  }

  private static int collectUniques(int[] numbers, int[] uniqueCollector) {
    int numberOfUniques = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (!alreadyContains(uniqueCollector, numbers[i])) {
        uniqueCollector[numberOfUniques] = numbers[i];
        numberOfUniques++;
      }
    }

    return numberOfUniques;
  }

  private static int[] copyNElements(int[] uniqueCollector, int numberOfUniques) {
    int[] uniques = new int[numberOfUniques];

    for (int i = 0; i < numberOfUniques; i++) {
      uniques[i] = uniqueCollector[i];
    }

    return uniques;
  }

  private static boolean alreadyContains(int[] uniqueCollector, int searchedNumber) {

    for (int number : uniqueCollector) {
      if (number == searchedNumber) {
        return true;
      }
    }

    return false;
  }

}