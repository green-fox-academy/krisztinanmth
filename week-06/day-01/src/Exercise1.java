import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

  public static void main(String[] args) {

    //  Write a Stream Expression to get the even numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    System.out.println();
    System.out.println(createListWithEvens(numbers));
  }

  public static List<Integer> createListWithEvens(List numbers) {
    List<Integer> uniqueList = new ArrayList<>();
    for (int i = 0; i < numbers.size() ; i++) {
      if ((Integer) numbers.get(i) % 2 == 0) {
        uniqueList.add((Integer) numbers.get(i));
      }
    }
    return uniqueList;
  }
}
