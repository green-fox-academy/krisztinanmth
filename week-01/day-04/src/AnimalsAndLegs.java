import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please provide number of chickens");

    int chickens = input.nextInt();

    System.out.println("Please provide number of pigs");

    int pigs = input.nextInt();

    int legs = (chickens * 2) + (pigs * 4);

    System.out.println(legs);

  }
}
