import java.util.Scanner;

public class PractiseMain {
  public static void main(String[] args) {
    String name = "krisztina";
    System.out.println("hello " + name);


    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double codingHDaily = 6;
    int semesterLength = 17;
    double workingDays = 5;
    double codingHoursInSemester = codingHDaily * semesterLength * workingDays;
    System.out.println(codingHoursInSemester);
    int workingHoursInSemester = 52 * 17;
    double codingHPercentage = (codingHoursInSemester / workingHoursInSemester * 100);
    System.out.println(codingHPercentage);
    System.out.println();

    int c = 12;
    System.out.println(c++); // Prints 12
    System.out.println(c); // Prints 13

    int d = 12;
    System.out.println(++d); // Prints 13
    System.out.println(d); // Prints 13

    int e = 12;
    System.out.println(e--); // Prints 12
    System.out.println(e); // Prints 11

    int f = 12;
    System.out.println(--f); // Prints 11
    System.out.println(f); // Prints 11

    int g = 12;
    g *= 3;
    System.out.println(g); // Prints 36

    int h = 12;
    h /= 3;
    System.out.println(h); // Prints 4

    int i = 12;
    i %= 7;
    System.out.println(i); // Prints 5
    System.out.println();

    int a = 123;
    int b = 526;

    a= a + b;
    b= a- b;
    a= a-b;

    System.out.println(a);
    System.out.println(b);
    System.out.println();

    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    int sideA = 30;
    int sideB = 50;
    int sideC = 70;

    int surfaceArea = 2 * sideA + 2 * sideB + 2 * sideC;
    int volume = sideA * sideB * sideC;

    System.out.println(surfaceArea);
    System.out.println(volume);
    System.out.println();

    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    int secondsInADay = 24 * 60 * 60;
    int timePast = 14 * 60 * 60 + 34 * 60 + 42;
    System.out.println("we have " + secondsInADay + " seconds every day");
    System.out.println("seconds left from today : " + (secondsInADay - timePast));
    System.out.println();

    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner myScanner = new Scanner(System.in);
    System.out.println("please enter the number of chickens the farmer has: ");
    int chickens = myScanner.nextInt();
    System.out.println("please enter the number of pigs the farmer owns: ");
    int pigs = myScanner.nextInt();
    int legs = (chickens * 2) + (pigs * 4);
    System.out.println("the animals have " + legs + " legs altogether");
    System.out.println();

    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    Scanner myScanner2 = new Scanner(System.in);
    System.out.println("please provide 5 numbers");
    double firstNumber = myScanner2.nextDouble();
    double secondNumber = myScanner2.nextDouble();
    double thirdNumber = myScanner2.nextDouble();
    double fourthNumber = myScanner2.nextDouble();
    double fifthNumber = myScanner2.nextDouble();

    double sumOfNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
    double averageOfNumbers = sumOfNumbers / 5;
    System.out.println("sum of numbers: " + sumOfNumbers);
    System.out.println("average of numbers: " + averageOfNumbers);
    System.out.println();


    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
    Scanner myScanner3 = new Scanner(System.in);
    System.out.println("please provide a number so i can decide if it's odd or even");
    int number = myScanner3.nextInt();

    if (number % 2 == 0) {
      System.out.println("the number you provided is even");
    } else {
      System.out.println("the number you provided is odd");
    }
    System.out.println();


    // Write a program that asks for two numbers and prints the bigger one
    Scanner myScanner4 = new Scanner(System.in);
    System.out.println("please provide 2 numbers, so i can tell you which is the bigger one");
    double isBigger1 = myScanner4.nextDouble();
    double isBigger2 = myScanner4.nextDouble();

    if (isBigger1 > isBigger2) {
      System.out.println(isBigger1);
    } else {
      System.out.println(isBigger2);
    }
    System.out.println();
  }
}
