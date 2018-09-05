public class AntiDiagonal {
  public static void main(String[] args) {
    int[][] array1 = {{1, 2, 3,}, {3, 4, 6}, {5, 2, 5}};
    int[][] array2 = {{3, 5, 11, -2}, {3, 1, 7, 4}, {5, 0, 2, 9},{21, 7, 8, 2}};
    System.out.println(getAntiDiagonalAvg(array1));
    System.out.println(getAntiDiagonalAvg(array2));
  }

  /**
   * Create and test a method called `getAntiDiagonalAvg` that takes a multidimensional array (only integers)
   * which represents a square matrix, as a parameter and returns the average of the numbers in the anti diagonal.
   * - write test for 2 different scenarios
   * <p>
   * Example cases:
   * [
   * [1, 2, 3],
   * [3, 4, 6],
   * [5, 2, 5]
   * ]
   * Should return 4, because (3 + 4 + 5) / 3 = 4.
   * <p>
   * [
   * [3, 5, 11, -2],
   * [3, 1, 7, 4],
   * [5, 0, 2, 9],
   * [21, 7, 8, 2]
   * ]
   * Should return 6.5, because (-2 + 7 + 0 + 21) / 4 = 6.5.
   */

  public static double getAntiDiagonalAvg(int[][] matrix) {
    int sum = 0;

    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][matrix.length - 1 - i];
    }

    return (double) sum / matrix.length;
  }
}
