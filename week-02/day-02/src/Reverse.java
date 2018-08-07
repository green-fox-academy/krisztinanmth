import java.util.*;

public class Reverse {

  public static void main(String[] args) {

    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(reverse(reversed));
    }

    public static String reverse(String planets) {

      String result = " ";

      for (int i = planets.length() - 1; i >= 0; i--) {
        result += planets.charAt(i);
      }
      return result;
    }
  }

