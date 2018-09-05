import java.util.Arrays;

//ezt vesd ossze azzal amit felpushol s ird at

public class UniqueWithArray {
  public static void main(String[] args) {
    int[] numbers = new int[] {1, 2, 1, 3, 4, 2, 5, 5};
    int[] uniques = filterUniques(numbers);
    System.out.println(Arrays.toString(uniques));
  }

  private static int[] filterUniques(int[] numbers) {
    int[] uniqueCollector = new int[numbers.length];
    int numberOfUniques = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (alreadyContains(uniqueCollector, numbers[i]) == false) {
        uniqueCollector[numberOfUniques] = numbers[i];
        numberOfUniques++;
      }
    }
    int[] uniques = copyNElement(uniqueCollector, numberOfUniques);
    return uniques;
  }

  private static int[] copyNElement(int[] uniqueCollector, int numberOfUniques) {
    int[] uniques = new int[numberOfUniques];

    for (int i = 0; i < numberOfUniques ; i++) {
      uniques[i] = uniqueCollector[i];
    }
    return uniques;
  }

  private static boolean alreadyContains(int[] uniqueCollector, int number) {
    //for (int number : uniqueCollector)
    // if (number == searchedNumber)
    //ha ezzel az enhanced for loop-pal csinalod, akkor argument-nel int munber ird at int serchadNumber-re
    for (int i = 0; i < uniqueCollector.length ; i++) {
      if(uniqueCollector[i] == number) {
        return true;
      }
    }
    return false;
  }
}
