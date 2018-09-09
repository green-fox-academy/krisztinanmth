import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Exercise10 {
  public static List<Fox> addFoxes() {
    return Arrays.asList(
      new Fox("yoki", "red fox", "red"),
      new Fox("largeEars", "fennec fox", "yellowish"),
      new Fox("kriszta", "aloplex", "green"),
      new Fox("farenheit", "arctic fox", "white"),
      new Fox("shiny", "silver fox", "greyish"),
      new Fox("arctic", "marble fox", "black&white"),
      new Fox("lenny", "pallida", "green"),
      new Fox("trevor", "pallida", "green")
    );
  }

  public static void main(String[] args) {
    /**
     * create a fox class with 3 properties(name, type, color)
     * fill a list with at least 5 foxes, it's up to you how you name/create them!
     * write a stream expression to find the foxes with green color!
     * write a stream expression to find the foxes with green color and pallida type!
     */
    List<Fox> foxes = addFoxes();

    List<String> foxesWithGreenColor =
      foxes.stream()
            .filter(fox -> fox.getColor().equals("green"))
            .map(Fox::getName)
            .collect(Collectors.toList());
    System.out.println(foxesWithGreenColor);

    List<String> foxesWithGreenColorAndPallidaType =
      foxes.stream()
            .filter(fox -> fox.getColor().equals("green"))
            .filter(fox -> fox.getType().equals("pallida"))
            .map(Fox::getName)
            .collect(Collectors.toList());
    System.out.println(foxesWithGreenColorAndPallidaType);

    Map<String, List<Fox>> mapOfGreenFoxes =
      foxes.stream()
            .filter(fox -> fox.getColor().equals("green"))
            .collect(groupingBy(Fox::getColor));
    mapOfGreenFoxes.forEach((k, v) -> System.out.println(k + " -" + v));

    Map<String, List<Fox>> mapOfGreenPallidaFoxes =
      foxes.stream()
            .filter(fox -> fox.getColor().equals("green") && fox.getType().equals("pallida"))
            .collect(groupingBy(Fox::getType));
    mapOfGreenPallidaFoxes.forEach((type, map) -> System.out.println(type + " -" + map));
  }
}
