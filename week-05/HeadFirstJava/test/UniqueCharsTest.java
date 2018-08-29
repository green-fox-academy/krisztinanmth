import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UniqueCharsTest {

  @Test
  public void uniqueCharsTestWithUniqueChars() {
    String example = "what";
    List<String> testWithUnique = new ArrayList<>(Arrays.asList("w", "h", "a", "t"));
    boolean isUnique = false;
    for (int i = 0; i < testWithUnique.size() ; i++) {
      if (UniqueChars.uniqueCharacters(example).contains(testWithUnique.get(i))) {
        isUnique = true;
      }
    }
    assertTrue(isUnique);
  }

  @Test
  public void testWithSomeUniqueChars() {
    String example = "mmaagilinii";
    List<String> testList = new ArrayList<>(Arrays.asList("g", "l", "n"));
    boolean isUnique = false;
    for (int i = 0; i < testList.size() ; i++) {
      if (UniqueChars.uniqueCharacters(example).contains(testList.get(i))) {
        isUnique = true;
      }
    }
    assertTrue(isUnique);
  }

  @Test
  public void testWithNoUnique() {
    String example = "bbeellaa";
    List<String> testNoUnique = new ArrayList<>();
    assertEquals(testNoUnique, UniqueChars.uniqueCharacters(example));
  }
}
