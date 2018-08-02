import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number");

    int rNumber = input.nextInt();

    if (rNumber <= 0) {
      System.out.println("Not enough");
    }
    else if (rNumber == 1) {
      System.out.println("One");
    }
    else if (rNumber == 2) {
      System.out.println("Two");
    }
    else if (rNumber > 2) {
      System.out.println("A lot");
    }
  }
}
