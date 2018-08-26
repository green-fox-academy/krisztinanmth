import java.util.ArrayList;
import java.util.List;

public class UniqueHardOnes {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }
  public static List<Integer> unique(int[] original) {
    List<Integer> uniqueList = new ArrayList<>();
//    for (int element : original) {
//      if (!uniqueList.contains(element)) {
//        uniqueList.add(element);
//      }
//    }
    for (int i = 0; i < original.length ; i++) {
      if (!uniqueList.contains(original[i])) {
        uniqueList.add(original[i]);
      }
    }
    return uniqueList;
  }
}
