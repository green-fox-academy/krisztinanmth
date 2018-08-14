import javafx.scene.shape.Line;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP addresses.
    // Write a function that returns the GET / POST request ratio.
    Path path = Paths.get("assets/log.txt");
    List<String> unique = new ArrayList<>();
  }
//  public static ArrayList uniqueIPs(Path path, List unique) {
//    try {
//      for (String line : Files.readAllLines(path)) {
//      }
//    } catch (IOException e) {
//      System.out.println("the file can't be found");
//    }
//  } return;
}
