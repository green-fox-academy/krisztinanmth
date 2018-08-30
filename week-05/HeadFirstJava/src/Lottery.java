import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {
  public static void main(String[] args) {
    System.out.println(mostCommonLotteryNumbers());
  }

  private static List<String> mostCommonLotteryNumbers() {
    List<String> lines = new ArrayList<>();
    Map<String, Integer> mostCommonNumbers = new HashMap<>();
    try {
      Path path = Paths.get("assets/lottery.csv");
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("file is not found or not readable, sorry");
    }
    for (int i = 0; i < lines.size() ; i++) {
      String[] splitLines = lines.get(i).split(";");
      for (int j = 1; j <= 5; j++) {
        String lottoNums = splitLines[splitLines.length - j];
        if (!mostCommonNumbers.containsKey(lottoNums)) {
          mostCommonNumbers.put(lottoNums, 1);
        }
        else {
          mostCommonNumbers.put(lottoNums, mostCommonNumbers.get(lottoNums) + 1);
        }
      }
    }
    String topNums = "";
    List<String> lottoTopFive = new ArrayList<>();
    while (lottoTopFive.size() < 5) {
      int temp = 0;
      for (String eachNumber : mostCommonNumbers.keySet()) {
        if (mostCommonNumbers.get(eachNumber) > temp) {
          temp = mostCommonNumbers.get(eachNumber);
          topNums = eachNumber;
        }
      }
      lottoTopFive.add(topNums);
      mostCommonNumbers.remove(topNums);
    }
    return lottoTopFive;
  }
}
