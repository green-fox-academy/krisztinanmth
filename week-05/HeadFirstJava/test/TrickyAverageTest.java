import static org.junit.Assert.*;
import org.junit.Test;

public class TrickyAverageTest {
  /**
   * Write your test cases here. You should be able to invoke the method like this:
   * double result = TrickyAverage.getTrickyAvg(input);
   */

  @Test
  public void getTrickyAvg_testWithJustPositives() {
    int[] example = {1, 3, 7, 8};
    assertEquals((double) (1 + 8) / 2, TrickyAverage.getTrickyAverage(example), 0);
  }

  @Test
  public void getTrickyAvg_testWithPosAndNeg() {
    int[] example = {-4, -5, -6, 18, 32};
    assertEquals((double) (32 + -5) / 2, TrickyAverage.getTrickyAverage(example), 0);
  }



}