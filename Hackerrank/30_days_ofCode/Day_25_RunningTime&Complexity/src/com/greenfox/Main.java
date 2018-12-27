package com.greenfox;

import java.util.*;

public class Main {
  // i separated isPrime() into a function below =>
  static boolean isPrime(int number) {
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner scanner = new Scanner(System.in);
    int testCases = scanner.nextInt();
    for (int i = 0; i < testCases; i++) {
      int numberToTest = scanner.nextInt();

      if (numberToTest >= 2 && isPrime(numberToTest)) {
        System.out.println("Prime");
      } else {
        System.out.println("Not prime");
      }
    }
    scanner.close();
  }
}


