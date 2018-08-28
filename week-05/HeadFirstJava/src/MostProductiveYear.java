import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostProductiveYear {
  public static void main(String[] args) {
    //nameOfFilmStudio - is the path for files
    //either "assets/marvel.csv"
    //or "assets/paramount.csv"
    String path1 = "assets/paramount";
    String path2 = "assets/marvel";
    String name1 = "paramount";
    String name2 = "marvel";
    String name3 = "ghibli";
    String path3 = "assets/ghibli";
    System.out.println(mostProductiveYear(name1, path1));
    System.out.println(mostProductiveYear(name2, path2));
    System.out.println(mostProductiveYear(name3, path3));


  }

  static String mostProductiveYear(String filename, String path) {
    List<String> linesOfInputFile = null;
    ArrayList<String> yearList = new ArrayList<>();
    try {
      linesOfInputFile = Files.readAllLines(Paths.get(path + ".csv"));
    } catch (IOException e) {
      return "Cannot find studio, please try again later.";
    }
    Map<String, Integer> map = new HashMap<>();
    String year = null;
    for (String line : linesOfInputFile) {
      year = line.split(",")[1];
      if (map.get(year) == null) {
        map.put(year, 1);
      } else {
        map.put(year, map.get(year) + 1);
      }
    }
    
    return "The " + filename + " has made the most movies in " + stringOfLargest;
  }
}
