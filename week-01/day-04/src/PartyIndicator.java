import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the number of girls coming to the party");
    int girls = input.nextInt();

    System.out.println("Please enter the number of boys coming to the party");
    int boys = input.nextInt();

    if ((girls == boys) && (girls + boys >= 20)) {
      System.out.println("The party is excellent");
    }
    else if ((girls != boys) && (girls + boys >= 20) && girls > 0) {
      System.out.println("Quite cool party");
    }
    else if (girls + boys < 20) {
      System.out.println("Average party");
    }
    else if (girls == 0) {
      System.out.println("Sausage party!");
    }
  }
}
