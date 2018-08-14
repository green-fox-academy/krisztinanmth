import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class IOFileReview {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please give me a filename");
    String filename = scanner.nextLine();
    Path path = Paths.get(filename);
    List<String> lines = null;
    try {
      lines = Files.readAllLines(path),
    } catch (IOException e) {
      //IO Exceptions means there is in an input or output exception
      e.printStackTrace();
    }
    for (String line : lines) {
      System.out.println(line);
    }
  }
}
