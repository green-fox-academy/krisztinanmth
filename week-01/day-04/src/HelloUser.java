

import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your name");

    String userName = input.next();

    System.out.println("Hello " + userName);

  }
}
