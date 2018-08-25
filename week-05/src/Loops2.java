import java.util.Scanner;

public class Loops2 {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("please provide how many lines you would like to see");
    int rows = scanner.nextInt();
    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

    for (int i = 0; i < 5 ; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(i + " " + j);
        System.out.println();
      }
    }

    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("please provide number of lines for pyramid: ");
    int n = scanner2.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("& ");
      }
      System.out.println();
    }
  }
}
