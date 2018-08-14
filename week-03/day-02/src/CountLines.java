import java.io.IOException;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {
  public static void main(String[] args) {
    Path path = Paths.get("assets/my-file.txt");
    numberOfLines(path);
  }

  public static int numberOfLines(Path path) {
    try {
    List<String> lines = Files.readAllLines(path);
    return lines.size();
    } catch (IOException e) {
      System.out.println(" the file is not readable ");
      return 0;
    }
  }
}

