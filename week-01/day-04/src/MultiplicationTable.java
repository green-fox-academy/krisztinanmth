import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number to view its multiplication table.");

    // declaring variables
    int multiTable = input.nextInt();
    int total;


    // for loop for multiplicationTable
    for (int i = 0; i <= 10; i++) {
      total = multiTable * i;
      System.out.println(multiTable + " x " + i + " = " + total);
    }
  }
}
