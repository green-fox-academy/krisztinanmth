import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    Scanner first = new Scanner(System.in);
    System.out.println("please type in the first word: ");
    String fword = first.next();
    Scanner second = new Scanner(System.in);
    System.out.println("please type in the second word: ");
    String sword = second.next();

    isAnagram(fword, sword);
  }

  public static void isAnagram(String fword, String sword) {
    char[] fwordArray = fword.toCharArray();
    char[] swordArray = sword.toCharArray();
    Arrays.sort(fwordArray);
    Arrays.sort(swordArray);

    if (Arrays.equals(fwordArray, swordArray)) {
      System.out.println("yes, these words are anagrams");
    } else {
      System.out.println("no, these words are not anagrams");
    }
  }
}
