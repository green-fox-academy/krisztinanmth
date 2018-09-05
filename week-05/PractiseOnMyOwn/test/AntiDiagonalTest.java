import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AntiDiagonalTest {

  @Test
  public void testCaseWithPositivesOnly() {
    int[][] matrix = {
      {1, 2, 3},
      {3, 4, 6},
      {5, 2, 5}
    };

    assertEquals(4.0, AntiDiagonal.getAntiDiagonalAvg(matrix), 0);
  }

  @Test
  public void testCasePosAndNegs() {
    int[][] matrix = {
      {3, 5, 11, -2},
      {3, 1, 7, 4},
      {5, 0, 2, 9},
      {21, 7, 8, 2}
    };

    assertEquals(6.5, AntiDiagonal.getAntiDiagonalAvg(matrix), 0);
  }
}