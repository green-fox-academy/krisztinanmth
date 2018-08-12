import java.util.*;

public class BuckyHashSets {
  public static void main(String[] args) {
    //first we create a String array
    String[] things = {"apple", "bob", "ham", "bob", "bacon"};
    //then we convert this array into a list
    List<String> list = Arrays.asList(things);
    //printing out the list
    System.out.printf("%s", list);
    System.out.println();

    //we can use HashSet to remove any duplicate items from our List, called things
    Set<String> set = new HashSet<String>(list);
    System.out.printf("%s", set);
  }
}
