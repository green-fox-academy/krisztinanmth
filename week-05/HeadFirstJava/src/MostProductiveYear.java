import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostProductiveYear {
  public static void main(String[] args) {
    System.out.println(mostProductiveYear("marvel"));
    System.out.println(mostProductiveYear("paramount"));
    System.out.println(mostProductiveYear("ghibli"));
  }

  public static String mostProductiveYear(String studioName) {
    String shoutThis;
    List<String> lines  = new ArrayList<>();
    Map<String, Integer> yearCount = new HashMap<>();
    String mostProductiveYear = "";
    if (studioName.equals("marvel") || studioName.equals("paramount")) {
      try {
        Path filePath = Paths.get("assets/" + studioName + ".csv");
        lines = Files.readAllLines(filePath);
      } catch (Exception e) {
        System.out.println("sorry, the file is not found or not readable");
      }
      for (int i = 0; i < lines.size(); i++) {
        String yearToCheck = lines.get(i).split(",")[1];
        if (!yearCount.containsKey(yearToCheck)) {
          yearCount.put(yearToCheck, 1);
        } else {
          Integer temp = yearCount.get(yearToCheck);
          yearCount.put(yearToCheck, temp + 1);
        }
      }
      int value = 0;
      for (String key : yearCount.keySet()) {
        if (yearCount.get(key) > value ) {
          mostProductiveYear = key;
          value = yearCount.get(key);
        }
      }
      shoutThis = studioName + " has made the most movies in ";
      shoutThis = shoutThis + mostProductiveYear;
    } else {
      shoutThis = "cannot find studio, please try again later.";
    }
    return shoutThis;
  }
}










