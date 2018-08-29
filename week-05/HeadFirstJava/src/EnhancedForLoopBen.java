import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedForLoopBen {
  public static void main(String[] args) {
    ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

    for (int i = 0; i < 2; i++) {
      System.out.println(intList.get(i));
    }

    for (Integer number : intList) {
      System.out.println(number);
    }
  }
}
