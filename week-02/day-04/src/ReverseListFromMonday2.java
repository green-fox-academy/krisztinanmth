import java.util.ArrayList;
import java.util.Collections;

public class ReverseListFromMonday2 {

  public static void main(String[] args) {

    ArrayList<Integer> aj = new ArrayList<>();
    aj.add(3);
    aj.add(4);
    aj.add(5);
    aj.add(6);
    aj.add(7);

    System.out.println("Numbers before being reversed: " + aj);
    Collections.reverse(aj);
    System.out.println("Numbers after being reversed: " + aj);
  }
}
