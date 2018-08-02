import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter kilometers");

    double kilometers = input.nextDouble();

    double miles = kilometers * 0.621;

    System.out.println(miles);

  }
}
