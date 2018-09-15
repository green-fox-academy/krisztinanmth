import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *  The crash-incidents.csv file contains data of road crash-incidents.
 *  (id; location; surface type; surface condition; light condition; weather condition; crash date; year)
 *  Your task will be to count how many crash-incidents happened at good/bad
 *  weather conditions.
 *  Good weather conditions are CLOUDY and CLEAR.
 *  Bad weather conditions are RAIN, FREEZING RAIN, SNOW, FOG and SEVERE CROSSWINDS.
 *  So create the necessary method(s) that returns with the amount of crash-incidents.
 *  And print the return value to the console:
 *  The amount of crashes at good weather conditions: {amount}
 *  The amount of crashes at bad weather conditions: {amount}
 */

public class Crashes {
  public static void main(String[] args) {

    System.out.println(printBadWeatherCrashes());
    System.out.println(printGoodWeatherCrashes());

  }

  public static String printBadWeatherCrashes() {
    return String.format("The amount of crashes at bad weather conditions: {%d}\n", countAmountOfBadWeatherCrashes());
  }

  public static String printGoodWeatherCrashes() {
    return String.format("The amount of crashes at good weather conditions: {%d}\n", countAmountOfGoodWeatherCrashes());
  }


  public static int countAmountOfGoodWeatherCrashes() {
    List<String> lines = readFile();
    String[] splitLines;
    int sum = 0;
    for (String line : lines) {
      splitLines = line.split(";");
      if (splitLines[5].equals("CLOUDY") || splitLines[5].equals("CLEAR")) {
        sum ++;
      }
    }
    return sum;
  }

  public static int countAmountOfBadWeatherCrashes() {
    List<String> lines = readFile();
    String[] splitLines;
    int sum = 0;
    for (String line : lines) {
      splitLines = line.split(";");
      if (splitLines[5].equals("RAIN") || splitLines[5].equals("FREEZING RAIN") || splitLines[5].equals("SNOW") || splitLines[5].equals("FOG") || splitLines[5].equals("SEVERE CROSSWINDS")) {
        sum ++;
      }
    }
    return sum;
  }

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(Paths.get("assets/crash-incidents.csv"));
    } catch (IOException e) {
      System.err.println("the file is not found or readable");
    }
    return lines;
  }
}