import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> listOfNumbers = new ArrayList<>();



  public int sumOfTheElements() {
    int sum = 0;
    for (int i = 0; i < listOfNumbers.size() ; i++) {
      sum += listOfNumbers.get(i);
    }
    return sum;
  }
}
