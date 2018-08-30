import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    Path myPath = Paths.get("assets/encodedLines.txt");
    Path destPath = Paths.get("assets/decryptedLines.txt");
    List<String> decryptedContent = new ArrayList<>();
    try {
      List<String> content = Files.readAllLines(myPath);
      for (String line : content) {
        String decryptedLine = "";
        for (int i = 0; i < line.length(); i++) {
          String decodedCharacter = " ";
          if (line.charAt(i) != ' ') {
            int encodedAsscii = line.charAt(i);
            decodedCharacter = String.valueOf(Character.toChars(encodedAsscii - 1));
          }
          decryptedLine += decodedCharacter;
        }
        decryptedContent.add(decryptedLine);
      }
      Files.write(destPath, decryptedContent);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}