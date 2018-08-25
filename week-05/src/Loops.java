import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {

    // Create a program that writes this line 9 times:
    // "I won't cheat on the exam!"
    String line = "i won't cheat on the exam";
    int counter = 1;
    for (int i = 0; i < 9 ; i++) {
      System.out.println(counter + " - " + line);
      counter ++;
    }
    System.out.println();

    // Create a program that prints all the even numbers between 0 and 66
    for (int i = 0; i <= 66; i++) {
      if(i % 2 == 0) {
        System.out.println(i);
      }
    }
    System.out.println();

    //multiplication table
    Scanner myScanner = new Scanner(System.in);
    System.out.println("please provide the number: ");
    int number = myScanner.nextInt();
    for (int i = 0; i <= 10 ; i++) {
      int multiple = number * i;
      System.out.println(i + " * " + number + " = " + multiple);
    }
    System.out.println();

    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5
    Scanner myScanner2 = new Scanner(System.in);
    System.out.println("please provide two numbers, the second one should be bigger");
    int firstNumber = myScanner2.nextInt();
    int secondNumber = myScanner2.nextInt();
    if (firstNumber > secondNumber) {
      System.out.println("the second number should be bigger ");
    } else {
      for (int i = firstNumber; i < secondNumber ; i++) {
        System.out.println(i);
      }
    }
    System.out.println();
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.
    for (int i = 1; i <= 100 ; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("fizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("fizz");
      } else if (i % 5 == 0) {
        System.out.println("buzz");
      } else {
        System.out.println(i);
      }
    }
    System.out.println();
  }
}
