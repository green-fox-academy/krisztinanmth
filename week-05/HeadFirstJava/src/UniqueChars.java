import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
    System.out.println(uniqueCharactersWithCharacterMap("anagram"));
  }

  public static List<String> uniqueCharacters(String myWord) {
    List<String> uniqueChars = new ArrayList<>();
    HashMap<String, Integer> counterMap = new HashMap<>();
    for (int i = 0; i < myWord.length() ; i++) {
     if (!counterMap.containsKey(myWord.charAt(i) + "")) {
       counterMap.put(myWord.charAt(i) + "", 1);
     } else {
       counterMap.put(myWord.charAt(i) + "", counterMap.get(myWord.charAt(i) + "") + 1);
     }
    }
    for (String key : counterMap.keySet()) {
      if (counterMap.get(key) == 1) {
        uniqueChars.add(key);
      }
    }
    return uniqueChars;
  }

  public static List<Character> uniqueCharactersWithCharacterMap(String myWord) {
    List<Character> uniqueChars = new ArrayList<>();
    HashMap<Character, Integer> countedChars = new HashMap<>();
    for (int i = 0; i < myWord.length() ; i++) {
      if (!countedChars.containsKey(myWord.charAt(i))) {
        countedChars.put(myWord.charAt(i), 1);
      } else {
        countedChars.put(myWord.charAt(i), countedChars.get(myWord.charAt(i)) + 1);
      }
    }
    for (Character key : countedChars.keySet()) {
      if (countedChars.get(key) == 1) {
        uniqueChars.add(key);
      }
    } return uniqueChars;
  }

}