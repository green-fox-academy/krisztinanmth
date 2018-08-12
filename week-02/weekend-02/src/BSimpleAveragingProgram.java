import java.util.Scanner;

public class BSimpleAveragingProgram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total = 0; //holds the sum of all the grades
    int grade;
    int average;
    int counter = 0;
    while (counter < 10) {
      grade = input.nextInt();
      total = total + grade;
      counter++;
    }
    average = total/10; //we divide it by 10 as we put in 10 numbers
    System.out.println("Your average is: " + average);
  }
}
