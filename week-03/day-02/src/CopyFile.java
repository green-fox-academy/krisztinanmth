import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    Path source = Paths.get("assets/my-file.txt");
    Path copied = Paths.get("assets/copied-my-file.txt");
    copyFile(source, copied);
  }
  public static void copyFile(Path source, Path copied) {
    try {
      Files.copy(source, copied, StandardCopyOption.REPLACE_EXISTING);
      for (String line : Files.readAllLines(copied)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("The file is not found");
    }
  }
}
