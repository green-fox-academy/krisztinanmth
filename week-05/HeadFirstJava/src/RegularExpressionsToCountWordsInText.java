import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsToCountWordsInText {
  public static void main(String[] args) {
    System.out.println(findFiveDigitWords());

  }

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      //Path filePath = Paths.get("assets/williamBlake.txt");
      lines = Files.readAllLines(Paths.get("assets/williamBlake.txt"));
    } catch (IOException e) {
      System.out.println("file is not found or readable, sorry");
    }
    return lines;
  }

  public static List<String> findFiveDigitWords() {
    List<String> lines = readFile();
    List<String> fiveDigitWords = new ArrayList<>();
    Pattern pattern = Pattern.compile("\\b[a-zA-Z]{5}\\b");
    for (String word : lines) {
      Matcher matcher = pattern.matcher(word);
      while (matcher.find()) {
        fiveDigitWords.add(matcher.group());
      }
    }
    return fiveDigitWords;
  }
}
