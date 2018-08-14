import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    String path = "assets/my-file.txt";
    String word = "newLine";
    int number  = 3;
    fileWriter(path, word, number);
  }

  public static void fileWriter(String path, String word, int number) {
    Path path2 = Paths.get(path);
    List<String> writeThis = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      writeThis.add(word);
      System.out.println();
    } try {
      Files.write(path2, writeThis, StandardOpenOption.APPEND);
      for (String line : Files.readAllLines(path2)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("File is not writable");
    }
  }
}
