import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedForLoopBen {
  public static void main(String[] args) {
    ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(6, 9, 11, 13, 15));

    for (int i = 0; i < intList.size(); i++) {
      System.out.println(intList.get(i));
    }

    for (Integer number : intList) {
      System.out.println(number);
    }

    for (int i = 0; i < intList.size(); i++) {
      System.out.println(i);
    }
  }
}
