import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number");
    double a = input.nextDouble();

    System.out.println("Please enter a number");
    double b = input.nextDouble();

    System.out.println("Please enter a number");
    double c = input.nextDouble();

    System.out.println("Please enter a number");
    double d = input.nextDouble();

    System.out.println("Please enter a number");
    double e = input.nextDouble();

    double Sum = (a + b + c + d + e);
    double Average = (a + b + c + d + e) / 5;

    System.out.println("Sum: " + Sum);
    System.out.println("Average: " + Average);

  }
}

