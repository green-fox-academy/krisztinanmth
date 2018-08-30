import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    pleaseReverseOrder();
  }

  public static void pleaseReverseOrder() {
    try {
      Path filePath = Paths.get("assets/reversedOrder.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (int i = lines.size() - 1; i >= 0; i--) {
        for (int j = 0; j < lines.get(i).length(); j++) {
          System.out.print(lines.get(i).charAt(j));
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("file is not found or not readable, sorry");
    }
  }
}