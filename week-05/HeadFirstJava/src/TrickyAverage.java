public class TrickyAverage {
  /**
   * Create and test a function called `getTrickyAvg` that takes a number array (only doubleegers) as parameter
   * and returns the average of the smallest odd and largest even.
   *  - use only basic control flow statements, like 'for', 'if', etc.
   *  - do not use built-in methods like 'filter', 'forEach', 'map', etc.
   *  - write test for 2 different scenarios (test file is provided: TrickyAverageTest.java)
   *
   * Example cases:
   * [1, 2, 3] -> should return 1.5
   * [3, 4, 5, 6] -> should return 4.5
   * [5, 2, 8, -1] -> should return 3.5
   */
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {3, 4, 5, 6};
    int[] arr3 = {5, 2, 8, -1};
    System.out.println((int)smallestOdd(arr1));
    System.out.println((int)largestEven(arr1));
    System.out.println(getTrickyAverage(arr1));
    System.out.println((int)smallestOdd(arr2));
    System.out.println((int)largestEven(arr2));
    System.out.println(getTrickyAverage(arr2));
    System.out.println((int)smallestOdd(arr3));
    System.out.println((int)largestEven(arr3));
    System.out.println(getTrickyAverage(arr3));

  }

  public static double smallestOdd(int[] array) {
    double smallestOdd = array[0];
    for (int i = 0; i < array.length ; i++) {
      if (array[i] % 2 != 0) {
        if (smallestOdd > array[i]) {
          smallestOdd = array[i];
        }
      }
    }
    return smallestOdd;
  }

  public static double largestEven(int[] array) {
    double largestEven = array[0];
    for (int i = 0; i < array.length ; i++) {
      if (array[i] % 2 == 0 && largestEven < array[i]) {
        largestEven = array[i];
      }
    }
    return largestEven;
  }
  public static double getTrickyAverage(int[] array) {
    double average = (smallestOdd(array) + largestEven(array)) / 2;
    return average;
  }
}