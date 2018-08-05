import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a whole number.");
    int smallNumber = input.nextInt();

    System.out.println("Please enter a bigger number.");
    int bigNumber = input.nextInt();

    if (bigNumber <= smallNumber) {
        System.out.println("Please enter a bigger number than your first number. Thank you.");
    }

    for (int i = smallNumber; i <= bigNumber; i++) {
        System.out.println(i);
    }
  }
}
