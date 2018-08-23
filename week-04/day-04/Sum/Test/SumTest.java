import org.junit.Test;
import static org.junit.Assert.*;

class SumTest {



  @Test
  public void testWithEmptyList() {
    Sum list = new Sum();
    assertEquals(0, list.sumOfTheElements());
  }
}