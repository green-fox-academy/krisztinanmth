import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    System.out.println(findIPs());
  }

  public static String findIPs() {
    List<String> lines;
    String IPAddress = "";
    int myIndex;
    HashMap<String, Integer> uniqueIPs = new HashMap<>();
    try {
      Path filePath = Paths.get("assets/log.txt");
      lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size() ; i++) {
        myIndex = lines.get(i).indexOf("   ");
        IPAddress = lines.get(i).substring(myIndex, myIndex + 14);
      }
    } catch (Exception e) {
      System.out.println("file is not found or not readable, sorry");
    }

    return IPAddress;
  }
}
