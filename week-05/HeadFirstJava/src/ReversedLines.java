import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    pleaseReverseLines();

  }

  public static void pleaseReverseLines() {
    try {
      Path filePath = Paths.get("assets/reversed.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size() ; i++) {
        for (int j = lines.get(i).length() - 1; j >= 0; j--) {
          System.out.print(lines.get(i).charAt(j));
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("file is not found or not readable, sorry");
    }
  }
}