import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    List<String> myContent = new ArrayList<>();
    myContent.add("this should be the third line");
    try {// Required by Files.write(filePath, content)
      // Creates a new file if not exists and overwrites it's content
      // The elements of the content lists will become the lines of the file
      Path myPath = Paths.get("assets/my-file.txt");
      Files.write(myPath, myContent, StandardOpenOption.APPEND);
      //you need to put StandardOpenOption.APPEND here otherwise it just overwrites the file and not adds
      for (String line : Files.readAllLines(myPath)) {
        System.out.println(line);
      }
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}