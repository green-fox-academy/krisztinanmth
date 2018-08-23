import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

//  @Before
//  public void createStringsBeforeTests() {
//    String str1 = "adecimalpoint";
//    String str2 = "imadotinspace";
//    String str3 = "lombok";
//  }

  @Test
  public void testingIsAnagramFalse() {
    isAnagram anagram = new isAnagram();
    String str1 = "adecimalpoint";
    String str2 = "imadotinspace";
    String str3 = "lombok";
    Assert.assertFalse(anagram.isAnagram(str1, str3));
  }

  @Test
  public void testingIsAnagramTrue() {
    isAnagram anagram = new isAnagram();
    String str1 = "adecimalpoint";
    String str2 = "imadotinspace";
    String str3 = "lombok";
    Assert.assertTrue(anagram.isAnagram(str1, str2));

  }

}