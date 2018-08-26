import java.util.*;

public class AppendLetterLists{
  public static void main(String... args){
    List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.
    // The output should be: "boa", "anaconda", "koala", "panda", "zebra"
    System.out.println(appendA(far));
  }
  public static List appendA(List original) {
    for (int i = 0; i < original.size() ; i++) {
      original.set(i, original.get(i) + "a");
    }
    return original;
  }
}

