import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    pleaseDecryptText();
  }

  public static void pleaseDecryptText() {
    List<String> content = new ArrayList<>();
    try {
      Path filePath = Paths.get("assets/doubled.txt");
      content = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("file is not found or not readable, sorry");
    }
    for (int i = 0; i < content.size() ; i++) {
      for (int j = 0; j < content.get(i).length(); j += 2) {
        System.out.print(content.get(i).charAt(j));
      }
      System.out.println();
    }
  }
}


