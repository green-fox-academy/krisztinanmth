import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PiratesTest {

//  @Before
//  public PiratesTest() {
//    Pirates pi = new Pirates();
//  }


  @Test
  public void drinkSomeRumTest() {
    Pirates pi = new Pirates();
    Assert.assertEquals(1, pi.drinkSomeRum());
  }

  @Test
  public void howsItGoingMateWithLowRumLevel() {
    Pirates pi = new Pirates();
    pi.drinkSomeRum();
    pi.drinkSomeRum();
    Assert.assertEquals("pour me anudder!", pi.howsItGoingMate());
  }

  @Test
  public void howsItGoingMateWithHighRumLevel() {
    Pirates pi = new Pirates();
    for (int i = 0; i < 7; i++) {
      pi.drinkSomeRum();
    }
    Assert.assertEquals("arghhh...i'm a pirate. how d'ya d'ink its going?", pi.howsItGoingMate());
  }
}