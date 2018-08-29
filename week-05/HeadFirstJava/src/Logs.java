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
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.
    System.out.println(findIPs());

  }

  public static List<String> findIPs() {
    List<String> lines = new ArrayList<>();
    String ipAddress;
    List<String> uniqueIPAddress = new ArrayList<>();
    HashMap<String, Integer> uniqueIPs = new HashMap<>();
    try {
      Path filePath = Paths.get("assets/log.txt");
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("file is not found or not readable, sorry");
    }
    for (int i = 0; i < lines.size(); i++) {
      ipAddress = lines.get(i).split("   ")[1];
      if (!uniqueIPs.containsKey(ipAddress)) {
        uniqueIPs.put(ipAddress, 1);
      } else {
        //Integer temp = uniqueIPs.get(IPAddress);
        uniqueIPs.put(ipAddress, uniqueIPs.get(ipAddress) + 1);
      }
    }
    for (String key : uniqueIPs.keySet()) {
      if ((uniqueIPs.get(key) == 1)) {
        uniqueIPAddress.add(key);
      }
    }
    return uniqueIPAddress;
  }
}
