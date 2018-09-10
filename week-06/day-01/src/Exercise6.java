import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

  public static void main(String[] args) {
    /**
     * write a stream expression to find the strings which starts with A and ends with I in the following array:
     */
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    List<String> citiesStartsAEndsI =
      cities.stream()
        .filter(s -> s.startsWith("A") && s.endsWith("I"))
        .collect(Collectors.toList());
    System.out.println("cities, which start with A & end with I, found with stream");
    System.out.println(citiesStartsAEndsI);

    System.out.println();
    System.out.println("cities, which start with A & end with I, found with method");
//    findCitiesStartingWithA(cities);
  }

//  private static void findCitiesStartingWithA(List cities) {
//    String citiesCommaSeparated = String.join(", ", cities);
//    String[] cityArray = citiesCommaSeparated.split(",");
//    for (int i = 0; i < cityArray.length ; i++) {
//      if (cityArray[i].charAt(0);
//
//    }
//  }
}
