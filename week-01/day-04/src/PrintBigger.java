import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number");
    double a = input.nextDouble();

    System.out.println("Please enter another number");
    double b = input.nextDouble();

    if (a > b) {
      System.out.println("The bigger number is " + a);
    }
    else {
      System.out.println("The bigger number is: " + b);
    }
  }
}
