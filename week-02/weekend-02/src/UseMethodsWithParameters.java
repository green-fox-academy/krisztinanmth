import java.util.Scanner;

public class UseMethodsWithParameters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    tunaBucky tunaObject = new tunaBucky();
    System.out.println("Enter your name here: ");
    String name = input.nextLine();
    tunaObject.simpleMeassage(name);
  }
}
