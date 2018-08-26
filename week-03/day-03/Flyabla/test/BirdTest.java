import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

  @Test
  public void birdCanFly() {
    Bird birdie = new Bird("birdie", "black", 45);
    Assert.assertEquals( "birdie flies at a 45 km/h maximum speed", birdie.fly());
  }

}