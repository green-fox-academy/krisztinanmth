// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

import java.util.Collections;
import java.util.ArrayList;

public class SwapElements {
  public static void main(String a[]) {

    ArrayList<String> abc = new ArrayList<String>();
    abc.add("first");
    abc.add("second");
    abc.add("third");

    System.out.println("ArrayList [abc] before swap");
    for (String temp : abc) {
      System.out.println(temp);
    }

    //swapping the first and third element
    Collections.swap(abc, 0, 2);

    System.out.println("ArrayList [abc] after swap");
    for (String temp : abc) {
      System.out.println(temp);
    }
  }
}
