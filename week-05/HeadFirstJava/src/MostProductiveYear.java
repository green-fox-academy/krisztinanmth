import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostProductiveYear {
  /**
   * Write a method that helps you find the most productive year for a film studio.
   * The method should take one argument, which is the name of the film studio.
   * The method should try to open the related data file named `studioname`.csv,
   * which is a comma separated file with 3 columns: name of the movie, release year, director
   *
   *  - If we do not have any data about the studio, the method should return an error message.
   *  - If we have found data, the method should return an information message about the most productive year for that studio.
   *
   * Examples:
   *
   * If we call the method with 'marvel':
   * should return 'marvel has made the most movies in 2017.'
   *
   * If we call the method with 'ghibli':
   * should print 'Cannot find studio, please try again later.'
   *
   * Hint:
   *  - You can find some example files in this folder (marvel.csv and paramount.csv)
   *  - Most productive year: The year in which the studio has made the most movies.
   */
  public static void main(String[] args) {
    System.out.println(mostProductiveYear("paramount"));
  }

  public static String mostProductiveYear(String name) {
    List<String> lines;
    int myIndex;
    String year = "";
    HashMap<String, Integer> mostProductiveYear = new HashMap<>();
    try {
      Path filePath = Paths.get("assets/" + name + ".csv");
      lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size() ; i++) {
        //i need lines.get(i) before .indexOf to get the i-edik :) line - so first the first then second then etc...
        myIndex = lines.get(i).indexOf("19");
        //i need the if because in some cases the year starts with 19, in other cases it starts with 20
        if (myIndex == -1) {
          myIndex = lines.get(i).indexOf("20");
        }
        year = lines.get(i).substring(myIndex, myIndex + 4);
//        if (!mostProductiveYear.containsKey(year)) {
//          mostProductiveYear.put();
//        }
      }
    } catch (Exception e) {
      System.out.println("file is not found or not readable, sorry");
    }

    return year;
  }
}