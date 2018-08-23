import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {


  @Test
  public void testPrintMessage() {
    Apples ap = new Apples();
    Assert.assertEquals("apples", ap.getApple());
  }

}