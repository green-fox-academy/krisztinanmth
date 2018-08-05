import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter a whole number");
      int rows = scanner.nextInt();
      String asterix = "*" + " ";

      for(int i = 1; i <= rows; i++) {
          asterix += ("*" + " ");
          System.out.println(asterix);
      }
    }
  }

