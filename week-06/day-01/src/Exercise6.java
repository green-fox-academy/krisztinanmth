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
    System.out.println(findCitiesStartingWithA(cities));
  }

  private static List<String> findCitiesStartingWithA(List<String> cities) {
    List<String> sortedCities = new ArrayList<>();
    for (int i = 0; i < cities.size() ; i++) {
      if (cities.get(i).startsWith("A") && cities.get(i).endsWith("I")) {
        sortedCities.add(cities.get(i));
      }
    }
    return sortedCities;
  }
}
