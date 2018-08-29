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


    //System.out.println(uniqIP());
  }
  List<String> lines = new ArrayList<>();

  public static String findIPs() {
    List<String> lines = new ArrayList<>();
    String IPAddress = "";
    HashMap<String, Integer> uniqueIPs = new HashMap<>();
    try {
      Path filePath = Paths.get("assets/log.txt");
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("file is not found or not readable, sorry");
    }
    return null;
  }

    public static ArrayList uniqIP(List<String> lines) {
      ArrayList<String> IPs = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        String IP = lines.get(i).split("   ")[1];
        if (!IPs.contains(IP)) {
          IPs.add(IP);
        }
      }
      return IPs;
    }
//    for (int i = 0; i < lines.size() ; i++) {
//      IPAddress = lines.get(i).split("   ")[1];
//      if (!uniqueIPs.containsKey(IPAddress)) {
//        uniqueIPs.put(IPAddress, 1);
//      } else {
//        //Integer temp = uniqueIPs.get(IPAddress);
//        uniqueIPs.put(IPAddress, uniqueIPs.get(IPAddress) + 1);
//      }
//    }
//    for (String everyUniqueIp : uniqueIPs.keySet()) {
//      IPAddress = everyUniqueIp;
//
//    }
//    return IPAddress;
//  }
}
