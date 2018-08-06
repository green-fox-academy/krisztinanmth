// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class Matrix {
  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = row * col;
        if (row == col) {
          matrix[row][col] = 1;
          System.out.print(matrix[row][col]);
        }
        else {
          matrix[row][col] = 0;
          System.out.print(matrix[row][col]);
        }
      }
      System.out.println();
    }
  }
}
