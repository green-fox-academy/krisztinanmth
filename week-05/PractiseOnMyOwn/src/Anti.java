import java.util.Arrays;

public class Anti {
  /**
   * Create and test a method called `sumElementsOfAntiDiagonal` that takes a multidimensional array (only integers)
   * which represents a square matrix, as a parameter and returns the average of the numbers in the anti diagonal.
   *  - write test for 2 different scenarios
   *
   * Example cases:
   * [
   *   [1, 2, 3],
   *   [3, 4, 6],
   *   [5, 2, 5]
   * ]
   * Should return 4, because (3 + 4 + 5) / 3 = 4.
   *
   * [
   *   [3, 5, 11, -2],
   *   [3, 1, 7, 4],
   *   [5, 0, 2, 9],
   *   [21, 7, 8, 2]
   * ]
   * Should return 6.5, because (-2 + 7 + 0 + 21) / 4 = 6.5.
   */
  public static void main(String[] args) {
    int[][] array1 = {{1, 2, 3}, {3, 4, 6}, {5, 2, 5}};
    int[][] array2 = {{3, 5, 11, -2}, {3, 1, 7, 4}, {5, 0, 2, 9}, {21, 7, 8, 2}};
    System.out.println(sumElementsOfAntiDiagonal(array1));
    System.out.println(sumElementsOfAntiDiagonal(array2));
  }

  public static double sumElementsOfAntiDiagonal(int[][] matrix) {
    double sumOfAntiDiagonal = 0;
//    double averageOfAntiDiagonals = 0;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length ; col++) {
        if ((row + col) == (matrix.length - 1)) {
          sumOfAntiDiagonal += matrix[row][col];
//          averageOfAntiDiagonals = sumOfAntiDiagonal / matrix.length;
        }
      }
    }
    return sumOfAntiDiagonal /matrix.length;
  }
}